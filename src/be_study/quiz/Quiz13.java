package be_study.quiz;
import java.util.Scanner;

public class Quiz13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1
		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		if(num%2 == 1) {
//			System.out.println("odd");
//		} else {
//			System.out.println("even");
//		}
		
		// 2
//		int num = sc.nextInt();
//		if(num%7 == 0) {
//			System.out.println("7의 배수입니다");
//		} else {
//			System.out.println("아닙니다");
//		}
		
		// 3
//		int sum=0;
//		for(int i=1; i<=1000; i++) {
//			if(i%5 == 0) {
//				sum += i;
//			}
//		}
//		System.out.println(sum);
		
		// 4
//		int num = sc.nextInt();
//		if(num>=1 && num<=50) {
//			for(int i=1; i<=num; i++) {
//				System.out.print("*");
//			}
//		} else {
//			System.out.println("1~50까지의 수를 입력해 주세요.");
//		}
		
		// 5
//		int sum=0;
//		for(int i=1; i<=10; i++) {
//			if(i%2 == 1) {
//				sum += i;
//			} else {
//				sum -= i;
//			}
//		}
//		System.out.println(sum);
		
		// 6
//		int sum=0;
//		int i=1;
//		do {
//			sum += i;
//			i++;
//		} while(sum<1000);
//		System.out.println(sum);
		
		// 7
		int num = sc.nextInt();
		for(int i=1; i<=9; i++) {
			System.out.println(num+" * " +i+" = "+num*i);
		}
	}

}
