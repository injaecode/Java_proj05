package chapter13.ex09;
interface Car{
	void run();
	void stop();
	void start();
}
class CarPlay{
	void abc(Car c1) {
		c1.run();
		c1.start();
		c1.stop();
	}
}
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarPlay a = new CarPlay();
		a.abc(new Car() {
			@Override
			public void run() {
				System.out.println("차는 달립니다.");
				
			}
			@Override
			public void start() {
				System.out.println("차 시동을 겁니다");
			}
			@Override
			public void stop() {
				System.out.println("차가 멈춥니다");
			}
		});
	}

}
