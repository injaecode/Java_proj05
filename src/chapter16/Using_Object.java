package chapter16;
//모든 객체는 Object를 상속하고 있다.
//모든 객체는 Object 타입으로 변환할 수 있다.
		//Object 타입으로 저장된 객체를 가져와 사용하기 위해서는 매번 다운캐스팅이 필요함
class Apple{String apple = "애플";}
class Pencil{String pencil = "연필";}
class Banana{String Banana = "바나나";}
class Orange{String Orange = "오렌지";}

class Goods{	
	//Object는 자바의 모든 객체를 담을 수 있는 타입이다.
	private Object object = new Object();

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}
	
}
public class Using_Object {

	public static void main(String[] args) {
		//1. Goods를 사용해 Apple객체 저장 후 가져오기
		Goods gds1 = new Goods();
		gds1.setObject(new Apple());	//Apple객체를 생성해 setter 주입
		
			//getter를 사용해서 값을 가져올떄는 다운캐스팅 필수
			Object obj = gds1.getObject();
			Apple app1 = (Apple)obj;
			
			Apple app2 = (Apple)gds1.getObject();
		//2. Goods를 사용해 Pencil 객체 저장 후 가져오기
		gds1.setObject(new Pencil());
			Object obj2 = gds1.getObject();
			Pencil pen = (Pencil)obj2;
			System.out.println(pen.pencil);
			
	}

}
