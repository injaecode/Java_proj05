package chapter14.ex05;


//우리가 생성한 객체를 자동으로 리소스 해체하기
	//AutoClose 인터페이스를 구현해야 한다.
		//close()메소드를 재정의해야 한다.
class A implements AutoCloseable{	//close()메소드를 호출하는 곳에서 예외처리가 필요함
	String resource;
	A (String resource){
		this.resource=resource;
	}
	@Override
	public void close() throws Exception{
		if (resource !=null) {
			resource=null;
			System.out.println("리소스가 해제되었습니다");
		}
	}
}
public class TryWithResource03 {

	public static void main(String[] args) {
		// 1.리소스를 수동으로 제거하기
		A a1 = null;
		try {
			a1=new A("문자열 입력");
			System.out.println(a1.resource);
			System.out.println("=============");
		}catch (Exception e) {
			System.out.println("예외가 발생되었습니다.");
		}finally {
			
			//객체의
			if(a1.resource !=null) {
				try {
					a1.close();
				} catch (Exception e) {
					
					e.printStackTrace();
				}
			}
		}
		System.out.println(a1.resource); //null
		System.out.println("======자동으로 객체 리소스 제거=======");
		//1. 그 객체가 AutoClosable 인터페이스의 close()메소드 재정의 필요
		//2. try(객체를 선언, 생성) 경우 : 자동으로 close()
		
		try(A a2 = new A("생성자필드에 값 입력");){
			System.out.println(a2.resource);//생성자필드에 값 입력
		}catch (Exception e) {
			
		}
	}

}
