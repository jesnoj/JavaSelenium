package package1;

public class DayFour {
	public DayFour(int a, int b,int c)
	{
		System.out.println("3 paramatrized");
	}
	public DayFour()
	{
	this(3,6,5);
		System.out.println("default");
	}
	public DayFour(int a,int b)
	{
		this();
		System.out.println("2 paramatrized");
	}
	public DayFour(int a)
	{
		this(3,3);
		System.out.println("1 parametrised");
	}

	public static void main(String[] args) {
		DayFour abc=new DayFour(454);
	}
}