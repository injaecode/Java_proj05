package chapter16.ex07;

//extends 키를 사용해 제네릭 클래스로 들어오는 타입을 제한할 수 있음
class A{}
class B extends A{}
class C extends B{}

class D <T extends B> {	//T타입으로 들어오는 타입을 제한 T: B, C타입만 들어올 수 있음
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}
public class BoundedType {

	public static void main(String[] args) {
//		D <A> d1 = new D<>(); 오류발생, B의 상위 클래스인 A타입은 T에 삽입 불가
		D <B> d2 = new D<>(); //T: B타입 삽입 가능
		D <C> d3 = new D<>(); //T: B클래스를 상속받은 C타입도 삽입 가능
		
		D d4 = new D();	// = D<B> d4=new D();기본 B타입으로 지정돼 생략되어있음
		
		//setter를 사용해 타입에 값 입력
		d2.setT(new B());	//d2는 B타입을 정의해 객체를 생성, setter에 B타입의 객체를 주입
		d3.setT(new C());	//d3는 C타입을 정의해 객체를 생성, setter에 C타입의 객체를 주입
		
//		d3.setT(new B());	//오류 발생, d3는 C타입으로 정의되어 있음
							//B를 객체화하면 A, B를 내포하며 C객체는 내포되지 않음
		d2.setT(new C()); 	//C객체가 B타입으로 업캐스팅됨	
 	}

}
