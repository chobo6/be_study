package be_study.quiz.quiz30;

public class Computer {
	public static final String[] OS_TYPE = {"윈도우10", "애플 OS X", "안드로이드"};
	int memory;
	int arrNum;
	Computer(int arrNum, int memory){
		this.arrNum = arrNum;
		this.memory = memory;
	}
	public void print() {
		System.out.printf("운영체제: %s, 메인메모리: %d\n", OS_TYPE[arrNum], memory);
	}
}
