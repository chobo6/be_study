package be_study.quiz;
import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 10;
		System.out.println(num == 0 ? "0" : (num > 0 ? "양수" : "음수"));
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int fNum = sc.nextInt();
		System.out.printf("입력한 숫자 = %d\n", fNum);
		
		System.out.print("두번째 숫자를 입력하세요 : ");
		int sNum = sc.nextInt();
		System.out.printf("입력한 숫자 = %d\n", sNum);
		
		System.out.printf("더하기 : %d + %d = %d\n", fNum, sNum, fNum+sNum);
		System.out.printf("빼기 : %d - %d = %d\n", fNum, sNum, fNum-sNum);
		System.out.printf("곱하기 : %d * %d = %d\n", fNum, sNum, fNum*sNum);
		System.out.printf("나누기 : %d / %d = %f\n", fNum, sNum, (double)fNum/sNum);
	}

}
