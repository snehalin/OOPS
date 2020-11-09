import java.util.Scanner;

public class Student {
//
	public	int rollno;//instance variables
	       String name;
	       double per;
	      //Constructors
	       //Innerclasses
	       void setData() //Initialising methods
	       {/*name="abc";
	       rollno=1;
	       per=45;*/
	    	   Scanner sc=new Scanner(System.in);
	    	   System.out.println("Enter rollno,name,percentage");
	    	   rollno  = sc.nextInt();
	    	     name=  sc.next();
	      per=sc.nextDouble();
	       }
	       
	       void display()//print
	       {
	    	   System.out.println("Rollno="+rollno+"Name="+name+"Per="+per);
	       }
	       
}
