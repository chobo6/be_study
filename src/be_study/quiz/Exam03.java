package be_study.quiz;
import java.util.Random;
import java.util.Scanner;
public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int user, com, out, round=1, batNum=0;
		double rate;
		String[][] bat = {{"1","가"},{"2","나"},{"3","다"},
				{"4","라"},{"5","마"},{"6","바"},
				{"7","사"},{"8","아"},{"9","자"}};
		int[][]hit = new int[bat.length][3];
		for(int i=0; i<9; i++) {
			hit[i][0] = i+1;
			hit[i][2] = 0;
		}
		
		while(true) {
			if(round>333) {
				System.out.println("게임을 종료합니다.");
				break;
			}
			out = 0;
			System.out.printf("%d라운드를 시작합니다\n", round);
			do {
				rate = (double)hit[batNum][1]/hit[batNum][2];
				if(Double.isNaN(rate)) {
					rate=0;
				}
				System.out.printf("%s번타자 %s 선수 타율 : %f\n",bat[batNum][0],bat[batNum][1], rate);
				System.out.print("1~10까지의 수 입력 : ");
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
					hit[batNum][1]++;
					hit[batNum][2]++;
					batNum++;
				} else {
					System.out.println("아웃입니다.");
					out++;
					hit[batNum][2]++;
					batNum++;
				}
				if(batNum>8) {
					batNum=0;
				}
				System.out.println("아웃 횟수 : "+out);
				if(out>=3) {
					System.out.println("아웃 3회로 라운드를 종료합니다.");
					round++;
				}
			} while(out<3);
		}
		
	}

}
