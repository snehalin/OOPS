//Object Oriented Programming System/Structure
//Object,Class,Encapsulation,Abstraction,Inheritance,Polymorphism,Method
//Overloading,Method Overridding
//Class-->It is General Logical Entity ,Blueprint of object collection of object
//eg.Student,Animal,,Attributes,Behaviours
//Object-->It is real time Entity
/*class ClassName
 {
 	variables declaration;
 	void display()
 	{
 	}
 }
 
 ClassName objectname=new ClassName();
 objectname.method();
 
 Instance Variables are seperate for seperate Object scope--through out the class
 Static  Shared among objects scope--through out the class 
 Local Variable--which are declared inside method ,scope--limited to method only
 */
public class OOPS {

	public static void main(String[] args) {
	//Student Object 	
    Student s1=new Student();
    Student s2=new Student();
    s1.setData();
    s2.setData();
    
    s1.display();
    s2.display();
    
    
	}

}
