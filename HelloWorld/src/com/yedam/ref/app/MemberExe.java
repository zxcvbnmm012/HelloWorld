package com.yedam.ref.app;

import java.util.Scanner;

/*
 * 회원 추가, 수정, 삭제, 조회 기능
 * 1) 추가 
 *   - 아이디, 이름, 전화번호, 포인트
 * 2) 수정
 *   - 아이디를 입력받아 전화번호를 바꿈
 * 3) 삭제
 *   - 삭제할 아이디를 입력받아 삭제
 *   - 삭제할 아이디가 없으면 '찾는 아이디가 없습니다'
 * 4) 조회
 *   - 이름으로 조회  
 */
public class MemberExe {
	static Member[] members = null;
	
	public static void main(String[] args) {
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("1.회원추가 2.수정 3.삭제 4.조회 5.종료");
			System.out.println("선택>> ");
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if (selectNo == 2 || selectNo == 3 || selectNo == 4) {
				if (members == null) {
					System.out.println("회원정보를 추가하세요");
					continue;
				}
			}
			
			if (selectNo == 1) {
				members = new Member[100];
				Member member = new Member();
				System.out.println("추가할 회원 정보를 입력하세요");
				System.out.println("아이디>> ");
				String id = scanner.nextLine();
				member.id = id;
				
				System.out.println("이름>> ");
				String name = scanner.nextLine();
				member.name = name;
				
				System.out.println("전화번호>> ");
				String phone = scanner.nextLine();
				member.phone = phone;
				
				System.out.println("포인트>> ");
				int point = Integer.parseInt(scanner.nextLine());
				member.point = point;
				System.out.println(members.length);
				
				
				members[] = member;

				
				
			} // end of (selectNo == 1)
			
			else if(selectNo == 2) {
				System.out.println("전화번호를 수정할 아이디를 입력하세요\n>> ");
				String id2 = scanner.nextLine();
				for (int i = 0; i < members.length; i++) {
					System.out.println(members[i].id);
					if (id2.equals(members[i].id)) {
						System.out.printf("%s님의 전화번호를 수정하겠습니다\n 새로운 전화번호를 입력해주세요\n>> ", members[i].id);
						String nextphone = scanner.nextLine();
						members[i].phone = nextphone;
					} else {
						System.out.println("찾는 회원이 없습니다");
						continue;
					}
					
				}
			} // end of (selectNo == 2)
			
			else if(selectNo == 3) {
				System.out.println("삭제할 아이디를 입력하세요\n>> ");
				String id3 = scanner.nextLine();
				for (int i = 0; i < members.length; i++) {
					if (id3.equals(members[i].id)) {
						System.out.printf("%s님의 회원정보를 삭제하겠습니다\n", members[i].id);
						members[i].id = null;
						members[i].name = null;
						members[i].phone = null;
						members[i].point = 0;
					} else {
						System.out.println("찾는 회원이 없습니다");
						continue;
					}
				}
				
			} // end of (selectNo == 3)
			
			else if(selectNo == 4) {
				System.out.println("조회할 이름을 입력하세요\n>> ");
				String id4 = scanner.nextLine();
				System.out.println(members.length);
				for ( int i = 0; i < members.length; i++) {
					if ( id4.equals(members[i].name)) {
						System.out.printf("%s님의 회원정보입니다\n아이디: %s, 이름: %s, 전화번호: %s, 포인트: %d\n", members[i].name, members[i].id, members[i].name, members[i].phone, members[i].point);
						break;
					} else {
						System.out.println("찾는 회원이 없습니다");
						continue;
					}
				}
			} // end of (selectNo == 4)
			
			else if(selectNo == 5) {
				System.out.println("종료하겠습니다");
				run = false;
			}
			
		}
	} // end of main
} // end of class
