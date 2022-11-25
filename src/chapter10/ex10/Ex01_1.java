package chapter10.ex10;

public class Ex01_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c1 = new C("1234","홍길동",30) ;
		C c2 = new C("1234","임꺽정",40) ;
		C c3 = new C("5678","세종ㅐ왕",60) ;
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
	}

}
