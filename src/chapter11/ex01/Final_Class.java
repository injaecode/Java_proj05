package chapter11.ex01;

class Aaa {
	int m ; 
	final int n;
	
	Aaa () {
		n=10;
	}
	Aaa(int n) {
		this.n=n;
	}
	void run() {
		System.out.println("Aaa 클래스의 run()입니다.");
	}

}
class Bbb extends Aaa { 
	
}
class Ccc extends Bbb {
	
}
public class Final_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
