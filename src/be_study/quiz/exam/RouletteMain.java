package be_study.quiz.exam;

import java.util.Random;
import java.util.Scanner;

public class RouletteMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int money;
		int ranNum;
		int menuNum;
		int num = 0;
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		Machine m = new Machine("1", "천안");
		
		while(true) {
			System.out.println("잔여 게임 횟수 : " + m.remainTryNum);
			System.out.println("1.충전 2.게임시작 3.마감");
			System.out.print("메뉴 : ");
			menuNum = sc.nextInt();
			if(menuNum == 1) {
				if(m.remainTryNum > 0) {
					System.out.println("이미 충전된 금액이 있습니다.");
					System.out.println();
					continue;
				}
				
				System.out.print("충전 금액을 입력하세요(1000원 2회) : ");
				money = sc.nextInt();
				
				if(money%1000 != 0) {
					System.out.println("천원 단위로 입력해주세요.");
					System.out.println();
					continue;
				}
				m.sales += money;
				m.remainTryNum = money/500;
				num = m.remainTryNum;
			} else if(menuNum == 2) {
				if(m.remainTryNum <= 0) {
					System.out.println("금액을 충전해주세요.");
					System.out.println();
					continue;
				}
				for(int i=1; i<=num; i++) {
					ranNum = rand.nextInt(6)+1;
					System.out.printf("결과 : %d ", ranNum);
					if(ranNum <= 4) {
						System.out.println("성공!");
						m.sucNum++;
						m.point += ranNum;
					} else {
						System.out.println("실패..");
						m.failNum++;
					}
					m.remainTryNum--;
					if(m.remainTryNum == 0) {
						System.out.printf("성공 횟수:%d 실패 횟수:%d 총합점수:%d\n", m.sucNum, m.failNum, m.point);
						m.sucNum = 0;
						m.failNum = 0;
						m.point = 0;
					}
					System.out.println();
				}
			} else if(menuNum == 3) {
				if(m.remainTryNum > 0) {
					System.out.println("게임 횟수가 남아있습니다.");
					System.out.println();
					continue;
				}
				System.out.println("게임을 종료합니다.");
				break;
			} else {
				System.out.println("다시 입력해주세요.");
				System.out.println();
			}
		}
		System.out.println("매출액 : " + m.sales + "원");
	}

}
