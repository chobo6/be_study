package be_study.quiz.quiz26;

public class Monitor {
	String company;
	int inch;
	int price;
	String color;
	int screenX,screenY;
	
	Monitor(String company, int inch, int price) {
		this.company = company;
		this.inch = inch;
		this.price = price;
	}
	
	void setXY(int screenX, int screenY) {
		this.screenX = screenX;
		this.screenY = screenY;
	}
	void setColor(String color) {
		this.color = color;
	}
	void powerOn() {
		System.out.println("전원이 켜졌습니다.");
	}
	int priceUp(int addPrice) {
		price += addPrice;
		return price;
	}
	
	void printInfo() {
		System.out.printf("제조사:%s 색상:%s %d인치 %d원 x:%d y:%d\n", company, color, inch, price, screenX, screenY);
	}
}
