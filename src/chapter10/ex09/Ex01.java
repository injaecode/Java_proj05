package chapter10.ex09;

class Car {
	private String carName;
	private String carColor;
	private int maxSpeed;
	private String carModel;
	// 1. 기본생성자 인풋을 받는 생성자
	Car(){}
	public Car(String carName, String carColor, int maxSpeed, String carModel) {
		this.carName=carName;
		this.carColor=carColor;
		this.maxSpeed=maxSpeed;
		this.carModel=carModel;
	}

	// 2. getter setter 생성

	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	//toString() 재정의
	@Override
	public String toString() {
		return "Car [carName=" + carName + ", carColor=" + carColor + ", maxSpeed=" + maxSpeed + ", carModel="
				+ carModel + "]";
	}

}
public class Ex01 {

	public static void main(String[] args) {

		// 4. 생성자를 통해 값을 할당 후 메모리 전체 내용 출력
		Car aa = new Car("캐스퍼","grey",200,"XD500");
		System.out.println(aa);
		// 5. setter를 사용해 할당 메모리 전체 출력
		Car bb = new Car();
		bb.setCarName("레이");
		bb.setCarColor("mint");
		bb.setMaxSpeed(130);
		bb.setCarModel("SSQ251");
		System.out.println(bb);
		
		// 5-1. getter를 사용해 각 필드 내용 출력
		System.out.println(bb.getCarName());
		System.out.println(bb.getCarColor());
		System.out.println(bb.getMaxSpeed());
		System.out.println(bb.getCarModel());
		

	}

}
