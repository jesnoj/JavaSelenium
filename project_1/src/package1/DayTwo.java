package package1;
public class DayTwo {
public int sum(int a,int b)
{
	int c;
	c=a+b;
	System.out.println("result is"+c);
	return c;
}
public int sub(int d,int e)
{
	int f;
	f=d-e;
	System.out.println("result is"+f);
	return f;
}
public int mul(int w,int y)
{
	int z;
	z=w*y;
	System.out.println("result is"+z);
	return z;
}
public void div(int s,int r)
{
	int x;
	x=s/r;
	System.out.println("final is"+x);
}
public static void main(String[] args) {
	
	DayTwo abc=new DayTwo();
	int sumresult=abc.sum(10, 2);
	int subresult=abc.sub(sumresult, 2);
	int sumresult1=abc.sum(subresult, 2);
	int mulresult=abc.mul(sumresult1,2);
	abc.div(mulresult, 2);
	
	int m=abc.mul(10, 2);
	int sb=abc.sub(m, 2);
	int sm=abc.sum(sb, 2);
	int sb1=abc.sub(sm,2);
	abc.div(sb1, 2);
}
}
