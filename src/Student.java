
public class Student extends Person{
	
	private int grade;
	
	public Student(String studentName, String studentGender, int studentGrade)
	{
		super(studentName, studentGender);
		this.grade = studentGrade;
	}	
	
	/*public String getName()
	{
		return name;
	}*/
	
	public int getGrade()
	{
		return grade;
	}
	
	public void setGrade(int studentGrade)
	{
		this.grade = studentGrade;
	}
	
	/*public void setName(String studentName)
	{
		this.name = studentName;
	}*/
	@Override
	public String toString()
	{
		return String.format("%s grade: %d", super.toString(),grade);
	}

}
