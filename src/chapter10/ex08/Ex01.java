package chapter10.ex08;
class Animal{
	void run() {
		System.out.println("모든 동물은 달립니다.");
	}
}
class Man extends Animal{
	@Override
	void run() {
		System.out.println("남성은 시속 10km로 달립니다.");
	}
}
class Woman extends Animal{
	@Override
	void run() {
		System.out.println("여성은 시속 8km로 달립니다.");
	}
}
class Lion extends Animal{
	@Override
	void run() {
		System.out.println("사자는 시속 60km로 달립니다.");
	}
}
class Tiger extends Animal{
	@Override
	void run() {
		System.out.println("호랑이는 시속 80km로 달립니다.");
	}
}
class Cat extends Animal{
	@Override
	void run() {
		System.out.println("고양이는 시속 48km로 달립니다.");
	}
}
class Dog extends Animal{
	@Override
	void run() {
		System.out.println("개는 시속 24km로 달립니다.");
	}
}
class Puppy extends Dog{
	@Override
	void run() {
		System.out.println("강아지는 시속 3km로 달립니다.");
	}
}
public class Ex01 {

	public static void main(String[] args) {
		// Animal : 부모클래스, run() 정의
		//	자식 클래스 : Man Woman Lion Tiger Cat Dog Puppy
		//	부모의 run 메소드를 재정의
		// 	arr 배열 Animal 저장후 For Enhanced for문으로 출력, run() 메소드 출력
		
		Animal z0 = new Animal();
		Animal z1 = new Man();
		Animal z2 = new Woman();
		Animal z3 = new Tiger();
		Animal z4 = new Lion();
		Animal z5 = new Cat();
		Animal z6 = new Dog();
		Animal z7 = new Puppy();
		
		Animal[] arr1 = new Animal[8];
		arr1[0] = z0;
		arr1[1] = z1;
		arr1[2] = z2;
		arr1[3] = z3;
		arr1[4] = z4;
		arr1[5] = z5;
		arr1[6] = z6;
		arr1[7] = z7;
		
		for (int i =0 ; i<arr1.length;i++) {
			arr1[i].run();
		}
		System.out.println("============");
		for (Animal j : arr1) {
			j.run();
		}
	}

}
