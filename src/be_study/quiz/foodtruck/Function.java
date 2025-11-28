package be_study.quiz.foodtruck;

import java.util.ArrayList;

public class Function {
	
	int revenue = 0;
	
	public void showMenu(ArrayList<Food> fArr) {
		for(Food f : fArr) {
			System.out.printf("메뉴:%s 가격:%d원 수량:%d개\n", f.name, f.price, f.stock);
		}
	}
	
	public void orderMenu(Food f, int amount) {
		if(amount > f.stock) {
			System.out.println("재고보다 주문수량이 많습니다.");
			return ;
		}
		int allPrice = f.price*amount;
		System.out.printf("%s %d개 주문 (%d원)\n", f.name, amount, allPrice);
		revenue += allPrice;
		f.stock -= amount;
	}
	
	public void addStock(Food f, int amount) {
		System.out.printf("%s 재고 %d개 추가\n", f.name, amount);
		f.stock += amount;
		System.out.println("현재 재고 " + f.stock + "개");
	}
	
	public void showRevenue() {
		System.out.println("현재 매출액 : " + revenue + "원");
	}
	
	public void closed(ArrayList<Food> fArr) {
		int loss = 0;
		for(Food f : fArr) {
			loss += f.price*0.3*f.stock;
		}
		System.out.printf("매출:%d원 폐기손해:%d원 최종수익:%d원\n", revenue, loss, revenue-loss);
	}
}
