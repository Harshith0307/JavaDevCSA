import java.util.Scanner;

public class HelloWorld 
{
    public static void main(String[] args) 
	{
		String userName = getString("What is your name: ");
        System.out.println("Hello, "+userName+"!"); 
		
    }
	
	public static String getString(String prompt)
	{
		Scanner input = new Scanner(System.in);
		System.out.println(prompt);
		return input.nextLine();
	}
	
	public static int getInt(String prompt)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println(prompt);
		return scan.nextInt();
	}
}