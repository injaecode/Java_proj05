package chapter11.ex04;
abstract class Car {	//트럭 자가용 굴삭기 추상메소드를 구현한 클래스 생성
	abstract void run();
	abstract void fuel();
}

class Truck extends Car{
	 @Override
	void run() {
		System.out.println("트럭의 속도는 150km");
	}
	@Override
	void fuel() {
		System.out.println("트럭의 연로는 LPG");
		
	}
}

class Sedan extends Car{
	 @Override
	void run() {
		System.out.println("세단의 속도는 200km");
	}
	@Override
	void fuel() {
		System.out.println("세단의 연로는 경유");
		
	}
}
class Excavator extends Car{
	 @Override
	void run() {
		System.out.println("굴삭기의 속도는 70km");
	}
	@Override
	void fuel() {
		System.out.println("굴삭기의 연로는 휘발유");
		
	}
}

public class Ex01 {

	public static void main(String[] args) {
		Car a1 = new Truck();
		a1.run();
		a1.fuel();
		Car a2 = new Sedan();
		a2.run();
		a2.fuel();
		Car a3 = new Excavator();
		a3.run();
		a3.fuel();

	}

}
