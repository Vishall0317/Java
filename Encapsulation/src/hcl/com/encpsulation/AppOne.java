package hcl.com.encpsulation;


//revision on Encapsulation

class Account {

	private int acntNum;
	private String holder;
	private double balance;

	public Account(double balance) {
		this.balance=balance;
	}
	public int getAcntNum() {
		return acntNum;
	}

	public void setAcntNum(int acntNum) {
		this.acntNum = acntNum;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		
		if(balance<0) {
			System.out.println("balance never be -ve");
			return;
		}
		this.balance=balance;
	}
}

class FBanker {

	public void accountHelper(Account acnt) {
	
		acnt.setBalance(-55000);
		
		System.out.println(acnt.getAcntNum()+" "+acnt.getHolder()+" "+acnt.getBalance());
	}

}

public class AppOne{

	public static void main(String[] args) {

		Account a1 = new Account(45000.00);
		a1.setAcntNum(1234);
		a1.setHolder("Kiran");
		System.out.println(a1.getAcntNum() + "  " + a1.getHolder() + " " + a1.getBalance());

		FBanker obj = new FBanker();
		obj.accountHelper(a1);

		System.out.println(a1.getAcntNum() + "  " + a1.getHolder() + " " + a1.getBalance());

	}

}