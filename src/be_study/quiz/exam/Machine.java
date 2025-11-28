package be_study.quiz.exam;

public class Machine {
	String id;
	String spot;
	int point;
	int sucNum;
	int failNum;
	int remainTryNum;
	int sales;
	
	Machine(String id, String spot) {
		this.id = id;
		this.spot = spot;
		this.point = 0;
		this.sucNum = 0;
		this.failNum = 0;
		this.remainTryNum = 0;
		this.sales = 0;
	}
}
