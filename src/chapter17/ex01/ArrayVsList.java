package chapter17.ex01;
//배열과 컬렉션의 차이
//	1. 배열 : 동일한 타입을 저장/방 크기 고정(수정 불가)
//	2. 컬렉션 : 동일 타입 저장, 제네릭 타입, 객체 생성 시 타입을 지정해 저장
//			: 방의 크기가 고정되지 않아 자동으로 변동 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayVsList {

	public static void main(String[] args) {
		// 1. 배열
		String [] arr = new String[] {"가", "나", "다","라","마","바","사"};
		//배열 방의 크기 출력
		System.out.println(arr.length);	//7
			//배열의 방 값 삭제 시 자동으로 방의 크기가 줄어들지 않는다. 비어있음
		arr[2]=null;
		arr[5]=null;
		
		//배열의 값 출력
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length);
		
		System.out.println("====================");
		
		// 2. 컬렉션(List) <-arraylist
		
		//List : 인터페이스, 객체화 할 수 없다. 타입은 지정 가능
			//ArrayList<>, Vector<>, LinkedList<>
		List<String> aList = new ArrayList<>(); 
		
		//List: 방의 크기를 알려주는 메소드 : aList.size(
		System.out.println(aList.size());	//방의 크기를 알려줌
		
		//List에 값 넣기 .add()
		aList.add("가");aList.add("나");aList.add("다");aList.add("라");
		aList.add("마");aList.add("바");aList.add("사");
		
		System.out.println(aList.size());
		
		//방의 값 출력
		System.out.println(aList);
		System.out.println(aList.toString());
		
		//컬렉션의 값 삭제 .remove()
		aList.remove("다");
		aList.remove("바");
		System.out.println(aList);
	}

}
