package be_study.quiz.foodtruck;


public class Food {
	String name;
	int price;
	int stock;
	
	Food(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
	
}
