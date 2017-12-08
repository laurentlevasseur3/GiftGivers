public class Account {
	int balance;
	int money;
	String name;
	public Account(String name)
	{
		this.name = name;
		this.balance = 0;
	}
	public void giveMoney(int gift, int people)
	{
		money = gift;
		int leftOvers = money % people;
		money = money / people;
		balance = balance - money + leftOvers;
		
	}
	public void receiveMoney(Account account)
	{
		account.balance += money;
	}
	public int getBalance()
	{
		return balance;
	}
	public String getName() {
		return name;
	}

}
