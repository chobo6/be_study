package be_study.quiz.quiz25;

public class Monitor {
	int inch;
	String company;
	String model;

	Monitor(){}
	Monitor(int inch, String company, String model) {
		this.inch = inch;
		this.company = company;
		this.model = model;
	}
	void printInfo() {
		System.out.print("제조사:"+company+" ");
		System.out.print("모델명:"+model+" ");
		System.out.println("인치:"+inch+"인치");
	}
}
