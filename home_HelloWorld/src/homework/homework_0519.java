package homework;

public class homework_0519 {
	public static void main(String[] args) {
		int[][] numAry = new int[3][5];
		int sum0 = 0;
		double avg0 = 0;
		int sum1 = 0;
		double avg1 = 0;
		int sum2 = 0;
		double avg2 = 0;
		
		// 임의의 숫자 생성.
		for (int outer = 0; outer < numAry.length; outer++) {
			for (int inner = 0; inner < numAry[outer].length; inner++) {
				numAry[outer][inner] = (int) (Math.random() * 100);

			}
			
		}
		for (int inner = 0; inner < numAry[0].length; inner++) {
			sum0 += numAry[0][inner];
		}
		avg0 = 1.0 * sum0 / 5;
		
		for (int inner = 0; inner < numAry[1].length; inner++) {
			sum1 += numAry[1][inner];
		}
		avg1 = 1.0 * sum1 / 5;
		
		for (int inner = 0; inner < numAry[2].length; inner++) {
			sum2 += numAry[2][inner];
		}
		avg2 = 1.0 * sum2 / 5;
		
		System.out.printf("numAry[%d]의 평균은 %.2f\n", 0, avg0);
		System.out.printf("numAry[%d]의 평균은 %.2f\n", 1, avg1);
		System.out.printf("numAry[%d]의 평균은 %.2f", 2, avg2);
		
	}
}
