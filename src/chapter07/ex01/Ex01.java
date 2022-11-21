package chapter07.ex01;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//객체 생성, 메소드 호출 : Main method에서 호출
		//sum1, sum2 객체 생성 없이 바로 호출 : static 메소드
		int x = sum1(3,4,5) ;
				System.out.println(x);
		
		double y = sum2(244.13, 21.6, 1.38) ;
			System.out.println(y);
			
		Ex01 p1 = new Ex01();
		String z = p1.sum3("초록매실", "3", "700") ;
		System.out.println(z);
		
		
	}
	//정수값 3개를 인풋받아 더한 값을 정수 리턴하는 메소드(Static)
	public static int sum1 (int a, int b, int c) {
		 return a+b+c ;
	}
	//실수값 3개를 인풋받아 더한 값을 정수 리턴하는 메소드(Static)
	public static double sum2 (double d, double e, double f) {
		return d+e+f ;
	}
	//문자열을 연결해서 출력하는 메소드(인스턴스 메소드: Static을 사용하지 않는 메소드), 객체 생성
	//"제품이름", "제품수량", "제품가격"
	public String sum3 (String g, String h, String i ) {
		return "제품이름 : "+ g+"\n제품수량 : "+h+"개\n제품가격 : "+i+"원";
	}
}
