package chapter10.ex03;

class Fruit {			//Fruit의 메소드를 오버라이딩해서 출력. Apple, Banana, Orange
	void eat() {
		System.out.println("모든 과일은 달콤합니다.");
	}
}
class Apple extends Fruit {

	void eat() {
		System.out.println("사과는 아삭합니다.");
	}
}
class Banana extends Fruit{
	void eat() {
		System.out.println("바나나는 부드럽습니다.");
	}
}
class Orange extends Fruit{
	void eat() {
		System.out.println("오렌지는 새콤합니다.");
	}
}

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit a = new Apple() ;
		Fruit b = new Banana() ;
		Fruit c = new Orange();
		
		a.eat();
		b.eat();
		c.eat();
		
	}

}
