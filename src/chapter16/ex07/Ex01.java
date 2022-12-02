package chapter16.ex07;
abstract class Fruit{
	abstract void print();	//추상 메소드, 객체의 필드 정보를 출력
	
}
class Apple extends Fruit{
	private String name;
	private int price;
	//getter, setter를 통해 인풋
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	//print(메소드 오버라이딩해서 필드 정보 출력)
	@Override
	void print() {
	System.out.println("품목 : "+name+" / 가격 : "+price);	
	}
			
	
	
}
class Banana extends Fruit{
	private String name;
	private int price;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	void print() {
		System.out.println("품목 : "+name+" / 가격 : "+price);		
	}
}
class Pencil{
	private String name;
	private int price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	void print() {
		System.out.println("품목 : "+name+" / 가격 : "+price);		
	}
}
//제네릭 클래스 : Fruit만 저장할 수 있는 제네릭 클래스
class GenericClass <T> extends Fruit{
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}
public class Ex01 {

	public static void main(String[] args) {
		Apple a1 = new Apple();
		a1.setName("사과");
		a1.setPrice(9000);
		a1.print();
		
		GenericClass<Apple> ap1 = new GenericClass<>();
		ap1.setT(a1);
		ap1.getT().print();
		
		System.out.println("=========");
		Banana b1 = new Banana();
		b1.setName("바나나");
		b1.setPrice(3500);
		b1.print();
		
		GenericClass<Banana> ba1 = new GenericClass<>();
		ba1.setT(b1);
		ba1.getT().print();
		
		System.out.println("=========");
		Pencil p1 = new Pencil();
		p1.setName("연필");
		p1.setPrice(700);
		p1.print();	
		
	}

}
