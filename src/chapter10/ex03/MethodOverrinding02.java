package chapter10.ex03;
class Animal{
	void animalSound() {
		System.out.println("모든 동물은 소리내어 웁니다.");

	}
}

class Tiger extends Animal{
	@Override
	void animalSound() {
		System.out.println("호랑이는 어흥 하고 웁니다.");

	}
}

class Eagle extends Animal{
	@Override
	void animalSound() {
		System.out.println("독수리는 끼익하고 웁니다.");

	}
}

class Lion extends Animal{
	@Override
	void animalSound() {
		System.out.println("사자는 어흥흐흥 하고 웁니다.");

	}
}
public class MethodOverrinding02 {

	public static void main(String[] args) {
		// 객체생성
		Animal t1 = new Tiger();
		Animal t2 = new Eagle();
		Animal t3 = new Lion();

		
		//메소드 오버라이딩, 오버라이딩된 메소드 출력
		t1.animalSound();	//Animal의 animalSound호출 시 Tiger의 animalSound가 출력
		t2.animalSound();	//Animal의 animalSound호출 시 Eagle의 animalSound가 출력
		t3.animalSound();	//Animal의 animalSound호출 시 Lion의 animalSound가 출력

		System.out.println("==========================");
		//1. 배열에 객체를 저장
		
		//arr1에 Animal 객체를 저장함
		Animal[] arr1 = new Animal[3];
		
		//arr1 배열의 각방에 Animal 객체 저장
		arr1[0] = t1;
		arr1[1] = t2;
		arr1[2] = t3;
		
		//2. arr1 배열에 Animal 타입의 객체가 저장되어있음
			//배열의 각 방 값을 가져오기
		Animal a1 = arr1[0];
		Animal a2 = arr1[1];
		Animal a3 = arr1[2];
		
		//3. Animal 타입의 객체를 출력
		arr1[0].animalSound();
		arr1[1].animalSound();
		arr1[2].animalSound();
	}

}
