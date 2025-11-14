package be_study.quiz.quiz25;

public class MonitorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monitor m1 = new Monitor();
		m1.inch = 65;
		m1.company = "삼성";
		m1.model = "더프레임";
		
		Monitor m2 = new Monitor(80,"LG","올레드");
		m1.printInfo();
		m2.printInfo();
	}

}
