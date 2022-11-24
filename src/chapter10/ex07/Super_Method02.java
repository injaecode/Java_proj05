package chapter10.ex07;

class Aa{
	Aa(){
		System.out.println("Aa클래스의 생성자");
	}
}

class Bb extends Aa {
	Bb () {
		//super();
		System.out.println("Bb의 생성자");
	}
	
}
class Cc extends Bb{
	Cc(){
		//super();
		System.out.println("Cc의 생성자");
	}
}
public class Super_Method02 {

	public static void main(String[] args) {
		// 객체 생성 후 생성자 작동 확인
		 
		
	}

}
