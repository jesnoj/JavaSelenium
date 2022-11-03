package Day5;

public class InheritanceContinueMulti extends InheritanceContinue{
	public void p2()
	{
		System.out.println("tata");
	}
	public static void main(String[] args) {
		InheritanceContinueMulti obj=new InheritanceContinueMulti();
				obj.m1();
				obj.m2();
				obj.p1();
				obj.p2();
	}
}
