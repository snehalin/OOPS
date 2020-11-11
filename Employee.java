import java.util.Scanner;
//this->it is keyword which reffers current object 
//used to  differenciate between local and instance variable
//to call constructor
public class Employee {
String name;
double Salary;
Employee()//default
{//Initialise object
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter name and Salary");
	name=sc.next();
	Salary=sc.nextDouble();
}
Employee(String name,double salary)
{//Initialise object
	this.name=name;
	Salary=salary;
	
}

void display()
{
	System.out.println("name="+name+" Salary="+Salary);//instance
}
	public static void main(String[] args) {
		//Employee ob1=new Employee();//default
		Employee ob2=new Employee();//default
       Employee ob3=new Employee("Snehali",80000);
		
		//ob1.display();
        //ob2.display();
        ob3.display();
        
       
	}

}
