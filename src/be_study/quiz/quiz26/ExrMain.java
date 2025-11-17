package be_study.quiz.quiz26;

public class ExrMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV myTv = new TV("LG", 2021, 43);
		myTv.show();

		Monitor m1 = new Monitor("삼성", 27, 150000);
		Monitor m2 = new Monitor("LG", 32, 330000);
		m1.setXY(1080, 780);
		m2.setColor("흰색");
		m2.setXY(4096, 2048);
		m1.printInfo();
		m2.printInfo();
		m2.priceUp(70000);
		System.out.println();
		m1.printInfo();
		m2.printInfo();
		
		
	}

}
