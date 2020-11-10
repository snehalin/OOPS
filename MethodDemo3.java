import java.util.Scanner;

public class MethodDemo3 {
//with retruntype and with argument
	
	double add(double a,double b)
	{
		return a+b;
	}
	public static void main(String[] args) {
		MethodDemo3 ob=new MethodDemo3();
		double d=ob.add(12.5,78);
		System.out.println("d="+d);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two values");
		int p=sc.nextInt();
		int y=sc.nextInt();
		System.out.println("Sum="+ob.add(p, y));
	}

}
