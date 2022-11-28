package chapter12.ex04;
interface Animal{
}
interface Animal1 extends Animal{
	void cry();
}
interface Animal2 extends Animal{
	void run();
}
interface Animal3 extends Animal{
	void eat();
}
//cry() run() 출력
class Cat implements Animal1, Animal2{
	@Override
	public void cry() {
		System.out.println("야옹");
	}
	@Override
	public void run() {
		System.out.println("고양이가 달립니다.");
		
	}
}
class Tiger implements Animal1, Animal2{
	@Override
	public void cry() {
		System.out.println("어흥");
	}
	@Override
	public void run() {
		System.out.println("호랑이가 달립니다.");
		
	}
}
//run() eat() 출력
class Dog implements Animal2, Animal3{
	@Override
	public void run() {
		System.out.println("개가 달립니다.");
	}
	@Override
	public void eat() {
		System.out.println("개는 사료를 먹습니다.");
		
	}
}
class Lion implements Animal2, Animal3{
	@Override
	public void run() {
		System.out.println("사자가 달립니다.");
	}
	@Override
	public void eat() {
		System.out.println("사자는 육식을 합니다.");
		
	}
}
class Eagle implements Animal1, Animal2, Animal3{
	@Override
	public void cry() {
		System.out.println("끼이오");
	}
	@Override
	public void run() {
		System.out.println("독수리는 날아다닙니다.");
	}
	@Override
	public void eat() {
		System.out.println("독수리는 육식을 합니다.");
		
	}
}
public class Ex01 {

	public static void main(String[] args) {
		Animal a1 = new Cat();
		Animal b1 = new Tiger();
		Animal c1 = new Dog();
		Animal d1 = new Lion();
		Animal e1 = new Eagle();
		
		Animal[] arr1 = new Animal[] {a1, b1, c1, d1, e1};
		
			
		for(int i =0;i<arr1.length;i++) {
			if (arr1[i] instanceof Cat || arr1[i] instanceof Tiger) {
				((Animal1)arr1[i]).cry();
				((Animal2)arr1[i]).run();
		}
			if (arr1[i] instanceof Dog || arr1[i] instanceof Lion) {
				((Animal2)arr1[i]).run();
				((Animal3)arr1[i]).eat();
		}
			if (arr1[i] instanceof Eagle) {
				((Animal1)arr1[i]).cry();
				((Animal2)arr1[i]).run();
				((Animal3)arr1[i]).eat();
		}
		}
	}
}
