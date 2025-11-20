package be_study.quiz.quiz30;

public class Quiz30Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--------1번--------");
		Student s1 = new Student();
		s1.setDept("컴퓨터공학");
		s1.setSNum(1111111);
		System.out.printf("학과 : %s, 학번 : %d\n", s1.getDept(), s1.getSNum());

		System.out.println("--------2번--------");
		System.out.println(new SalaryMan().getAnnualGross());
		System.out.println(new SalaryMan(2000000).getAnnualGross());
		
		System.out.println("--------3번--------");
		Account a1 = new Account("hong", 100000);
		a1.deposit(20000);
		a1.withdraw(130000);
		a1.showBalance();

		System.out.println("--------4번--------");
		Computer pc = new Computer(0, 16);
		Computer apple = new Computer(1, 32);
		Computer galaxy = new Computer(2, 16);
		pc.print();
		apple.print();
		galaxy.print();
	}

}
