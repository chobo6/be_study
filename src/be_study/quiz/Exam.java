package be_study.quiz;
import java.util.Random;
import java.util.Scanner;
public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int user, com, out=0;
		
		do {
			System.out.print("1~10까지의 수 입력 ");
			while(true) {
				user = sc.nextInt();
				if(user<1 || user>10) {
					System.out.print("잘못 입력하셨습니다. 다시 입력해주세요.");
				} else {
					break;
				}
			}
			com = rand.nextInt(10)+1;
			System.out.println("투수 : "+com);
			if(user == com) {
				System.out.println("안타입니다");
			} else {
				System.out.println("아웃입니다.");
				out++;
			}
			System.out.println("아웃 횟수 : "+out);
			if(out>=3) {
				System.out.println("아웃 3회로 게임을 종료합니다.");
			}
		} while(out<3);
		
		
	}

}
