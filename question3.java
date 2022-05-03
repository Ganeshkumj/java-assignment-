
public class question3 {
public static void main(String args[])
{
	person1 p1=new person1("name1","name2",'M');
	System.out.println("details of person class are mentioned below");
	System.out.println(p1.getFirstName());
	System.out.println(p1.getLastName());
	System.out.println(p1.getGender());
}
}

class person1{
	String FirstName;
	String LastName;
	char gender;
	
	public person1(String firstName, String lastName, char gender) 
	{
		super();
		FirstName = firstName;
		LastName = lastName;
		this.gender = gender;
	}
	public person1()
	{
	System.out.println("this is a default constructor");	
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
}