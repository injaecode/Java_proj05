package chapter10.ex10;
class C {
	String stuID;
	String name;
	int age ;
	
	//생성자, 기본생성자1, 생성자 2
	C(String stuID){
		this.stuID=stuID;

	}
	//toString메소드 재정의 : 필드의 값을 출력 객체
	@Override
	public boolean equals(Object obj) {
		if (this.stuID == ((C)obj).stuID) {
			return true;
		}else {
			return false;
		}
	}
}

public class Ex01 {

	public static void main(String[] args) {
		//c1.equals(c2) //stuID 필드를 재정의해서 stuID가 같으면 true 아니면 false 

		String c1 = new String("S1111");
		String c2 = new String("S1111");

		System.out.println(c1.equals(c2));
	}

}
