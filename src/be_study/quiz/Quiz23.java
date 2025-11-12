package be_study.quiz;
import java.util.Scanner;
public class Quiz23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] floor;
		int people;
		int count=0;
		int stopNum;
		
		System.out.println("탑승 인원을 입력해주세요");
		people = sc.nextInt();
		count = people;
		floor = new int[people];
		
		System.out.println("사람들이 내릴 층을 입력해주세요");
		for(int i=0; i<floor.length; i++) {
			floor[i] = sc.nextInt();
		}
		
		System.out.print("엘리베이터가 멈출 수 있는 횟수 : ");
		stopNum = sc.nextInt();
		
		for(int i=1; i<=100; i++) {
			for(int j=0; j<floor.length; j++) {
				if(i==floor[j]) {
					System.out.println("문이 열립니다");
					count--;
				}
			}
			if(stopNum == 0) {
				System.out.printf("현재 %d층 ",i);
				System.out.println("점검 중, 계단을 이용해 주세요");
				break;
			}
			System.out.printf("현재층 = %d, 탑승인원 =%d\n", i,count);
			stopNum--;
		}
	}

}
