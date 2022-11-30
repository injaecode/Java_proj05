package chapter14.ex03;

public class MultiCatch02 {

	public static void main(String[] args) {
		//여러개의 Exception을 한번에 처리
		try {
			System.out.println(3/0);
			int [] arr = new int[] {1,2,3};
			System.out.println(arr[4]);
			int num = Integer.parseInt("20A");	
		} catch (Exception e) {
			// try블락에서 어떤 예외가 발생되었는지 알 수 있도록 출력
			System.out.println(e.getMessage());	//간략한 정보 출력
			e.printStackTrace(); 				//자세한 정보 출력
		}
	}

}
