package be_study.quiz.foodtruck;

import java.util.ArrayList;

public class FoodTruckMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Food> f = new ArrayList<Food>();
		Food kimbap = new Food("김밥",1000);
		Food ramen = new Food("라면",2000);
		Food jjolmyeon = new Food("쫄면",3000);
		f.add(kimbap);
		f.add(ramen);
		f.add(jjolmyeon);
		kimbap.setStock(10);
		ramen.setStock(20);
		jjolmyeon.setStock(30);
		
		Function fc = new Function();
		
		fc.showMenu(f);
		System.out.println();
		
		fc.orderMenu(kimbap, 10);
		fc.orderMenu(kimbap, 5);
		System.out.println();
		
		fc.showMenu(f);
		System.out.println();
		
		fc.addStock(kimbap, 10);
		fc.addStock(kimbap, 10);
		System.out.println();
		
		fc.showMenu(f);
		fc.showRevenue();
		System.out.println();
		
		fc.orderMenu(jjolmyeon, 20);
		System.out.println();
		
		fc.closed(f);
	}

}
