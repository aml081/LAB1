public class Hello
{
	public static void man (String argv[])
	{
	String name = "World";
	if (argv.length != 0)
	{
	name = argv[0];
	}

	System.out.println("Hello, " + name + "!");
	}
}
