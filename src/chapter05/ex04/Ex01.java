package chapter05.ex04;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 실습)
		Scanner sc = new Scanner(System.in);
		
		do{ System.out.println("==================================================================");
		System.out.println("1. 인풋 값을 받아서 방의 크기를 지정하고 7의 배수와 8의 배수 저장 후 출력");
		System.out.println("2. 인풋 값을 받아서 방의 크기를 지정하고 1씩 증가하도록 출력 (단, 4의 배수 제외)");
		System.out.println("3. 인풋 값을 받아서 방의 크기를 지정하고 3의 배수만 저장 (단, 6의 배수 제외)");
		System.out.println("4. 프로그램 종료");
		System.out.println("==================================================================");
		
		int first;
		
		System.out.println("실행을 원하는 프로그램 번호를 입력하세요");
		first = sc.nextInt();
		int a ;
	
			if (first==1) {
			
				System.out.println("1. 방의 크기를 입력하세요");
				a = sc.nextInt(); 
			
				int[]arr1 = new int[a] ;
				for (int i=0, j=1; i<arr1.length; i++, j++) {
					if (j%7==0 || j%8==0) {
						arr1[i] = j ; 
						System.out.print(arr1[i]+ " ");
					}	
				
				}
			
			System.out.println();
		
		
			}else if (first==2) {
				
				System.out.println("2. 방의 크기를 입력하세요");
					 a = sc.nextInt();
					int[]arr2 = new int[a] ;
					for (int i=0, k=1; k<arr2.length; i++, k++) {
						if (k%4!=0) {
							arr2[i] = k ; 
							System.out.print(arr2[i]+ " ");
						}	
					}
				System.out.println();
			}else if (first==3) {
			
			System.out.println("3. 방의 크기를 입력하세요");
				 a = sc.nextInt();
				int[]arr3 = new int[a] ;
				for (int i=0, k=3; k<arr3.length; i++, k+=3) {
					if (k%6!=0) {
						arr3[i] = k ; 
						System.out.print(arr3[i]+ " ");
					}	
				}	
				System.out.println();
			
			}else if (first==4) {
				
				System.out.println("4. 프로그램 종료");
				break;
			
				
			}else {
				System.out.println("번호를 다시 입력해주세요.");
			}
					
			
		}while(true) ;
		System.out.println("do while문을 빠져나왔습니다.");
	}		

}