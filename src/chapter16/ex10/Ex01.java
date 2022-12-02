package chapter16.ex10;
//제네릭 클래스와 메소드를 사용해 두 점의 좌표 값으로 넓이를 구하는 프로그램 작성

//두 점의 좌표를 처리하는 클래스 생성 <제네릭 클래스>
class Point<X, Y>{
	X x;
	Y y;
	//생성자를 사용해 x, y의 값 입력
	Point() {}		//기본생성자
	Point(X x, Y y){	//x좌표, y좌표
		this.x=x;
		this.y=y;
	}
	//getter만 생성
	public X getX() {
		return x;
	}
	public Y getY() {
		return y;
	}
	
}

//제네릭 메소드 : 일반 클래스 내부에 제네릭 메소드
class GenericMethod{
	public static<T, V> double makeRectangle (Point<T,V>p1, Point<T,V>p2) {
		double left= ((Number)p1.getX()).doubleValue();
		double right= ((Number)p2.getX()).doubleValue();
		double top= ((Number)p1.getY()).doubleValue();
		double bottom= ((Number)p2.getY()).doubleValue();
		
		double width = right-left;
		double height = bottom-top;
		
		return width*height;//넓이를 리턴
	}
	
}
public class Ex01 {

	public static void main(String[] args) {
		// 두 점의 좌표를 저장하는 p1, p2
		Point<Integer,Double>p1 = new Point<>(10,10.0);
		Point<Integer,Double>p2 = new Point<>(7,3.2);
		//makeRectangle (p1,p2)매개변수로하여 계산
		double result = GenericMethod.<Integer,Double>makeRectangle(p1, p2);
		System.out.println(result);
	}

}
