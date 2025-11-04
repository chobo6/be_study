package be_study.quiz;
import java.util.Scanner;
public class Quiz08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("출생년도를 입력하세요 : ");
		int year = sc.nextInt();
		System.out.print("주민번호 뒷자리 첫번째 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		System.out.printf("결과 : %d살 ",2025-year+1);
		if(year>=2000) {
			switch(num) {
			case 3:
				System.out.println("남자입니다.");
				break;
			case 4:
				System.out.println("여자입니다.");
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}
		if(year<2000) {
			switch(num) {
			case 1:
				System.out.println("남자입니다.");
				break;
			case 2:
				System.out.println("여자입니다.");
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}
	}

}
