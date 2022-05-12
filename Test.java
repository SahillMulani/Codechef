public class Test
{
	private String name;
	public Test(String name)
	{
		this.name = name;
		System.out.println("Object Created");
	}
	public Test()
	{
		System.out.println("This is constructor with any arguments");
	}
	public static void main(String[] args)
	{
		Test t = new Test();
		Test t1 = t;
		t.name = "Sahil";
		t1.name = "Sahil Mulani";

		System.out.println(t.name);
		
	}
}