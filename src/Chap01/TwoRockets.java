package Chap01;

public class TwoRockets {
	public static void main(String[] args)
	{
		toptail();
		line();
		body();
		line();
		words();
		line();
		body();
		line();
		toptail();
	}
	
	public static void toptail()
	{
		System.out.print("   /\\   ");
		System.out.println("   /\\   ");
		System.out.print("  /  \\  ");
		System.out.println("  /  \\  ");
		System.out.print(" /    \\ ");
		System.out.println(" /    \\ ");
	}
	
	public static void line()
	{
		System.out.print("+------+");
		System.out.println("+------+");
		System.out.print("+------+");
		System.out.println("+------+");
	}
	
	public static void body()
	{
		System.out.print("|      |");
		System.out.println("|      |");
		System.out.print("|      |");
		System.out.println("|      |");
	}
	
	public static void words()
	{
		System.out.print("|China |");
		System.out.println("|China |");
		System.out.print("|China |");
		System.out.println("|China |");
	}
}
