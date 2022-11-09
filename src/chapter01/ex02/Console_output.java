package chapter01.ex02;

public class Console_output {

	public static void main(String[] args) {
		System.out.println("안녕하세요!");
		System.out.println("안녕"+"하세요"); //문자열+문자열 = +연결연산자
		System.out.println(2+4);
		System.out.println("문자"+1);
		System.out.print("반갑");
		System.out.print("습니다\n"); 
		System.out.println("문자"+1+2);
		System.out.println(1+2+"문자");
		System.out.println("=============");

		System.out.print("반갑");
		System.out.print("습니다");
		System.out.print(7 +"\n");
		
		System.out.print("안녕 \t" + "하세요.");
		
		System.out.printf("오늘의 날짜는 %d월 %d일입니다 \n", 11,07);
		System.out.printf("8진수 10을 불러옵니다: %o \n", 10);
		System.out.printf("뒤의 값을 16진수로 불러옵니다 :%x \n", 10);
		System.out.printf("%s은 %s가 매우 매우 %s니다 \n","오늘","날씨","맑습");
		
		int a = 5;
				System.out.println(a);
				String b = "하세요";
				System.out.println(b);
				System.out.println(a+"안녕"+b);	
	

		System.out.printf("나의 몸무게는 %4.2f입니다 \n",75.1234567);
		System.out.printf("오늘의 온도는 %4.1f도이고, %s %4.2f입니다.",17.33, "나의 몸무게는",75.7);

	}

}
