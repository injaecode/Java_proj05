package chapter05.ex08;

import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		// 실습) args : 합계 40 77 99 100 200
		//합계 - 정수를 더한 값을 출력
		System.out.println(Arrays.toString(args));;
		
		String a = args[0] ;
		String b = args[1] ;
		String c = args[2] ;
		String d = args[3] ;
		String e = args[4] ;
		String f = args[5] ;
		
		System.out.println(b+c+d+e+f);
		
		int g = Integer.parseInt(b) ; 	//String 타입의 숫자를 정수로 변환
		int h = Integer.parseInt(c) ; 	
		int i = Integer.parseInt(d) ; 	
		int j = Integer.parseInt(e) ;
		int k = Integer.parseInt(f) ;
		
		System.out.println(g+h+i+j+k);
		
		
		System.out.println("===========================");
		String s = args[0] ;
		int sum =0;
		for (int z = 1; z<args.length; z++) {
			sum += Integer.parseInt(args[z]) ;
		}
		System.out.print(s + " : ");
		System.out.println(sum);
		
		System.out.println("===========================");
		
		System.out.println("합계"+1+2+3); //합계123 :뒤의 정수까지 String 타입으로 변환 
		System.out.println(1+2+3+"합계"); //6합계  
	}

}
