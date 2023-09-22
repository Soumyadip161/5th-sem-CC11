package bean.com;
import java.util.*;
public class clientserver {
	public void credit(bankserver b,double amt)
	{
		double initial,clearing_balance;
		initial=b.get_Balance();
		clearing_balance=initial+amt;
		b.set_Balance(clearing_balance);
		System.out.println("The available account balance is "+clearing_balance);
	}
	public void debit(bankserver b,double amt)
	{
		double initial,clearing_balance;
		initial=b.get_Balance();
		clearing_balance=initial-amt;
		b.set_Balance(clearing_balance);
		System.out.println("The available account balance is "+clearing_balance);
	}
	public static void main(String args[])
	{
		int ch;
		Scanner sc=new Scanner(System.in);
		bankserver b=new bankserver();
		System.out.println("Enter Username");
		String user=sc.nextLine();
		b.set_Username(user);
		System.out.println("Enter Userid");
		String uid=sc.nextLine();
		b.set_Userid(uid);
		System.out.println("Enter Password");
		String pw=sc.nextLine();		
		b.set_Password(pw);
		System.out.println("Enter Account_no");
		long acno=sc.nextLong();
		b.set_Account_no(acno);
		System.out.println("Enter Opening Balance");
		double opbal=sc.nextLong();
		b.set_Balance(opbal);
		while(true) {
			System.out.println("Enter 1 to display details");
			System.out.println("Enter 2 to deposit");
			System.out.println("Enter 3 to withdraw");
			System.out.println("Enter 4 to exit this menu");
			ch=sc.nextInt();
			clientserver cs=new clientserver();
			switch(ch)
			{
			case 1:
			{
				System.out.println("Username "+b.get_Username());
				System.out.println("User id: "+b.get_Userid());
				System.out.println("Account no "+b.get_Account_no());
				System.out.println("Available balance "+b.get_Balance());
				break;
			}
			case 2:
			{
				System.out.println("Enter the deposit ammount ");
				double amt=sc.nextInt();
				cs.credit(b, amt);
				break;
			}
			case 3:{
				System.out.println("Enter the withdraw ammount ");
				double amt=sc.nextInt();
				cs.debit(b, amt);
				break;
			}
			case 4:
				System.exit(0);
			default:
				System.out.println("Pod marao");
			}
			
		}
	}

}


Client server
