package be_study.quiz.quiz26;

public class Triangle {
	int base;
	int height;
	void setSize(int base, int height) {
		this.base = base;
		this.height = height;
	}
	double getArea() {
		double area = base*height/2.0;
		return area;
	}
}
