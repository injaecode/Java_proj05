package chapter05.ex09;

public class Ex01_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("=== STEP 1 : args배열로 들어오는 모든 내용 출력 ===");
		for (int i = 0; i<args.length; i++) {
			System.out.println(args[i]+ " ");
		}
		System.out.println();
		System.out.println();
	
		System.out.println("=== STEP 2 : 기본 출력 ===");
		System.out.println();

		System.out.println("\t국어\t영어\t수학\t과학\t<합계>\t<평균>   ");
		System.out.println("================================================================");
		

		for (int i =0; i<args.length;i++) {
			if(i%5==0) {
				if (i!=0) {
					System.out.println();
				}
			}
		System.out.print(args[i]+ "\t");
		}
		System.out.println();
		System.out.println("=================================================================");
		System.out.println("<합계> : ");
		System.out.println("<평균> : ");
		
		System.out.println();
		System.out.println();
		System.out.println("=== STEP 3 : 합계/평균 계산후 출력 ===");
		
		int sum1 = 0 ;
		double avg1 = 1.0;
		//아래 라인의 합계 및 평균 변수 선언
		int korSum = 0 ;
		int engSum = 0 ;
		int mathSum = 0 ;
		int sienceSum = 0 ;

		double korAvg =1.0;
		double engAvg = 1.0 ;
		double mathAvg = 1.0 ;
		double sienceAvg = 1.0 ;
		
		//allSum, allAvg
		int allSum =0 ;
		double allAvg =1.0;
	
		System.out.println("\t국어\t 영어\t수학\t과학\t<합계>\t<평균>   ");
		System.out.println("================================================================");
		for (int i = 0 ; i<args.length; i++) {
			if(i%5==0) {		//5의 배수일 때 개행, 0일때는 제외
				if(i !=0) {
			System.out.println();
				}
			}
			//sum1, avg1
			if (i%5==0) {
				sum1 =0 ;
			}
			if (i%5!=0) {
				sum1 += Integer.parseInt(args[i]);
			}
			System.out.print(args[i]+"\t");
			
			//출력
			if (i==4||i==9||i==14||i==19) {
				avg1=sum1/4.0 ;
			System.out.print(sum1+"\t"+avg1);
		}
			//마지막 라인 삽입
			if (i==args.length-1) {
				System.out.println();
		System.out.println("=================================================================");
			}
		//아래 라인에 합계 및 평균 구하기
		
		
		}	
		
	}

}
