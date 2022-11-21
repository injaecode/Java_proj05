package chapter05.ex09;

import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		/* 국어 영어 수학 과학
		홍길동 70 88 77 99
		이순신 80 68 87 79
		김똘똘 60 86 87 30
		홍길순 77 56 80 99 
		
		합계 평균
		*/
		//args : 홍길동 70 88 77 99 이순신 80 68 87 79 김똘똘 60 86 87 30 홍길순 77 56 80 99
		
		System.out.println("\t국어\t영어\t수학\t과학\t<합계>\t<평균>");
		System.out.println("=====================================================");
		
		
		String a = args[0];
		String b = args[5];
		String c = args[10];
		String d = args[15];
		
		int sum1 = 0 ;
		int sum2 = 0 ;
		int sum3 = 0 ;
		int sum4 = 0 ;
		int sumk = 0 ;
		int sume = 0 ;
		int summ = 0 ;
		int sums = 0 ;
//홍길동		
		System.out.print(a+"\t");
			for(int i=1;i<5;i++) {
				sum1 += Integer.parseInt(args[i]);
			System.out.print(args[i]+"\t");
		}
			System.out.print(sum1 + "\t");
			System.out.print(sum1/4.0);
			System.out.println();
//이순신
			System.out.print(b+"\t");
			for(int i=6;i<10;i++) {
			sum2 += Integer.parseInt(args[i]);
			System.out.print(args[i]+"\t");
			
		}
			System.out.print(sum2 + "\t");
			System.out.print(sum2 /4.0);
			System.out.println();
//김똘똘			
			System.out.print(c+"\t");
			for(int i=11;i<15;i++) {
			sum3 += Integer.parseInt(args[i]);
			System.out.print(args[i]+"\t");
		}
	
			System.out.print(sum3 + "\t");
			System.out.print(sum3 /4.0);
			System.out.println();
			
//홍길순			
			System.out.print(d+"\t");
			for(int i=16;i<20;i++) {
			sum4 += Integer.parseInt(args[i]);
			System.out.print(args[i]+"\t");
		}
			System.out.print(sum4 + "\t");
			System.out.print(sum4 /4.0);
			System.out.println();
		System.out.println("=====================================================");
		System.out.print("<합계>\t");
			for(int i=1;i<args.length;i+=5) {
				sumk += Integer.parseInt(args[i]);
			}
			System.out.print(sumk+"\t");
			
			for(int i=2;i<args.length;i+=5) {
				sume += Integer.parseInt(args[i]);
			}
			System.out.print(sume+"\t");
			
			for(int i=3;i<args.length;i+=5) {
				summ += Integer.parseInt(args[i]);
			}
			System.out.print(summ+"\t");
			
			for(int i=4;i<args.length;i+=5) {
				sums += Integer.parseInt(args[i]);
			}
			System.out.print(sums+"\t");
			System.out.println();
			
		System.out.print("<평균>\t");
		for(int i=1;i<args.length;i+=5) {
			sumk += Integer.parseInt(args[i]);
		}
		System.out.print(sumk/8.0 +"\t");
		
		for(int i=2;i<args.length;i+=5) {
			sume += Integer.parseInt(args[i]);
		}
		System.out.print(sume/8.0+"\t");
		
		for(int i=3;i<args.length;i+=5) {
			summ += Integer.parseInt(args[i]);
		}
		System.out.print(summ/8.0+"\t");
		
		for(int i=4;i<args.length;i+=5) {
			sums += Integer.parseInt(args[i]);
		}
		System.out.print(sums/8.0);
		System.out.println();
		
		
	}

}
