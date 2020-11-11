
public class CopyDemo {
int x,y;
CopyDemo(int x,int y)
{
	this.x=x;
	this.y=y;
}
void display()
{
	System.out.println("x="+x+"y="+y);
}
 void copy(CopyDemo c)
 {
	x=c.x;//c1.x=c2.x
	y=c.y;//c1.y=c2.y
 }

	public static void main(String[] args) {
		
		CopyDemo c1=new CopyDemo(10,20);
		CopyDemo c2=new CopyDemo(30,40);
		c1.copy(c2);
		c1.display();
		c2.display();
	}

}
