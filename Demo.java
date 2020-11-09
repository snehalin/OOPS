
public class Demo {
 int a=10;//Instance
 static int b=20;
	void m1()
	{
		int c=30;//local
		a++;
		b++;
	}
	void display()
	{
		System.out.println("a="+a+"b="+b);
		}
	public static void main(String[] args) {
		Demo d1=new  Demo();
		Demo d2=new  Demo();
		d1.m1();
		d2.m1();
		d1.display();
		d2.display();
	}

}
