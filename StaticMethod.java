//Instance method can access both static n instance members.(variables,methods)
//static methods can access static variables but can not access instance variable directly.  
public class StaticMethod {
int a;
static int b;
	void m1()//instance
	{
		a++;
		b++;
		main();
		m3();
	}
	static void m2() //static
	{
		//a--;
		b--;
		StaticMethod ob=new StaticMethod();
		ob.main();
		m3();
	}
	void main()  //nonstatic
	{
		System.out.println("in main");
	}
	
	static void m3()
	{
		System.out.println("in m3");
	}
	public static void main(String[] args) {
		StaticMethod.m2();
		StaticMethod ob=new StaticMethod();
		ob.m1();
		System.out.println(ob.a+" "+b);
		//ob.main();
	}

}
