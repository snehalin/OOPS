
public class ThisDemo {

	int a,b;
	ThisDemo()
	{
		this(100,200);
		a=10;
		b=20;
		System.out.println("DEfault Constructor");
	}
	ThisDemo(int a,int b)
	{
		//this();//calls default constructor
		this.a=a;
		this.b=b;
		System.out.println("Parameterised Constructor");
		
	}
	void display()
	{//this(); //not allowed
	System.out.println("a="+a+"b="+b);
	}
	
	void copy()
	{
		
	}
	public static void main(String[] args) {
		ThisDemo ob=new ThisDemo();
		ob.display();

	}

}
