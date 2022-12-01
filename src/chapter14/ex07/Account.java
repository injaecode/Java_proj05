package chapter14.ex07;
//BalanceException <-사용자 정의 예외 생성
class BalanceException extends Exception{
	public BalanceException() {
		super();
	}
	public BalanceException(String message) {
		super(message);
	}
}
public class Account {
	private long balance =1000;
	public Account() {} //기본생성자
	
	public long getBalance() {	//getter: 호출 시 balance필드의 값을 리턴으로 돌려줌
		return balance;
	}
	public void deposit(int money) { //기존의 잔고에서 money 인풋 값을 더해 필드에 재적용
		balance += money;
		System.out.println("잔액은 "+balance+"입니다.");
	}
	//예외 처리 
	public void withdraw(int money) throws BalanceException {
		//잔고가 money보다 적은 경우 '잔고 부족'으로 강제 예외 발생 유도
			//예외 메시지: "잔고가 부족합니다"
		balance -=money;
		
		if(balance<money) {
			throw new BalanceException("잔고가 부족합니다.");
		}else {
			System.out.println("잔액은 "+balance+"입니다.");
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account a = new Account();
		
		a.deposit(4000);
		a.deposit(3000);
		try {
			a.withdraw(8300);
		}catch(BalanceException e) {
			System.out.println(e.getMessage());
		}

	}

}
