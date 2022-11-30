package chapter12.ex07;
interface A{
	//static 메소드 : public 생략, 객체 생성 없이 바로 호출 가능
	static void abc() {
	
	}
}
public class Interface_Static_Method {

	public static void main(String[] args) {
		// interface 블락에서 구현된 메소드 : default, static
		// 메소드 이름 앞에 static메소드 : 인터페이스 이름으로 바로 호출 가능
		
		// interface : 모든 필드와 메소드에 public이 모두 생략되어있다
			//1. 필드 : public static final
			//2. 메소드 : 
				//2-1 : 추상 메소드 : public abstract 생략, 선언만 된 메소드
				//2-2 : default 메소드 :[public] default 메소드, 구현부가 있는 메소드
					//모든 자식 클래스에 상속되는 메소드, 1.8버전부터 지원
				//3. static메소드 :[public] static 메소드, 구현부가 있는 메소드
					//객체 생성없이 인터페이스 이름으로 호출, 1.8버전부터 지원
		
		//객체 생성 없이 인터페이스 이름으로 바로 호출 가능
		A.abc();
	}

}
