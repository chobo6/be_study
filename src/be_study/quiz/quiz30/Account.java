package be_study.quiz.quiz30;

public class Account {
	private String owner;
	private long balance;
	
	Account(){}
	Account(String owner){
		setOwner(owner);
	}
	Account(long balance){
		setBalance(balance);
	}
	Account(String owner, long balance){
		setOwner(owner);
		setBalance(balance);
	}
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public long deposit(long amount) {
		balance += amount;
		return balance;
	}
//	public long withdraw(long amount) {
//		balance -= amount;
//		return balance;
//	}
	public long withdraw(long amount) {
		if(amount > balance) {
			System.out.printf("잔액 %d 보다 인출하려는 금액 %d이 많습니다\n", balance, amount);
			return 0;
		}
		balance -= amount;
		return balance;
	}
	public void showBalance() {
		System.out.printf("%s 고객님의 잔액 : %d\n", owner, balance);
	}
}
