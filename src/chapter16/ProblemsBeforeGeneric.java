package chapter16;
//각각의 상품을 저장하는 클래스가 별도로 존재

//1. Apple 클래스와 Apple 클래스를 담을 수 있는 클래스

class Apple{}
class Goods1{//Apple을 담는 상품 클래스
	//접근 제어자가 private이기 때문에 외부에서 apple 참조변수를 이용하기 위해서는 getter, setter를 통해서만 값을 수정할 수 있다.
	//getter: apple 참조변수 값을 가져올때 사용
	//setter: apple 참조 변수의 다른 값을 할당할 때 사용
	
	private Apple apple = new Apple();
	
	//getter: 필드의 값을 리턴으로 돌려줌
	public Apple getApple() {
		return apple;
	}
		//getter: 필드의 값을 외부에서 수정
	public void setApple(Apple apple) {
		this.apple=apple;
	}
}
//2. Pencil 클래스와 Pencil클래스를 담을 수 있는 클래스
class Pencil{}
class Goods2{	//pencil타입의 객체를 담는 클래스
	private Pencil pencil = new Pencil();
	public Pencil getPencil() {
		return pencil;
	}
	public void setPencil(Pencil pencil) {
		this.pencil=pencil;
	}
}
public class ProblemsBeforeGeneric {

	public static void main(String[] args) {
		// 1. Goods1을 통해 Apple객체를 추가하고 가져오기
		Goods1 goods1 = new Goods1();
		goods1.getApple();
		goods1.setApple(new Apple());//setter를 사용해 Apple객체를 추가함.
		
		Apple apple = goods1.getApple();
		//2. Goods2를 사용해 Pencil객체를 추가하고 가져오기
		Goods2 goods2 = new Goods2();
		Pencil pencil = goods2.getPencil(); //getter를 사용해 Pencil객체를 가져옴
		goods2.setPencil(new Pencil()); 	//setter를 사용해서 pencil 객체를 주입
		
		Pencil pencil2 = goods2.getPencil();
	}

}
