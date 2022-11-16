package chapter05.ex04;

import java.util.Scanner;

public class Ex1_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //1. 스캐너 가동
		
		int [] arr1 ; //2. 배열변수 선언
		int n ; //선택자
		int idx; //배열의 방의 크기를 스캐너로 인풋받는 변수
		
		while (true) { //3. while문 열고
			System.out.println("==================================================================");
			System.out.println("1. 인풋 값을 받아서 방의 크기를 지정하고 7의 배수와 8의 배수 저장 후 출력");
			System.out.println("2. 인풋 값을 받아서 방의 크기를 지정하고 1씩 증가하도록 출력 (단, 4의 배수 제외)");
			System.out.println("3. 인풋 값을 받아서 방의 크기를 지정하고 3의 배수만 저장 (단, 6의 배수 제외)");
			System.out.println("4. 프로그램 종료");
			System.out.println("==================================================================");
				
			System.out.println("1 ~ 4번 중 번호를 입력하세요>>>");
			n = sc.nextInt() ; //4. 입력문 작성
			
			if (n==1) { //5. if~else 블락 먼저 구성
				System.out.println("1번 선택: 원하는 배열의 방 크기를 입력하세요 >>>");
				idx=sc.nextInt(); //7. 배열의 방 크기를 스캐너로 받아서 idx변수에 할당
				arr1 = new int[idx] ;//8. arr1.배열 변수의 방 크기를 지정
					int i = 0 ; //9. 배열의 방 번호를 지정하는 변수
					int a; //10. 7의 배수와 8의 배수를 저장하는 변수
					for (a = 1; ;a++) { //11.for문 작성, 조건 생략 시 무한루프
						if(a%7==0 || a%8==0) {
							arr1[i] = a;   	//배열 방에 7과 8의 배수를 저장
							i++ ; 			//배열의 방 번호 증가는 값이 저장될 때만 증가되어야 함
							} //12. 안의 if문 닫음
							if(i == idx) {	//i = 방번호, idx = 인풋받은 방의 개수
								break;
							}
						}
					System.out.println("인풋받은 방의 수" + idx);
					System.out.println("마지막 방번호 : " + i);
					System.out.println("마지막 방번호에 들어간 값 : " + a);
					System.out.println("7과 8의 배수 출력됨");	
					for (i=0 ; i <arr1.length ; i++) { 	//13. for문을 사용해 배열(arr1) 저장된 값을 출력
							System.out.print(arr1[i] + " ");
						}
						System.out.println();
							
			}else if (n==2) {//5. if~else 블락 먼저 구성
				System.out.println("2번 선택 : 원하는 배열의 방 크기를 입력하세요 >>>");
				idx = sc.nextInt() ; 
				arr1 = new int [idx] ;
					int i = 0 ; //방번호
					int a ; //값을 저장하는 변수
						for (a = 1; ; a++) {
							if (a%4 == 0) {
								continue ; 	//continue를 만나면 아래 내용을 실행하지 않고 증가식으로 올라감
							}
							arr1[i] = a;
							i ++;
							if (i==idx) {
								break;
							}
						}
						for (i = 0; i<arr1.length ; i++) {
							System.out.print(arr1[i] + " ");
						}
						System.out.println(); 
			}else if (n==3) {//5. if~else 블락 먼저 구성
				System.out.println("3번 선택 : 원하는 배열의 방 크기를 입력하세요 >>>");
				idx = sc.nextInt() ; 
				arr1 = new int [idx] ;
				int i = 0 ; 
				int a ;
					for (a=1; ; a++) {
						if (a%3==0) {
							if (a%6 !=0) {
							arr1[i] = a;
							i++ ;
							}
						}
						if (i==idx) {
							break;
						}
					}
					System.out.println("배열의 내용을 출력");
					for (i=0; i<arr1.length; i++) {
						System.out.print(arr1[i] + " ");
					}
					System.out.println();
			}else if (n==4) {//5. if~else 블락 먼저 구성
				System.out.println("4번 선택");
				break; //6. 프로그램 종료
			}else {//5. if~else 블락 먼저 구성
				System.out.println("1 ~ 4번까지만 입력해주세요");
			}//5. if~else 블락 먼저 구성
				
		} //3. 닫기
		System.out.println("프로그램이 종료되었습니다."); //6. 프로그램 종료
		sc.close(); //1. 스캐너 종료
	}

}
