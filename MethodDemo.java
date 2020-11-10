import java.util.Scanner;

//Method-->It is set of statements which performs specific task
//syntax
/*
accessmodifier returntype mathodname([arguments])
 {
 	stmts;
 }
4 types
1.No returntype No arguments
2.No Returntype with arguments
3.with returntype No arguments
4.with Returntype with arguments

*/
public class MethodDemo {
//No Returntype with arguments
	void add(int a,int b)//dummy parameter,imformal
	{
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		MethodDemo  m1=new MethodDemo ();
		m1.add(10,20);//actual parameter
		int p=21,b=22;
		m1.add(p, b);//formal
		m1.add(p, 30);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two values");
		p=sc.nextInt();
		int y=sc.nextInt();
		m1.add(p, y);
		
		//StaticMethodsDemo.staticmethod();
		
	}

}
