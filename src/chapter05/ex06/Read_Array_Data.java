package chapter05.ex06;

public class Read_Array_Data {

	public static void main(String[] args) {
		// arr1.length :
		//	1차원 배열일 때 : 배열 방의 열 개수를 출력
		//	2차원 배열일 때 : 배열 방의 행 개수를 출력
		
		//1. 1차원 배열일 때 : arr1.length
		int[] arr1 = new int [400] ;
		System.out.println(arr1.length); //방(열)의 개수
		
		//값 insert
		for (int i = 0; i <arr1.length;i++) {
			arr1[i] = i+1 ;
		}
		
		//값 출력
		for (int i = 0 ; i<arr1.length;i++) {
			System.out.print(arr1[i]+ " ");
		}
		
		System.out.println();
		System.out.println("===================");
		//2. 2차원 배열일 때 : arr2.length
		int[][] arr2 = new int [2][5] ;
		System.out.println(arr2.length); 		//2 - 2차원 배열의 행의 개수
		System.out.println(arr2[0].length);		//5 - 0행의 열의 개수

		//3. 2차원 배열에서 이중 for문을 사용해 값 넣기
		int [][] arr3 = new int[][] {{1,2,3},{4,5,6}};
		for (int i =0 ; i<arr2.length;i++) { //i: 행의 방번호, arr2.length: 행의 개수
			//행의 정보를 출력
			for (int j = 0 ; j<arr3[i].length;j++) { //j:열의 방번호, arr2[i].length: 열의 개수
				//열의 정보를 출력
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
