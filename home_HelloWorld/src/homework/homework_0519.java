package homework;

public class homework_0519 {
	public static void main(String[] args) {
		int[][] numAry = new int[3][5];

		// 임의의 숫자 생성.
		for (int outer = 0; outer < numAry.length; outer++) {
			for (int inner = 0; inner < numAry[outer].length; inner++) {
				numAry[outer][inner] = (int) (Math.random() * 100);

			}
			
		}
		
		for (int outer = 0; outer < numAry.length; outer++) {
			int sum = 0;
			for (int inner = 0; inner < numAry[outer].length; inner++) {
				sum += numAry[outer][inner];
			}
			double avg = 1.0 * sum / numAry[outer].length;
			System.out.printf("numAry[%d]의 평균은 %.2f\n", outer, avg);
		}
		
	}
}
