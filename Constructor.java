//Constructor is special method which is used to initialise object
//This get called automatically when u create an object
//It does not have any return type.
//It has same name as  a class Name.
//It can have parameter
public class Constructor {

	int a,b;//Instance
	
	Constructor()
	{
		//initialise
		a=10;
		b=20;
	}
	void setData()
	{
		a=10;
		b=20;
	}
	void display()
	{
		System.out.println("a="+a+"b="+b);
	}
	
	public static void main(String[] args) {
		
		Constructor c1=new Constructor();
		//c1.setData();
		c1.display();
	}

}
