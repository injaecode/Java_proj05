package chapter16.ex08;
class A {
	//Number: Boolean, Charter를 제외한 정수, 실수를 처리하는 클래스
		//Byte, Short, Integer, Long, Float, Double 
	public <T extends Number> void method1(T t) {
		//Object클래스의 메소드 외 Number의 메소드 사용 가능
		System.out.println(t.intValue());	//intValue() : Number의 메소드
	}
}
//인터페이스
interface MyInterface{
	void print();	//public abstract 생략되어있음
}
class B{
	//T: MyInterface 하위의 구현 클래스가 올 수 있다
	//타입을 제한하기 위해 인터페이스를 (implements가 아닌) extends
	public <T extends MyInterface> void method1 (T t) { 
		t.print();
	}
}
public class BoundedTypeOfGenericMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.<Double>method1(10.11);
		a.method1(5.8);//double
		a.<Integer>method1(100);
		a.method1(200);
		
//		a.<String>method1("안녕");
		
		B b=new B();
		b.<MyInterface>method1(new MyInterface(){
			@Override
			public void print() {
				System.out.println("print() 구현");
			}
			
		});
		
		
	}

}
