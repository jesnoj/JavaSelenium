package Day5;

public class GlobalVariable {

		int x = 13;

	public void method1(int x)
	{
		this.x = x;
	}
		public static void main(String[] args)
		{
			GlobalVariable obj=new GlobalVariable();
			obj.method1(43);
			System.out.println("Value"+obj.x);
		
		}
}
