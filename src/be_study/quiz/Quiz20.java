package be_study.quiz;
import java.util.Scanner;
public class Quiz20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean addOrder = true;
		String s;
		int mNum = 0;
		int amount1 = 0, amount2 = 0, amount3 = 0;
		
		do {
			System.out.println("======== 메뉴 ========");
			System.out.println("1. 아메리카노	3500원");
			System.out.println("2. 카페라떼	4100원");
			System.out.println("3. 바닐라라떼	4300원");
			System.out.println("=====================");
			System.out.print("메뉴 선택 : ");
			mNum = sc.nextInt();
			if(mNum > 3 || mNum < 1) {
				System.out.println("잘못 선택하셨습니다. 다시 선택해주세요.");
				continue;
			}
			
			System.out.print("수량 선택 : ");
			switch(mNum) {
			case 1:
				amount1 += sc.nextInt();
				break;
			case 2:
				amount2 += sc.nextInt();
				break;
			case 3:
				amount3 += sc.nextInt();
				break;
			}
			
			while(true) {
				System.out.print("추가 주문하시겠습니까?(y/n) : ");
				s = sc.next();
				if(s.equals("n")) {
					addOrder = false;
					break;
				} else if(s.equals("y")) {
					break;
				} else {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					continue;
				}
			}
		} while(addOrder);
		
		System.out.println("=====================");
		if(amount1 > 0) {
			System.out.printf("아메리카노 %d잔 : %d\n", amount1, 3500*amount1);
		}
		if(amount2 > 0) {
			System.out.printf("카페라떼 %d잔 : %d\n", amount2, 4100*amount2);
		}
		if(amount3 > 0) {
			System.out.printf("바닐라라떼 %d잔 : %d\n", amount3, 4300*amount3);
		}
		System.out.println("=====================");
		System.out.printf("총액 : %d원", 3500*amount1+4100*amount2+4300*amount3);
	}

}
