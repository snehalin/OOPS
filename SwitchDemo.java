import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		//char n='1';//49
		//String n="seven";
		Scanner sc=new Scanner(System.in);
		int ch=0;
		do
		{
		System.out.println("Enter String for day");
		String n=sc.next();
		int i=1;
		
		switch(n)
		{
		case "1":System.out.println("Mon");
				//break;
		case "2":System.out.println("Tue");
				//break;
		case "3":System.out.println("Wed");
		break;
		case "4":System.out.println("Thur");
		break;
		case "8":System.exit(0);
		case "6":System.out.println("Sat");
		break;
		case "5":System.out.println("Fri");
		break;
		case "seven":System.out.println("Sun");
		break;
		default:System.out.println("Plz enter between 1-7");		
		}
		System.out.println("do u want to continue? press 0 to stop");
		 ch=sc.nextInt();
		}while(ch!=0);
	System.out.println("");	
	}

}
