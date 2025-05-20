package com.yedam.board;

import java.util.Scanner;

public class BoardExe {
	// 필드
	private Board[] boards;
	private Scanner scn = new Scanner(System.in);
	private int bno = 2; // 배열의 인덱스에 사용하기 위한 int 값

	// 생성자
	public BoardExe() {
		boards = new Board[100];
		boards[0] = new Board(10, "날씨가 좋습니다.", "오늘 기온이 30도입니다", "홍길동");
		boards[1] = new Board(11, "자바가 힘들어요.", "놉 자바는 힘들지 않아요", "김민규");
	}

	// 메소드
	void execute() {
		boolean run = true;
		while (run) {
			System.out.println("--------------------------------------");
			System.out.println("   1.추가  2.수정  3.삭제  4.목록  5.종료");
			System.out.println("--------------------------------------");
			System.out.print("선택>> ");
			int selectNo = Integer.parseInt(scn.nextLine());
			switch (selectNo) {
			case 1: // 추가
				addBoard();
				break;
			case 2: // 수정
				break;
			case 3: // 삭제
				break;
			case 4: // 목록
				boardList();
				break;
			case 5: // 종료
				System.out.println("end of prog.");
				run = false;
			default:
				System.out.println("메뉴를 다시 선택하세요");
				
			} // end of switch
		} // end of while
	} // end of execute

	// 기능
	// "글번호를 입력하세요>> "
	// "제목을 입력하세요>> "
	// "내용을 입력하세요>> "
	// "작성자를 입력하세요>> "
	// "추가성공 / 추가실패"
	void addBoard() {
		System.out.println("글번호를 입력하세요>> ");
		int no = Integer.parseInt(scn.nextLine());

		System.out.println("제목을 입력하세요>> ");
		String title = scn.nextLine();
		
		System.out.println("내용을 입력하세요>> ");
		String content = scn.nextLine();

		System.out.println("작성자를 입력하세요>> ");
		String writer = scn.nextLine();
		
		Board board = new Board(no, title, content, writer);
		
		boards[bno++] = board;
		System.out.println("추가성공");

	} // end of addBoard
	
	
	//  글번호       제목     작성자
	//===========================
	//   1      날씨가 좋아요  홍길동
	//   2      클래스 멋짐요  김민규
	//   3      자바는 어려움  박석민
	//   4      그래도 열심히  김민규
	// --------------------------
	// 상세보기: 글번호입력, 메뉴로 이동(q)
	// --------------------------
	void boardList() {
		System.out.println(" 글번호 |     제목     | 작성자 ");
		for ( int i = 0; i < boards.length; i++) {
			if (boards[i] != null) {
				boards[i].showInfo();
			} 
			System.out.println();
		}
		System.out.println("--------------------------");
		System.out.println("상세보기: 글번호입력, 메뉴로 이동(q)");
		System.out.println("--------------------------");
		
		String str = scn.nextLine();
		
		if(str.equals("q")) {
			return;
		} else {
			int no = Integer.parseInt(str);
			for (int i = 0; i < boards.length; i++) {
				if (boards[i] != null && boards[i].getBoardNo() == no) {
					boards[i].showAllInfo();
				}
			}
		}
		
		System.out.println();
	} // end of boardList()
	
	
}
