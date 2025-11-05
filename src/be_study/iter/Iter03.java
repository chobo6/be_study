package be_study.iter;

public class Iter03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 반복문 중첩
		
		for(int i=1; i<=5; i++) {
			// 실행문
			System.out.println("for i 실행문 "+i);
			
			for(int j=1; j<=3; j++) {
				System.out.println("> for j 실행문 "+j);
			}
			
			System.out.println("---for 실행문 end---");
		}

	}

}
