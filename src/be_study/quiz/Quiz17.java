package be_study.quiz;
import java.util.Scanner;
public class Quiz17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1
//		for(int i=1; i<=10; i++) {
//			for(int j=1; j<=10; j++) {
//				if((2*i)+(4*j)==10) {
//					System.out.println(i+" "+j);
//				}
//			}
//		}

		// 2
		Scanner sc = new Scanner(System.in);
//		System.out.println("정수 2개 입력 : ");
//		int num1, num2;
//		num1 = sc.nextInt();
//		num2 = sc.nextInt();
//		if(num1>num2) {
//			System.out.println(num1-num2);
//		} else if(num1<num2) {
//			System.out.println(num2-num1);
//		} else {
//			System.out.println("0");
//		}
		
		// 3
//		int num1, num2, num3, num4;
//		num1 = sc.nextInt();
//		num2 = sc.nextInt();
//		num3 = sc.nextInt();
//		num4 = sc.nextInt();
//		int sum = num1+num2+num3+num4;
//		switch(sum) {
//		case 0:
//			System.out.println("결과 : 모");
//			break;
//		case 1:
//			System.out.println("결과 : 도");
//			break;
//		case 2:
//			System.out.println("결과 : 개");
//			break;
//		case 3:
//			System.out.println("결과 : 걸");
//			break;
//		case 4:
//			System.out.println("결과 : 윷");
//			break;
//		}
	
		// 4
		int num = sc.nextInt();
		for(int i=1; i<=num; i++) {
			System.out.print("*");
		}
		
	}

}
