package chapter04.ex07;

public class Break_Control_Keyword {

	public static void main(String[] args) {
		// break 제어 키워드 : 제어문(if, switch, for, while, do while) 내에서 
		// 					- 제어문 탈출 시 사용
		// 1. 단일 loop문에서 break 탈출
		for (int i = 0 ; i<10 ; i++) {
			System.out.println(i);
			//break; 				// 0, break를 만나면 제어문 탈출
		}
		System.out.println("==========");
		for (int i=0 ; i<10 ; i++) {
			System.out.println(i);
			if (i==5) {
				break;				// 0, 1, 2, 3, 4, 5
			}
		}
			
		System.out.println("==========");
		// 2. 다중(이중) loop문에서 break 탈출
		// 	case1: 하나의 반복문만 탈출하는 경우
		for(int i =0 ; i<5 ; i++) { 	//i : 0, 1, 2, 3, 4
			for(int j =0 ;j<5 ; j++) {	//j : 0, 1, 2, 3, 4
				if (j==2) {
					break;				// 안쪽의 for 문만 빠져나온다
				}
				System.out.println(i + " , " + j);
			}
			System.out.println();
		}
		System.out.println("=====lable을 사용해 한꺼번에 lable 위치로 점프=====");
		//  case2-1: 점프해서 한번에 바깥쪽의 for문을 탈출 (LABEL)
		pos1: for (int i = 0 ; i < 5 ; i++) {
			for (int j = 0 ; j < 5 ; j++) {
				if (i==2) {
					break pos1;			// 레이블(LABLE)로 지정된 곳으로 점프해서 탈출
				}
				System.out.println(i + " , " + j);
			}
			System.out.println();
		}
		//  case2-2: 점프해서 한번에 바깥쪽의 for문을 탈출 (변수 값을 조정해서 탈출)
		for (int i = 0 ; i < 5 ; i++) {
			for (int j = 0 ; j < 5 ; j++) {
				if (j ==2 ) {
					i = 100; 			//바깥쪽 for문의 변수 값 조건을 false로 유도
					break;
				}
				System.out.println(i + " , " + j);
				
			}
		}
		
	
	}

}
