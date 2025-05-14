package com.yedam;

public class JSexe {
	public static void main(String[] args) {
		
		test2();
	
	} // end of main()
	

	
	
// test()
	public static void test() {    // main 에서 test 함수를 호출해서 실행
		int sum = 0;
		// 1 ~ 10 까지의 누적 반복문
		for (int i = 1 ; i <= 10 ; i++) {
			if (i % 2 == 1) { // 홀수 : 1, 3, 5, 7, 9
				sum += i;	
			}
		} 
		System.out.println("결과: " + sum);
		
	} // end of test()
	
	
	
	
// test2()	
	public static void test2( ) {
		// 임의의 수를 생성 : 1~100 사이의 임의의 값 생성
				int sum = 0;
				for(int i = 1 ; i <= 5 ; i++) {
					int result = (int)(Math.random() * 100) + 1; // 1 <= x < 11
					// Math.random() : 0 <= x < 1 범위의 실수를 생성하는 메소드
					// 실수를 생성하므로 int 타입으로 casting 필요
					sum += result;
				}
				System.out.println("결과: " + sum);
	}
	
	
} // end of class
