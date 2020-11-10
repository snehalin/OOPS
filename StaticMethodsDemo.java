//
public class StaticMethodsDemo {
int a;//instance
static int b=30;//static or class variable

void method()
{
	a=10;
}
void nonstaticmethod()//nonstatic
{
	System.out.println("In NonStatic method"+ a+" "+b);//yes both allowed instance,static
	//staticmethod(); allowed
}

static void staticmethod() //static
{StaticMethodsDemo ob=new StaticMethodsDemo();
     ob.method();//a=10
	System.out.println("In Static method="+ob.a+" "+b);
	ob.nonstaticmethod();//not allowed coz nonstatic method requires object
}
	public static void main(String[] args) {
	StaticMethodsDemo s1=new StaticMethodsDemo();
	s1.method();//a=10
	s1.nonstaticmethod();//a=10 b=30
		staticmethod();//Same static

	}

}
