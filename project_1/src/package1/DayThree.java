package package1;

public class DayThree {
public DayThree(int a, int b,int c)
{
	System.out.println("3 paramatrized");
}
public DayThree()
{
this(3,6,5);
	System.out.println("default");
}
public DayThree(int a,int b)
{
	this();
	System.out.println("2 paramatrized");
}
public DayThree(int a)
{
	this(3,3);
	System.out.println("1 parametrised");
}

public static void main(String[] args) {
	DayThree abc=new DayThree(454);
}
}
