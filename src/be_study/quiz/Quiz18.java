package be_study.quiz;
import java.util.Scanner;
public class Quiz18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1
//		for(int i=1; i<=5; i++) {
//			for(int j=5; j>=i; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		// 2
//		for(int i=1; i<=4; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		// 3
		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		for(int i=1; i<=num; i++) {
//			if(num%i == 0) {
//				System.out.print(i+" ");
//			}
//		}
		
		// 4
//		int num = sc.nextInt();
//		for(int i=1; i<=num; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i=1; i<num; i++) {
//			for(int j=num-1; j>=i; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		// 5
//		System.out.println("n값 입력");
//		int num = sc.nextInt();
//		int s=0;
//		for(int i=1; i<=num; i++) {
//			s += (i*(i+1))/2;
//		}
//		System.out.println(s);
//		
//		int sum=0, sum1=0;
//		for(int i=1; i<=num; i++) {
//			sum += i;
//			sum1 += sum;
//		}
//		System.out.println(sum1);
		
		// 6
		int sum=0, num=0;
		do {
			num++;
			if(num%2==0) {
				sum -= num;
			}
			if(num%2==1) {
				sum += num;
			}
		} while(sum<100);
		System.out.printf("%d까지 더했을 때 %d으로 100 이상이 됨", num, sum);
		System.out.println();
	}

}
