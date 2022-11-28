package chapter12.ex03;
interface Animal1{
	void cry();
}
interface Animal2{
	void run();
}
interface Animal3{
	void eat();
}

//interface extends interface 
//	앞뒤 타입이 동일할 때는 extends
//	다수 상속 가능
interface K extends Animal1,Animal2,Animal3{
	//cry() run() eat()
}
class G implements K {
	@Override
	public void cry() {}
	@Override
	public void eat() {}
	@Override
	public void run() {}
}
class Aa{			//일반 클래스 : 메소드 실행부 존재
	void abc() {System.out.println("Aa의 abc()");}
}
abstract class Bb{	//추상 클래스 : 추상 메소드 1개 이상인 경우 
	abstract void bcd() ;
}
//extends 뒤에는 1개의 클래스만 올 수 있음 (단일 부모 상속, 일반-추상 클래스 중 하나만 상속 가능)
//implements 뒤엔 여러 인터페이스 상속 가능 (다중 인터페이스 상속 가능)
//extends>implements 순으로 상속
class Cc extends Aa implements Animal1, Animal2, Animal3{
	@Override
	public void cry() {}
	@Override
	public void eat() {}
	@Override
	public void run() {}
}
public class Interface_Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
