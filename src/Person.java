
public class Person extends Object {
	private String name;
	private String gender;
	
	public Person(String name, String gender)
	{
		this.name = name;
		this.gender = gender;
	}

	public String getName()
	{
		return name;
	}
	public String getGender()
	{
		return gender;
	}
	
	@Override
	public String toString()
	{
		return String.format("%s SEX:%s",name,gender);
	}
}
