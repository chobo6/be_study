package be_study.quiz;
import java.util.Scanner;
import java.util.Random;
public class Quiz23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int[] floor, heightArr;
		int people, Weight=0, maxPeople, maxWeight;
		int count=0;
		int stopNum;
		
		System.out.print("최대 탑승 인원을 입력해주세요 : ");
		maxPeople = sc.nextInt();
		System.out.print("최대 중량을 입력해주세요 : ");
		maxWeight = sc.nextInt();
		
		people = rand.nextInt(15)+1;
		
		System.out.printf("탑승 인원 : %d\n", people);
		if(people > maxPeople) {
			System.out.printf("탑승희망 %d명 정원 %d명 초과, 늦게 오신 분들은 계단을 이용해주세요\n",people, maxPeople);
			people = maxPeople;
		}
		
		heightArr = new int[people];
		System.out.print("몸무게 : ");
		for(int i=0; i<people; i++) {
			heightArr[i] = rand.nextInt(40,150+1);
			System.out.print(heightArr[i] + " ");
			Weight += heightArr[i];
			if(Weight > maxWeight) {
				System.out.printf("\n총 중량 %d, 최대 중량 %d를 초과했습니다. 마지막분은 계단을 이용해주세요",Weight, maxWeight);
				people = i;
				break;
			}
		}
		System.out.println();
		System.out.println("최종 탑승 인원 : "+people+"명");
		count = people;
		floor = new int[people];
//		System.out.println("사람들이 내릴 층을 입력해주세요");
		for(int i=0; i<floor.length; i++) {
			floor[i] = rand.nextInt(100)+1;
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
