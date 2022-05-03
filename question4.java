
public class question4 {
public static void main(String args[])
{
	person2 p1=new person2("smith",50);
	person2 p2=new person2("kathy",50);
	account acc1=new account(1,50000);
	account acc2=new account(2,50000);
	acc1.setBalance(2000);
	acc2.setBalance(3000);
	acc1.deposit(2000);
	acc2.withdraw(2000);
	System.out.println("smith balance"+acc1.getBalance());
	System.out.println("kathy balance"+acc2.getBalance());
}
}
class person2{
	String name;
	float age;
	public person2(String name, float age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
}


class account{
	long accNum;
	double balance;
	person2 accHolder;
	
	public account(long accNum, double balance, person2 accHolder) {
		super();
		this.accNum = accNum;
		this.balance = balance;
		this.accHolder = accHolder;
	}

	public account(long accNum, double balance) {
		super();
		this.accNum = accNum;
		this.balance = balance;
		//this.accHolder = accHolder;
	}
	
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public person2 getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(person2 accHolder) {
		this.accHolder = accHolder;
	}
	void deposit(double depamount)
	{
		
	}
	void withdraw(double withdrawamount)
	{
		
	}	
}

class savingsaccount extends account{
	public savingsaccount(long accNum, double balance, person2 accHolder) {
		super(accNum, balance, accHolder);
		// TODO Auto-generated constructor stub
	}

	final int minimumbalance=500;

	@Override
	void withdraw(double withdrawamount) {
		// TODO Auto-generated method stub
		super.withdraw(withdrawamount);
		
	}
	
}

class currentaccount extends account{
	public currentaccount(long accNum, double balance, person2 accHolder) {
		super(accNum, balance, accHolder);
		// TODO Auto-generated constructor stub
	}

	int overdraftlimit;

	@Override
	void withdraw(double withdrawamount) {
		// TODO Auto-generated method stub
		super.withdraw(withdrawamount);
	}
	
}