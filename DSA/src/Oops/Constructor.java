package Oops;

public class Constructor {

	String Name;
	int age;
	String course;

	public void printinfo() {
		System.out.println(this.Name);
		System.out.println(this.age);
		System.out.println(this.course);
	}

//	Constructor(String name, int Age, String Course) {
//		this.Name = name;
//		this.age = Age;
//		this.course = Course;
//	}
	public Constructor(Constructor s2)
	{
		this.Name =s2.Name;
		this.age = s2.age;
		this.course =s2.course;
	}
	Constructor()
	{
		
	}

	public static void main(String[] args) {

		Constructor s = new Constructor();
		s.Name="Ehtesham";
		s.age=22;
		s.course="BCA";
	  //s.printinfo();
		
		
		Constructor s2 =new Constructor(s);
		s2.printinfo();
		
//		s.Name = "Ehtesham";
//		s.age = 22;
//		s.course = "Bca";
		// s.printinfo();

	}
}
