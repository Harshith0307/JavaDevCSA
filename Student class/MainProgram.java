public class MainProgram 
{
	//public static int callCount = 0;
    public static void main(String[] args) 
	{
		Student harsha = new Student("Harshith", "Dubba", "Renukaprasad", "Sciandra", 16, 11);
		System.out.println(printDivider());
		System.out.println("First Name = " + harsha.getFirstName());
		System.out.println("Middle Name = " + harsha.getMiddleName());
		System.out.println("Last Name = " + harsha.getLastName());
		System.out.println("Homeroom Teacher = " + harsha.getHomeroomTeacher());
		System.out.println("Age = " + harsha.getAge());
		System.out.println("Grade = " + harsha.getGrade());
		System.out.println(printDivider());
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println(printDivider());
		System.out.println(harsha);
		System.out.println(printDivider());
		
		
		/*Code to recursivelly run the main method , got to 1739 times before crashing*/
		
		//MainProgram mainPr = new MainProgram();
		//mainPr.printDivider();
		//String[] str = new String[1];
		//str[0] ="renuka";
		//callCount++;
		//System.out.println("Call count = " + callCount);
		//MainProgram.main(str);
	}
	
	
	public String printDivider()
	{
		return "=====================================================================";
	}
	
	
}