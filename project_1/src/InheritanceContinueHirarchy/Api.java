package InheritanceContinueHirarchy;

public class Api extends Automation {
	public void m3()
	{
		System.out.println("Son 2");
	}
	public static void main(String[] args) {
		Api obj =new Api();
		obj.m1();
		obj.m3();
	}
}
