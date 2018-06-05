class Student1 implements College
{
	public void name(String name)
	{
		System.out.println("Student's name: "+name);
	}
	public void roll(int roll)
	{
		System.out.println("Student's id: "+roll);
	}
	public void batch(String batch)
	{
		System.out.println("Student's batch: "+batch);
	}
	public void phn(int contact)
	{
		System.out.println("Student's contact number: "+contact);
	}
	public static void main(String args[ ])
	{
		Student1 s1=new Student1();
		Student1 s2=new Student1();
		s1.roll(15);
		s1.name("Priya");
		s1.batch("CSE");
		s1.phn(987);
		s2.roll(30);
		s2.name("Tania");
		s2.batch("ECE");
		s2.phn(988);
	}
}
