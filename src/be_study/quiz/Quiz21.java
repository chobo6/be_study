package be_study.quiz;
import java.util.Random;
import java.util.Scanner;
public class Quiz21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1
//		for(int i=1; i<=6; i++) {
//			for(int j=1; j<=6; j++) {
//				if(i+j == 6) {
//					System.out.printf("%d %d\n",i,j);
//				}
//			}
//		}
		
		// 2
//		Random rand = new Random();
//		int[] lotto = new int[6];
//		for(int i=0; i<lotto.length; i++) {
//			lotto[i] = rand.nextInt(1,45)+1;
//			for(int j=0; j<i; j++) {
//				if(lotto[i] == lotto[j]) {
//					i--;
//				}
//			}
//		}
//		for(int i=0; i<lotto.length; i++) {
//			System.out.println(lotto[i]);
//		}
		
		// 3
//		Scanner sc = new Scanner(System.in);
//		int[][] score = new int[3][5];
//		int sum = 0;
//		int student = 0;
//		int sumAll = 0;
//		double aver = 0;
//		for(int i=0; i<score.length; i++) {
//			System.out.printf("%d반 : ",i+1);
//			for(int j=0; j<score[i].length; j++) {
//				score[i][j] = sc.nextInt();
//			}
//		}
//		for(int i=0; i<score.length; i++) {
//			for(int j=0; j<score[i].length; j++) {
//				sum += score[i][j];
//				aver = (double)sum/score[i].length;
//				sumAll += score[i][j];
//				student++;
//			}
//			System.out.print(aver);
//			sum = 0;
//			aver = 0;
//			System.out.println();
//		}
//		System.out.println((double)sumAll/student);
		
		// 4
		int[][] arr = {{10,20,30},{20,30,40},{30,40,50}};
		int[][] arr2 = new int[4][4];
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr2[i][j] = arr[i][j];
			}
		}
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				if(j==arr2[i].length-1) {
					arr2[i][j] = sum;
				} else {
					arr2[arr2.length-1][i] += arr2[j][i];
				}
				System.out.printf("%2d ",arr2[i][j]);
				sum += arr2[i][j];
			}
			sum = 0;
			System.out.println();
		}	
	}

}
