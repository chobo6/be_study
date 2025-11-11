package be_study.quiz;

public class Quiz19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1
		int[][] numArray = new int[4][4];
		int num=1;
//		for(int i=0; i<4; i++) {
//			for(int j=0; j<4; j++) {
//				numArray[i][j] = num;
//				num++;
//			}
//		}
//		for(int i=0; i<4; i++) {
//			for(int j=0; j<4; j++) {
//				System.out.printf("%2d ",numArray[i][j]);
//			}
//			System.out.println();
//		}
		
		// 2
//		for(int i=0; i<4; i++) {
//			for(int j=0; j<4; j++) {
//				numArray[i][j] = num;
//				num++;
//			}
//		}
//		for(int i=0; i<4; i++) {
//			for(int j=0; j<4; j++) {
//				System.out.printf("%2d ",numArray[j][i]);
//			}
//			System.out.println();
//		}
		
		// 3
//		for(int i=3; i>=0; i--) {
//			for(int j=3; j>=0; j--) {
//				numArray[i][j] = num;
//				num++;
//			}
//		}
//		for(int i=0; i<4; i++) {
//			for(int j=0; j<4; j++) {
//				System.out.printf("%2d ",numArray[i][j]);
//			}
//			System.out.println();
//		}
		
		// 4
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				numArray[i][j] = num;
				num++;
			}
		}
		for(int i=3; i>=0; i--) {
			for(int j=3; j>=0; j--) {
				System.out.printf("%2d ",numArray[j][i]);
			}
			System.out.println();
		}
	}

}
