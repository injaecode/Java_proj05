package chapter12.ex02;

public class Animal_Test {

	public static void main(String[] args) {
		// 1. 구현한 객체 생성 후 Animal 타입으로 지정
		// Animal : 인터페이스
		Animal a1 = new Cat();
		Animal a2 = new Dog();
		Animal a3 = new Tiger();
		Animal a4 = new Eagle();
		
		//2. Animal 배열에 저장
		Animal[] arr= new Animal[] {a1,a2,a3,a4};
		
		//3. For문을 사용해 오버라이딩된 메소드 출력
		for (int i = 0; i <arr.length;i++) {
			//Animal의 cry(), run()호출 시 구현된 각 클래스에서 오버라이딩 된 메소드 호출
			arr[i].cry();
			arr[i].run();
		}
		System.out.println("=================");
		//4. Enhanced For문을 사용해 출력
		for(Animal k : arr) {
			k.run();
			k.cry();
		}
				
	}

}
