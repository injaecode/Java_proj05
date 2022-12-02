package chapter17.ex04;

import java.util.ArrayList;

class Car{
	String company;
	String model;
	String color;
	int maxSpeed;
	
	Car(String company, String model, String color, int maxSpeed){
		this.company=company;
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}

	@Override
	public String toString() {
		return "Car [company=" + company + ", model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed + "]";
	}
	
}
public class Ex01 {

	public static void main(String[] args) {
		ArrayList<Car> a1 = new ArrayList();
	
		Car c1 = new Car("Tesla","모델Y","Blue",217);
		Car c2 = new Car("Volvo","XC60","Thunder Gray",250);
		Car c3 = new Car("현대","아이오닉5","Matt White",300);
		
		a1.add(c1);
		a1.add(c2);
		a1.add(c3);
		
		for(int i = 0; i<a1.size(); i++) {
			Car buy1=a1.get(i);
			System.out.println(buy1);
			
			System.out.println("========");
		for(Car k : a1) {
			System.out.println(k);
		
			System.out.println("========");
			System.out.println(a1);
		}
		}
	
	}

}
