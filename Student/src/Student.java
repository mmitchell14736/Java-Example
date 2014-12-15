
public abstract class Student {

	String name;
	boolean fullTimeStatus;
	
	public Student(String name, boolean fullTime)
	{
		this.name = name;
		fullTimeStatus = fullTime;
	}
	
	public abstract int calcTuition(int crHr);
	
}
