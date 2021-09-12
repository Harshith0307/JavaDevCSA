public class Student
{
    private String firstName;
	private String middleName;
	private String lastName;
	private String homeroomTeacher;
	private int age;
	private int grade;
	
	public Student(String fName, String mName, String lName, String hTeacher, int a, int g)
	{
		firstName = fName;
		middleName = mName;
		lastName = lName;
		homeroomTeacher = hTeacher;
		age = a;
		grade = g;
	}
	
	public String toString()
	{
			return "First Name - " + firstName + "\nMiddle Name - " + middleName + "\nLast Name - " 
			+ lastName + "\nHomeroom Teacher - " + homeroomTeacher + "\nAge - " + age + "\nGrade - " + grade;
	}
	//first name 
	public String getFirstName()   
    {  
        return firstName;  
    }  
    public void setFirstName(String fname)   
    {  
        firstName = fname;  
    } 
	//middle name
	public String getMiddleName()   
    {  
        return middleName;  
    }  
    public void setMiddleName(String mname)   
    {  
        middleName = mname;  
    } 
	//last name
	public String getLastName()   
    {  
        return lastName;  
    }  
    public void setLastName(String lname)   
    {  
        lastName = lname;  
    } 
	
	//homeroom teacher
	public String getHomeroomTeacher()   
    {  
        return homeroomTeacher;  
    }  
    public void setHomeroomTeacher(String teach)   
    {  
        homeroomTeacher = teach;  
    }
	
	//age
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int ag)
	{
		age = ag;
	}
	
	//grade
	public int getGrade()
	{
		return grade;
	}
	
	public void setGrade(int gr)
	{
		grade = gr;
	}
	
	
	
	
}