/*     1             2 ,5 ,8        4,7
 for(initialization;condition;incre/decre)
 {
 	stmts; 3,6
 }
 
 
 
 */
public class ForDemo {

	public static void main(String[] args) {
		            		
		for(int i=1;i<=10;i++)
		{
			if(i==3)
				System.exit(0);
			if(i%2==0)
			{
				continue;
			}
			if(i==7)
				break;
			System.out.println(i);//135
		}
		System.out.println("End");
	}

}
