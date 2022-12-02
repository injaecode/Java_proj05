package chapter16;
//메소드에 인풋하는 타입을 제한
class A{}
class B extends A{}
class C extends B{}
class D extends C{}

//제네릭 클래스
class Goods<T>{
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}
class Test{
	void method1 (Goods<A> g) {} 			//case 1 : A타입만 가능
	void method2 (Goods<?> g) {} 			//case 2 : 모든 클래스 가능
	void method3 (Goods<? extends B> g) {}  //case 3 : B,C,D 클래스 가능
	void method4 (Goods<? super B> g) {}	//case 4 : A, B 클래스 가능
}
public class BoundedTypeOfInputTypeArgument {

	public static void main(String[] args) {
		// 메소드로 인풋되는 제네릭 타입 제한
		Test t = new Test();
		
		//case 1 
		t.method1(new Goods<A>()); //Goods<A>객체만 올 수 있음
//		t.method1(new Goods<B>());
//		t.method1(new Goods<C>());
//		t.method1(new Goods<D>());
		
		//case 2
		t.method2(new Goods<A>());
		t.method2(new Goods<B>());
		t.method2(new Goods<C>());
		t.method2(new Goods<D>());
		
		//case 3
//		t.method3(new Goods<A>());
		t.method2(new Goods<B>());
		t.method3(new Goods<C>());
		t.method3(new Goods<D>());
		
		//case 4
		t.method4(new Goods<A>());
		t.method4(new Goods<B>());
//		t.method4(new Goods<C>());
//		t.method4(new Goods<D>());
	}

}
