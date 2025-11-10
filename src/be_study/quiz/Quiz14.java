package be_study.quiz;
import java.util.Scanner;

public class Quiz14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// 1
//		int[] numArray = new int[5];
//		for(int i=0; i<5; i++) {
//			numArray[i] =  sc.nextInt();
//		}
//		System.out.println("몇번째 수인가요? : ");
//		int q = sc.nextInt();
//		System.out.println(numArray[q-1]);
		
		// 2
//		int[] numArray = new int[5];
//		for(int i=0; i<5; i++) {
//			numArray[i] =  sc.nextInt();
//		}
//		for(int i=4; i>=0; i--) {
//			System.out.print(numArray[i]+" ");
//		}
		
		// 3
		int[][] numArray = new int[4][4];
		int a = 1;
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				numArray[i][j] = a;
				a++;
			}
		}
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(numArray[i][j]+" ");
			}
			System.out.println();
		}
	}

}
