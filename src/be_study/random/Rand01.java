package be_study.random;
import java.util.Random;
public class Rand01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// (int)(Math.random()*갯수(범위)) + 시작숫자
		
		// 1~10까지 중 랜덤
		// (int)(Math.random()*10) + 1
		
//		for(int i=1; i<=10; i++) {
//			System.out.println((int)(Math.random()*45) + 1);
//		}
		
		Random random = new Random();
//		for(int i=1; i<=10; i++) {
//			System.out.println(random.nextInt(10)+1);
//		}
		for(int i=1; i<=10; i++) {
			System.out.println(random.nextInt(10,15+1));
		}
	}

}
