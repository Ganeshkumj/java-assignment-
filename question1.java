
public class question1 {
public static void main(String args[])
{
	person p1=new person("name1","name2",16,"M",70);
	person p2=new person("name2","name3",30,"M",70);
	person p3=new person("name5","name6",50,"M",70);

}
}
class person{
	
	public person(String firstname, String lastname, int age, String gender, int weight) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.gender = gender;
		this.weight = weight;
		System.out.println("FirstName:"+firstname);
		System.out.println("LastName:"+lastname);
		System.out.println("age:"+age);
		System.out.println("gender:"+gender);
		System.out.println("weight:"+weight);
		System.out.println();
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	String firstname;
	String lastname;
	int age;
	String gender;
	int weight;
}