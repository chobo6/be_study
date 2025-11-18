package be_study.quiz.quiz27;

import java.util.Random;

public class Gamble {
	static Random rand = new Random();

	public static void main(String[] args) {
		double dollar = dice() + dice() + dice();
		double won = exchange(dollar);
		System.out.printf("획득 금액: $%.2f(%.0f원)", dollar, won);
	}
	public static int dice() {
	/* Math.random() 메소드를 활용하여 1~6 사이의 정수를 반환하도록 하
	시오 */
		int num = rand.nextInt(6)+1;
		return num;
	}
	public static double exchange(double dollar) {
	/* 입력받은 달러를 환전하여 반환 하시오 */
		double num = dollar*1082.25108;
		return num;
	}

}
