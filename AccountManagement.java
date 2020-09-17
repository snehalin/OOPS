import java.util.Scanner;

/*
 
 Write a program and perform the following steps: Create a class AccountManagement 
 containing following methods: 
 insertData() to insert account details of customers, 
 displayData() to display account details 
 depositAmount() to deposit amount of customer
withdrawAmount() to withdraw amount 
accountBalance() to checkbalance in customer’s account.
The methods should execute as per their specification
 
 
 */
public class AccountManagement {

	String cname;
	int accno;
	double balance;
	static Scanner sc=new Scanner(System.in);
	void insertData()
	{
		
		System.out.println("Enter name,accountno,balance");
		cname=sc.next();
		accno=sc.nextInt();
		balance=sc.nextDouble();
	}
	void displayData()
	{
		System.out.println("Name="+cname+"Acc. no="+
	   accno+""+"Balance="+balance);
	}
	void depositAmount()
	{
		System.out.println("Enter deposite amount:");
		int deposite=sc.nextInt();
		balance=balance+deposite;
		
	}
	void withdrawAmount()
	{
		System.out.println("Enter withdrawl amount:");
		int withdraw=sc.nextInt();
		if(balance>=withdraw)
		{
		 balance=balance-withdraw;
	
		 System.out.println(withdraw+"succefully withdraw");
		}
		 else
			System.out.println("Not sufficient balance");
	}
	void accountBalance()
	{
		System.out.println("Balance="+balance);
	}
	public static void main(String[] args) {
		AccountManagement c1=new AccountManagement();
		c1.insertData();
		int ch=0;
		do
		{
			System.out.println("1:withdraw\n2:deposite\n3:checkbalance\n4:Display "
				+ "account information\n5:stop\n Enter your choice");
				ch=sc.nextInt();
		
				switch(ch)
				{
		case 1:c1.withdrawAmount();
		       break;
		case 2:c1.depositAmount(); 
		       break;
		case 3: c1.accountBalance();
				break;
		case 4:c1.displayData();
				break;
		case 5:	System.exit(0);	
		        break;
		
		default:System.out.println("Please enter between 1-5 only");
		
		}
		}while(ch!=5);
	}

}
