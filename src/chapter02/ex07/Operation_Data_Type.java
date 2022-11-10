package chapter02.ex07;

public class Operation_Data_Type {

	public static void main(String[] args) {
		// 같은 자료형 간의 연산 vs 다른 자료형 간의 연산
		//1. 같은 자료형
		int value1 = 3+5 ; 
		int value2 = 8/5 ;
		System.out.println(value1); //8
		System.out.println(value2); //1
		
		float data1 = 3.0f +5.0f ;
		System.out.println(data1); //8
		
		double data2 = 8.0 / 5.0;
		System.out.println(data2); //1.6
		
		double data3 = 8/5 ;	   // int/int = int (1) 
		System.out.println(data3); //1.0
		
		double data4 = 8/5.0; //정수 8이 double형으로 업캐스팅이 일어나서 연산
		System.out.println(data4); //1.6
		
			//주의: 평균을 계산할 때 double
		
		//2. 다른 자료형 간의 연산 (작은 자료형은 높은 자료형으로 업캐스팅이 자동으로 일어나고 연산)
		int data5 = (int) (5 + 3.5) ;
		System.out.println(data5); //8
		double data6 = 5 + 3.5 ;
		System.out.println(data6); //8.5
		int data7 = 5+ (int) 3.5 ; 
		System.out.println(data7); //8
		double data9 = 5/2.0 ; //정수 5가 double로 업캐스팅
		System.out.println(data9); //2.5
		double data10 =5/2;
		System.out.println(data10); //2.0
		
		int data11 = 50;
		double data12 = 33.33;
		
		System.out.println(data11 + data12); //50 -> double
											 //83.33
		System.out.println(data11 / data12); //1.5001....
		System.out.println(data11 / (int)data12); //1
	
		
		int 국어 = 90 ;
		int 수학 = 88 ;
		int 영어 = 77 ;
		int 음악 = 90 ;
		int 과학 = 99 ;
		int sum = 국어+수학+영어+음악+과학 ;
		double avg = sum /5.0 ; 
		System.out.println("합계는 : "+sum);
		System.out.println("평균은 : "+avg);
				
	}

}
	