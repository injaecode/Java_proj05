package chapter09.ex01;

public class A {
	
	//필드 이름 앞에 접근 제어자
	public int a = 1;    //외부패키지에서 접근 가능
	protected int b = 2; //상속관계 해당 시 외부패키지에서 접근 가능
	int c = 3;			 //default : 같은 패키지 내에서 접근 가능
	private int d = 4;	 //동일한 파일에서만 접근 가능
	
	public A () {}
	
	public void abc() {					//다른 패키지에서 접근가능
		System.out.println("public");
	}
	protected void bcd() {				//상속 관계 시 다른 패키지에서 접근가능
		System.out.println("protected");
	}
	void cde() {						//같은 패키지에서만 접근가능
		System.out.println("default");  
	}
	private void def() {				//같은 폴더에서만 접근가능
		System.out.println("private");
	}
}
