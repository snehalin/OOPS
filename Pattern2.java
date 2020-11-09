/*
 ABCDEFGFEDCBA
 ABCDEF FEDCBA   n=6  s=1
 ABCDE   EDCBA   n=5  s=3
 ABCD     DCBA   n=4  s=5 
 ABC       CBA   n=3  s=7
 AB         BA
 A           A  n=1
 
 
 
*/
public class Pattern2 {
public static void main(String args[])
{char ch='A';
	while(ch<='G')
	{
		System.out.print(ch++);
	}
	
	ch--;//ch=G
	ch--;//ch=F
	while(ch>='A')
	{
		System.out.print(ch--);
	}
	
	int n=6;
	int s=1;
	System.out.println();
	for(int i=1;i<=6;i++)
	{ch='A';
		for(int j=1;j<=n;j++)//left char
		{
			System.out.print(ch);//ABCDEF*FEDCBA  i=1
			ch++;                //ABCDE***EDCBA                 n=5 s=3 i=2
		}//ch=F
		for(int k=1;k<=s;k++)//space
		{
			System.out.print("*");
		}
		ch--;//E
		for(int j=1;j<=n;j++)//right char
		{
			System.out.print(ch);
			ch--;
		}
		System.out.println();
		n--;
		s=s+2;
		
	}
	System.out.println("-------------------");
	
	/*
	 
	 *
	***
   *****
  *******
 *********	 
	 */
	n=10;
	s=1;
	for(int i=1;i<=n;i++)
	{for(int j=i;j<n;j++)//space j=n-1;j>=i;j--
	{
		System.out.print(" ");
	}
	for(int k=1;k<=s;k++)//*
	{
		System.out.print("*");
	}
	s=s+2;
	System.out.println();
	}
	
	
	
	
	
	
	
}
}
