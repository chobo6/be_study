package be_study.quiz.quiz30;

public class SalaryMan {
	int salary = 1000000;
	SalaryMan(){}
	SalaryMan(int salary){
		this.salary = salary;
	}
	public int getAnnualGross() {
		return salary*12+salary*5;
	}
}
