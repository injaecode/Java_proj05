package chapter16.ex03;

class Apple {String apple="애플";}
class Pencil {String pencil = "연필";}
class Banana{String banana = "바나나";}
//제네릭 클래스 : 다양한 타입으로 저장할 수 있는 클래스
	//클래스 이름 뒤 <T>
	//객체를 생성할 때 <T>에 들어가는 타입을 지정해서 객체를 생성함.
	//<T>에는 객체형 타입만 기입 가능
	//wrapper class: 기본 자료형을 객체형 자료형으로 만들 것
	//기본자료형-객체형 자료형
	//boolean-Boolean, char-Charter, byte-Byte, short-Short
	//int-Integer, long-Long, float-Float, double-Double

class MyClass<T>{
	private T t;
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
}
public class SingleGenericArgument {

	public static void main(String[] args) {
		// 1. 제네릭 타입의 객체 생성하기
		MyClass<Apple> app1 = new MyClass<Apple>();
		//Apple객체를 setter를 사용해 주입하고 값 가져오기
		app1.set(new Apple());
		System.out.println(app1.get().apple);
		
		//Pencil객체를 setter를 사용해 주입하고 값 가져오기
		MyClass<Pencil> pen1 = new MyClass<>();
		pen1.set(new Pencil());					//setter를 사용해 Pencil객체 주입
		System.out.println(pen1.get().pencil);	//getter를 사용해 Pencil객체 가져옴
		
		//Banana객체를 setter를 사용해 주입하고 값 가져오기
			MyClass<Banana> ba1 = new MyClass<>();
			ba1.set(new Banana());					//setter를 사용해 Pencil객체 주입
			System.out.println(ba1.get().banana);
			
		//Stirng 값 넣고 출력하기
			MyClass<String> str1 = new MyClass<>();
			str1.set("안녕하세요");
			System.out.println(str1.get());
		//int 값 넣고 출력하기 : Integer 객체
			MyClass<Integer> int1 = new MyClass<>();
			int1.set(19);
			System.out.println(int1.get());
		//double값 넣고 출력하기 : double 객체
			MyClass<Double> dou1 = new MyClass<>();
			dou1.set(392.13);
			System.out.println(dou1.get());
	}

}
