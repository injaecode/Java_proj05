package chapter10.ex04;

class Animal {
	String name;
	int age;
	
	//기본 생성자가 생략되어 있다. Animal () {}
	Animal() {}
	
	Animal (String name, int age){
		this.name = name;
		this.age = age;
	}
	//Animal 메소드
	void cry() {
		System.out.println("Animal 클래스의 cry()");
	}
}
class Tiger extends Animal {
	//자식클래스의 생성자에는 기본적으로 super()가 생략되어있다.
	//기본생성자 생략되어 있다.
	int tigerNo; //Tiger 생성된 필드
	
	void tigerMethod() {
		System.out.println("Tiger 클래스의 메소드");
	}
	
	@Override
	void cry () {
		System.out.println("어흥");
	}
}

class Eagle extends Animal {
	int eagleNo;
	void eagleMethod () {
		System.out.println("Eagle 클래스의 메소드");
	}
	@Override
	void cry() {
		System.out.println("짹짹");
	}
}

class TigerChild extends Tiger{
	int tigerChildNo;
	void tigerChildMethod() {
		System.out.println("TigerChild클래스의 메소드");
	}
	@Override
	void cry() {
		System.out.println("응애~~");
	}
}

public class MethodOverriding_test {

	public static void main(String[] args) {
		// 메소드 오버라이딩 : 상속 관계에서 부모클래스의 메소드를 자식 클래스에서 재정의
		
		//1. 객체의 타입
		//a1 : animal
		Animal a1 = new Animal();
		a1.name = "동물이름";
		a1.age = 10;
		a1.cry();
		
		//2. Tiger 객체를 생성하면서 Tiger타입으로 지정
		//t1은 Animal과 Tiger를 내포하며, Tiger 타입으로 지정->Animal, Tiger 모두 접근 가능
		Tiger t1 = new Tiger();
		//animal 필드 메소드 호출
		t1.name = "호랑이1";
		t1.age = 5;
		t1.cry();		//자식클래스 필드 오버라이딩
		
		//tiger의 필드 메소드 호출
		t1.tigerNo = 10;
		t1.tigerMethod();
		t1.cry();
		
		//3. Tiger객체를 생성하면서 Animal타입으로 지정
		Animal a2 = new Tiger(); 	//Animal, Tiger 내포, Animal만 접근 가능
		a2.name = "호랑이2";
		a2.age = 5; 
		a2.cry();	//어흥 //오버라이딩 된 내용이 출력됨
		
		//다운캐스팅
		Tiger t2 = (Tiger)a2; //다운캐스팅 할 때는 반드시 instanceof를 사용해야 한다.
		
		if (a2 instanceof TigerChild) {
			TigerChild t3 = (TigerChild) a2;	
		}else { 
			System.out.println("a2에는 TigerChild를 내포하지 않습니다.");
		}
		
		//TigerChild 객체를 생성하면서 Animal타입으로 지정
		Animal a4 = new TigerChild();
				//a4 = Animal, Tiger, TigerChild 내포 
		a4.cry();	//"응애"로 출력, Tigerchild까지 내포되어있기 때문에 오버라이딩됨 
		
		Tiger t10 = (Tiger) a4;
		t10.cry();	//"응애"
		//다운캐스팅
		TigerChild t11 = (TigerChild) t10;
		t11.cry(); //응애
		
		//업캐스팅
		Animal a20 = t11;
		
		//배열에 객체를 저장하고 값을 출력하기 위한 객체 생성, Animal타입으로 지정
		Animal a29 = new Animal(); //a29 = Animal내포
		Animal a30 = new Tiger();	//a30 = Animal, Tiger 내포
		Animal a31 = new Eagle();	//a31 = Animal, Eagle 내포
		Animal a32 = new TigerChild();	//a32 = Animal, Tiger, TigerChild 내포
		
		//배열에 Animal타입의 객체 저장
		Animal[] arr = new Animal[] {a29, a30, a31, a32} ;
		
		//배열의 값을 출력
		for (Animal k : arr) {
			k.cry();
		}
		System.out.println("========for문을 사용해 객체 정보 출력========");
		
		//배열의 값 출력 : For문을 사용해서 출력, 배열의 값을 Animal 변수에 할당하고 출력
		for (int i = 0 ; i < arr.length; i++) {
			Animal aa = arr[i];
			aa.cry();
		}
		
		System.out.println("======================");
		for (int i = 0; i <arr.length;i++) {
			arr[i].cry();			
		}
		System.out.println("======================");
		//객체 변수를 블락밖에서 선언 후 출력
		Animal aaa = null;	//Animal 객체형 변수, 초기화 할때 null을 사용
		for(int i = 0; i < arr.length;i++) {
			aaa = arr[i];
			aaa.cry();
		}
	}

}
