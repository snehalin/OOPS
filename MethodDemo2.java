import java.util.Scanner;

public class MethodDemo2 {
//with returntype no argument
	int add()
	{
		int a,b;
		a=10;
		b=30;
		int c=a+b;
		return c;
	}
	int sub()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two values");
		int p=sc.nextInt();
		int y=sc.nextInt();
		return (p-y);
	}
	public static void main(String[] args) {
		MethodDemo2 ob=new MethodDemo2();
		int result=ob.add();
		System.out.println("Result="+result);//40
         System.out.println("Result="+ ob.add());//40
         System.out.println("Sub result="+ob.sub());
	}

}
