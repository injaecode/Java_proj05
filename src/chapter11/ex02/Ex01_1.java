package chapter11.ex02;
class Student1 {
	String name;
	
	void sum_avg() {
		
	}
}
class Student_Sub1 extends Student1{
	int kor;
	int eng;
	int math;
	
	public Student_Sub1(String name, int kor, int eng, int math ) {
		super();
		super.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	@Override
	void sum_avg() {
		int sum = kor + eng + math;
		double avg = sum/3.0;
		System.out.printf("%s 학생의 합계는 %d이고, 평균은 %4.2f입니다.", name, sum, avg);
		System.out.println();
	}

}
public class Ex01_1 {

	public static void main(String[] args) {
		// 1. 객체 생성 후 생성자를 사용해 값 입력
		Student1 s1 = new Student_Sub1("홍길동",70,88,77);
		Student1 s2 = new Student_Sub1("이순신",80,68,87);
		Student1 s3 = new Student_Sub1("김똘똘",60,86,87);
		Student1 s4 = new Student_Sub1("홍길순",77,56,80);
		Student1 s5 = new Student_Sub1("강감찬",55,66,77);
	
		// 2. 생성된 객체를 student배열에 저장
	Student1[] arr = new Student1[] {s1,s2,s3,s4,s5};
	
	
	int[] sum1 = new int[3];
	for (int i = 0 ; i <arr.length;i++) {
		arr[i].sum_avg();
		
		sum1[0] += ((Student_Sub1)arr[i]).kor ;
		sum1[1] += ((Student_Sub1)arr[i]).eng ;
		sum1[2] += ((Student_Sub1)arr[i]).math ;
	
		if (i == arr.length-1) {
			System.out.printf("5명의 국어 점수의 총합은 %d이고 평균은 %4.2f입니다\n",sum1[0],sum1[0]/5.0);
			System.out.printf("5명의 영어 점수의 총합은 %d이고 평균은 %4.2f입니다\n",sum1[1],sum1[1]/5.0);
			System.out.printf("5명의 수학 점수의 총합은 %d이고 평균은 %4.2f입니다\n",sum1[2],sum1[2]/5.0);
		
		}
	}
	
	}
}
