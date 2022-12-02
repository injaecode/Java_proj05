package chapter17.ex02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

//java.lang패키지 하위의 클래스는 생략 가능 (Object, String, Integer,...)
public class CreateObject {

	public static void main(String[] args) {
		// 단순 참고
		//1. ArrayList
		List<Integer> aList1 = new ArrayList();	//내부적으로 메모리공간 10개 확보
		List<Integer> aList2 = new ArrayList(30);	//내부적으로 메모리 공간 30개 확보
		
		//2. Vector
		List<Integer> aList3 = new Vector(); //capacity 10
		List<Integer> aList4 = new Vector(50); //capacity 60
		
		//3. LinkedList
		List<Integer> aList5 = new LinkedList(); //capacity 10
//		List<Integer> aList6 = new LinkedList(60); //오류발생
		
		//컬렉션은 자동으로 방크기가 변동된다 (무한정)
		//Arrays.asList()를 사용해서 값을 넣을 경우 방 크기가 고정되어서 변동되지 않는다.
		//고정된 값만 들어가야 할 경우: 요일, 열두달
		List<Integer> aList7=Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12);
		List<String> aList8=Arrays.asList("월","화","수","목","금","토","일");
		
//		aList7.add(13); 값 추가 불가
//		aList7.remove(0); 값 제거 불가
		
		aList7.set(1,7) ;	//수정은 가능, 1번 방 값 7로 수정
		try {
		aList8.add("오늘");
		}catch(UnsupportedOperationException e) {
			System.out.println("값 추가 불가능");
		}
		try {
		aList8.remove(0); //방 번호
		}catch(UnsupportedOperationException e) {
			System.out.println("방 값을 제거할 수 없습니다.");
		}
		System.out.println(aList7);
		aList8.set(0, "오늘");	//수정 가능
		System.out.println(aList8);


	}

}
