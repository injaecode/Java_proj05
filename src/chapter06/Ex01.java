package chapter06;

class Man {
	//필드
	String name = "홍길동";
	int age;
	String phone = "010-1111-1234";
	String addr = "서울 종로구 인사동";
	double weight = 70.5;
	
	//기본 생성자는 생략됨 : A () {} 
	
	//메소드 :
	void add1() {	
		//1~100까지 2의 배수 및 모든 결과를 더한 값 출력

	 int sum =0;
	 	for (int i=1;i<=100;i++) { 
	 		if(i%2 ==0) {
	 			sum +=i ;
	 			System.out.print(i + " ");	
	
	 		}
	 			
	 	}	
	 	System.out.println() ;
	}
	
	void add2 () {
		//1~500까지 3의 배수 및 4의 배수를 출력, 모든 결과를 더한 값 출력
		 int b ;
		 int sum =0;
		 	for (b=1;b<=500;b++) { 
		 		if(b%3 ==0 ||b%4==0) {
		 			sum +=b ;
		 			System.out.print(b + " ");	
		 		}
		 			
		 	}	

		}
	
	
	void add3 () {
		//1~1000까지 1씩 증가하는 수 중 4의 배수를 제외한 모든 결과를 더한 값 출력
		 int c ;
		 int sum =0;
		 	for (c=1;c<=1000;c++) { 
		 		if(c%4!=0) {
		 			sum +=c ;
		 			System.out.print(sum + " ");	
		 		}
	
		 	}	
		
	}
	
}

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Man a = new Man() ;

		a.add1();
		a.add2();
		
	
	}

}
