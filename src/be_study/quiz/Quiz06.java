package be_study.quiz;
import java.util.Scanner;
public class Quiz06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1
		Scanner sc = new Scanner(System.in);
//		double base = sc.nextDouble();
//		double height = sc.nextDouble();
//		double area = base*height/2;
//		System.out.printf("삼각형의 넓이 = %f\n",area);
		
		//2
//		double tBase = sc.nextDouble();
//		double bBase = sc.nextDouble();
//		double height = sc.nextDouble();
//		double area = (tBase+bBase)*height/2;
//		System.out.printf("사다리꼴의 넓이 = %f\n",area);
		
		//3
//		int snack = 100;
//		int student = 24;
//		System.out.printf("한 명당 %d개의 과자를 받고 %d개의 과자가 남습니다.\n", snack/student, snack%student);
		
		//4
//		int num = sc.nextInt();
//		System.out.printf("백의 자리 : %d\n", num/100);
//		System.out.printf("십의 자리 : %d\n", num/10%10);
//		System.out.printf("일의 자리 : %d\n", num%10);
		
		//5
		int x = 10;
		int y = 20;
		System.out.println("x="+x+ " y="+y);
		
		//x와 y를 바꾸는 작업
		int temp = y;
		y = x;
		x = temp;
		System.out.println("x="+x+ " y="+y);
	}

}
