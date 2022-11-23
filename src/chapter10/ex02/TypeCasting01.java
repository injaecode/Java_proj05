package chapter10.ex02;

class Animal {
	String name;
	int age;
	
	void eat() {
		System.out.println("모든 동물은 먹습니다.");
	}
}
class Tiger extends Animal {
	String tigerSound;
	void tigherEat() {
		System.out.println("호랑이는 육식을 합니다.");
	}
}
class TigerChild extends Tiger {
	String tigerChildSound;
	void tigerChildEat() {
		System.out.println("새끼 호랑이는 젖을 먹습니다.");
	}
}
public class TypeCasting01 {

	public static void main(String[] args) {
		// Type Casting (형 변환) : 
		
		//1. 업캐스팅 : 자식 객체를 생성해서 부모타입으로 정의, 자동으로 발생
		Animal a1 = new Tiger();	//Tiger 객체 --> Animal 타입으로 지정
			
			//a1 : Animal의 필드와 메소드만 사용 가능
		a1.name = "호랑이";
		a1.age = 10 ;
		System.out.println(a1.name);
		System.out.println(a1.age);
		a1.eat();
		
		//2. 다운 캐스팅 : 부모 클래스를 객체화 해 자식타입으로 정의, 수동으로 명시
			//a1 : Tiger+Animal 필드와 메소드 모두 포함
			//	 : Animal타입 -> t2(Tiger)타입으로 다운캐스팅
		Tiger t2 = (Tiger)a1;
			//t2 : Animal, Tiger 필드와 메소드 모드 접근 가능
		
		//Animal
		t2.name = "호랑이2";
		t2.age = 6;
		System.out.println(t2.name);
		System.out.println(t2.age);
		t2.eat();
		//Tiger
		t2.tigerSound = "어흥";
		System.out.println(t2.tigerSound);
		t2.tigherEat();
		
		//3. Tiger 타입으로 객체 생성 : Animal, Tiger의 필드와 메소드 모두 접근
		Tiger t3 = new Tiger();
			//t3 : Animal, Tiger 모두 내포
		
		//t3에는 TigerChild를 내포하지 않아 다운캐스팅 실행시 오류 발생
		//TigerChild t4 = (TigerChild) t3;		//선언 시 이상 없으나 출력 시 오류 발생
		System.out.println("======instanseof 출력======");

		System.out.println(t3 instanceof Animal); 	//해당 객체에 Animal을 내포하는 경우 true 
		System.out.println(t3 instanceof Tiger); 	//해당 객체에 Tiger을 내포하는 경우 true 
		System.out.println(t3 instanceof TigerChild); 	//false 
		
		//다운 캐스팅 시 반드시 instanceof를 사용해야 함
		if (t3 instanceof TigerChild) {
		TigerChild t4 = (TigerChild) t3;
		}
		
		System.out.println("================");
		//1. 업캐스팅 
		Animal a3 = (Animal) new TigerChild() ;
				//a3 : Animal, Tiger, TigerChild
				
		System.out.println(a3 instanceof Animal);	//true
		System.out.println(a3 instanceof Tiger);	//true
		System.out.println(a3 instanceof TigerChild);//true
			
		//Animal타입의 필드와 메소드만 접근 가능
		a3.name = "호랑이4";
		a3.age = 7;
		a3.eat();
		
		//a3를 Tigher 타입으로 다운 캐스팅
		Tiger t5=null	;				//블락 밖에서 캐스팅할 변수 선언, 객체 초기화
		if (a3 instanceof Tiger) {
		 t5 = (Tiger) a3;
		}
		//Animal
		t5.age=10;
		System.out.println(t5.age);
		t5.name = "호랑이5";
		System.out.println(t5.name);
		
		//Tiger
		t5.tigerSound = "어흥" ; 
		
		//3. a3를 TigerChild로 다운 캐스팅
		TigerChild t6 = null ;			//블락 밖에서 변수선언
		if (t3 instanceof TigerChild) {
			t6 = (TigerChild) t3;			
		}
			//t6 : TigerChild타입 (Animal, Tiger, TigerChild의 필드와 메소드 모드 접근 가능)
		t6.age= 2;
		t6.tigerSound = "어흥어흥";		//tiger
		t6.tigerChildSound = "어흥" ;		//tigerchild
		
		//t6(TigerChild) --> Animal
		
		Animal t7 = t6; 		//t7 :  Animal, Tiger, TigerChild을 내포하고 Animal타입
		Tiger t8 = t6;			//t8 : Animal, Tiger, TigerChild을 내포하고 Tiger타입 
	}

}
