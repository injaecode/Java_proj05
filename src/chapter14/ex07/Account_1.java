package chapter14.ex07;

public class Account_1 {
	private long balance = 1000;
	public Account_1() {}
	public long getBalance() {
		return balance;
		}
	//예금
		public void deposit(int money) {
			balance += money;
		}
	//출금
		public void withdraw(int money) throws BalanceException {
			if (balance<money) {
				System.out.println("현재 잔고 "+ balance + ", 출금 금액 : "+money);
				throw new BalanceException("예금 잔고가 "+(money-balance)+"원 부족합니다.");			
			}else {
				balance -= money;
			}
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
