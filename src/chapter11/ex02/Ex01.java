package chapter11.ex02;

class Student{
	String name;
	
	Student(){}
	Student(String name){
		this.name=name;
	}
	void sum_avg() {
		
	}
}
class Student_Sub extends Student {
	int kor;
	int eng;
	int math;
	
	Student_Sub(String name, int kor, int eng, int math){
		super();
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	
	//부모의 sum_avg() 오버라이딩해서 객체의 합계와 평균을 출력하는 메소드 
	@Override
	void sum_avg() {
		int sum = kor+eng+math;
		double avg = (kor+eng+math)/3.0;
		System.out.println(name + " 학생의 성적 합계는 " + sum + " 평균은 " + avg);

	}

}
public class Ex01 {

	public static void main(String[] args) {
		/* 생성자를 사용해 객체 생성 시 필드 값을 할당하고 
		 * 홍길동 70 88 77
		 * 이순신 80 68 87
		 * 김똘똘 60 86 87
		 * 홍길순 77 56 80
		 * 강감찬 55 66 77
		 * 
		 * Student배열변수 arr 변수에 모든 객체를 저장해서 (업캐스팅)
		 * 배열의 값을 for문으로 출력할 때 오버라이딩 된 메소드 출력
		 * 학생별 성적 합계와 평균
		 * 5명 학생의 과목별 합계, 평균 (다운캐스팅)
		 */
		Student_Sub s1 = new Student_Sub("홍길동",70,88,77);
		Student_Sub s2 = new Student_Sub("이순신",80,68,87);
		Student_Sub s3 = new Student_Sub("김똘똘",60,86,87);
		Student_Sub s4 = new Student_Sub("홍길순",77,56,80);
		Student_Sub s5 = new Student_Sub("강감찬",55,66,77);
		
		Student_Sub[] arr1 = new Student_Sub[] {s1,s2,s3,s4,s5} ;
		
		
		for (int i =0;i<arr1.length;i++) {
			arr1[i].sum_avg();
		
		}
	}


}
