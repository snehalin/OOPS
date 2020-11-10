import java.util.Scanner;
//Method Overloading-->Same method name diff arguments
//It is dependent on
//1.No. of Arguments  or 2.datatype of arguments
public class MethodOverloadingDEmo {

	void add()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two values");
		int p=sc.nextInt();
		int y=sc.nextInt();
		System.out.println("sum="+(p+y));
	}
	void add(int a,int b)
	{
		System.out.println("sum="+(a+b));
	}
	/*int add(int a,int b)
	{
		
	}*/
	void add(int a,int b,int c)
	{
		System.out.println("sum="+(a+b+c));
	}
	
	void add(float a,float b)// //nonstatic,Instance
	{
		System.out.println("sum="+(a+b));
	}
	static void m1()  //static 
	{
		System.out.println("In m1 start");
		MethodOverloadingDEmo ob1=new MethodOverloadingDEmo();
		
		ob1.m2();
		System.out.println("In m1 ends");
	}
	void m2() //nonstatic or Instance
	{
		System.out.println("In m2");
	}
	public static void main(String[] args) {
		MethodOverloadingDEmo ob=new MethodOverloadingDEmo();
		
		/*ob.add(2, 3);
		ob.add(1, 2, 3);
		ob.add(6.7f, 6.3f);
		ob.add();*/
		ob.m1();
	}

}
