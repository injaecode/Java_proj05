package chapter07.ex02;

public class Ex02 {

	public static void main(String[] args) {
		// 두 배열의 각 방의 내용을 더해서 출력하는 메소드 생성
		// 배열 a = 4의 배수를 1~300까지
		int [] a = new int [300/4] ; 
		for (int i = 0, j = 4 ; i < a.length ; i++, j +=4) {
			a[i] = j ; 
		}
		for (int i = 0 ; i < a.length ; i++) {
		System.out.print(a[i]+ " ");
		}
		
		System.out.println();
		
		// 배열 b = 5의 배수를 1~300까지
		int [] b = new int [300/5] ; 
		for (int i = 0, j = 5 ; i < b.length ; i++, j +=5) {
			b[i] = j ; 
		}
		for (int i = 0 ; i < b.length ; i++) {
		System.out.print(b[i]+ " ");
		}
		// 두 배열의 각 방 값을 더해서 출력
		
	}

	// 두 개의 배열을 인풋받아서 각 방 값 더해 출력
	
	
	// addArray(int[] a, int[] b {
	public static void addArray(int[] a) {
		for (int i = 0 ; i<a.length;i++) {
			System.out.println(a[i] + " ");
		}
	}
	// }
	public static void arraySum (int[] a , int[] b) {
		int [] c = new int [75];
		for (int i = 0 ; i<a.length;i++) {
			for (int j = 0 ; j<b.length ; j++) {
				if (i>59) {
					c[i]= a[i] + 0 ;
				}
				if (i ==j){
					c[i] = a[i]+b[j];
				}
			}
		}
	}
}
