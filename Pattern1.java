/*
 *****
 *****
 *****
 *****
 *****
 */
public class Pattern1 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)//row
		{
			for(int j=1;j<=5;j++)//col
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	System.out.println("______________________________");	
		
	for(int i=1;i<=5;i++)//row
	{
		for(int j=1;j<=5;j++)//col //12345
		{
			System.out.print(j);
		}
		System.out.println();
	}
		
		
	System.out.println("______________________________");	
	
	for(int i=1;i<=5;i++)//row
	{
		for(int j=1;j<=5;j++)//col //
		{
			System.out.print(i);//11111
		}                       //22222
		System.out.println();
	}
		
	System.out.println("______________________________");	
	
	for(int i=10;i<15;i++)//row
	{
		for(int j=5;j>=1;j--)//col
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}	
		
		
	System.out.println("______________________________");	
	
	for(int i=1;i<=5;i++)//row
	{              //1<=4
		for(int j=1;j<=i;j++)//col //1     i=1 j=1
		{                          //12    i=2 j=1,2
			System.out.print(j);   //123
		}                          //1234
		System.out.println();      //12345
	}
		
	/*
	12345
	1234
	123
	12
	1
	 	
	 */
	
	System.out.println("______________________________");	
	
	for(int i=1;i<=5;i++)//row
	{
		for(int j=1;j<=6-i;j++)//col 
		{
			System.out.print(j);
		}
		System.out.println();
	}
	/*
	54321
	5432
	543
	54
	5
	*/
	
	
	
	
	System.out.println("______________________________");	
	
	for(int i=1;i<=5;i++)//row
	{
		for(int j=5;j>=i;j--)//col //12345
		{
			System.out.print(j);
		}
		System.out.println();
	}
	/*
	12345
	2345
	345
	45
	5
	45
	345
	2345
	12345*/
	System.out.println("______________________________");	
	for(int i=1;i<=5;i++)//row
	{
		for(int j=i;j<=5;j++)//col //12345
		{
			System.out.print(j);
		}
		System.out.println();
	}
	
	for(int i=4;i>=1;i--)//row
	{
		for(int j=i;j<=5;j++)//col //
		{
			System.out.print(j);
		}
		System.out.println();
	}
	/*             i     j
	 1             1     1
	 21            2     2,1 
	 321           3     3,2,1
	 4321          4     4,3,2,1
	 54321         5     5,4,3,2,1
	 */
	System.out.println("___________________________");
	for(int i=1;i<=5;i++)
	{
		for(int j=i;j>=1;j--)
		{
			System.out.print(j);
		}
		//System.out.println();
	}
	System.out.println("___________________________");
	
	System.out.println("--------------");
	for(int i=7;i>=3;i--) {
		System.out.print(i);//76543
	}
	
	System.out.println("\n--------------");
	for(int i=3;i<=7;i++) {
		System.out.print(i);
	}
	
	System.out.println("-----------------");
	/*
1	 10101
2	 10101
3	 10101
4	 10101
5	 10101
	 
	 12345
	 */
	System.out.println("--------------");
	for(int i=11;i<=15;i++)
	{
		for(int j=21;j<=25;j++)
		{
			if(j%2==1)//oddcoulmn
			  System.out.print("1");
			else //even column
			   System.out.print("0");
		}	
		System.out.println();	
	}
	/*
1	 101010
2	 010101
3	 101010         i+j % 2==0  print 1
                     else       print 0
     123456
	 */
	System.out.println("---------------");
	
	for(int i=1;i<=3;i++)
	{
		for(int j=1;j<=6;j++)
		{
			if((i+j)%2==0)
				System.out.print("1");
			else
				System.out.print("0");
		}
	 	System.out.println();
	
	}
	System.out.println("---------------");
	
/*
1	 101010
2	 010101
3	 101010
    
     123456
 
 */
	System.out.println("--------------");
	for(int i=1;i<=3;i++)
	{
		for(int j=1;j<=6;j++)
		{
			if(i%2==1 && j%2==1 || i%2==0 && j%2==0)//row and column both are odd
				System.out.print("1");
			else
				System.out.print("0");
		}
		System.out.println();
	}
	
/*	
 1	 1
2	 01
3	 101
 * 
 * 
	1	 1
	2	 01
	3	 101
	4    0101
	5    10101
	*/
	
System.out.println("------------");
	
	
for(int i=1;i<=5;i++)
{
	for(int j=1;j<=i;j++)
	{
		if((i+j)%2==0)
			System.out.print("1");
		else
			System.out.print("0");
	}
 	System.out.println();

}
	
System.out.println("------------");	

/*
 A
 AB
 ABC
 ABCD
 ABCDE
 */

for(int i=1;i<=5;i++)
{
	char ch='A';
	for(int j=1;j<=i;j++)//fixed
	{
		System.out.print(ch);//A
		ch++;
	}
	System.out.println();
}

/*
 ABCDEFG
 ABCDEF
 ABCDE
 ABCD
 ABC
 AB
 A
 
 */
System.out.println("---------------");

for(int i=7;i>=0;i--)
{char ch='A';
	for(int j=i;j>=1;j--)
	{
		System.out.print(ch);//A
		ch++;
	}
	System.out.println();
	}


/*
 
 ******
 $*****
 $$****
 $$$***  i=4
 $$$$** 
 $$$$$* 
 */
	System.out.println("------------");
	for(int i=1;i<=6;i++)
	{               //2<=4
		for(int j=2;j<=i;j++)
		{
			System.out.print(" ");
		}
		for(int k=6;k>=i;k--)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	
	
	
	
	
	

}
}
	
		
