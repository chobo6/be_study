package be_study.quiz.quiz26;

public class Rectangle {
	int base;
	int height;
	Rectangle(int base, int height) {
		this.base = base;
		this.height = height;
	}
	int getArea() {
		int area = base*height;
		return area;
	}
}
