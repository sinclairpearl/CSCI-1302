public class University {

	public static void main(String args[])
	{
		Person zack = new Person("Zack","Zack@gmail.com");
		Faculty ann = new Faculty("Ann", "Ann@ung.edu", 72000, "Economics");
		Staff bob = new Staff("Bob", "Bob@ung.edu", 49000, "admin");
		Student john = new Student("John", "john@ung.edu", "junior");

		System.out.println(zack);
		System.out.println(bob);
		System.out.println(john);


		System.out.println(ann);
		ann.setEmail("ann@ung.edu");
		System.out.println(ann.email);



		System.out.println(bob.dateHired);
		System.out.println(ann.dateHired);

		int x = 4;

		for(int i = 1; i <= 5; i+=2)

			x = x + i;

		System.out.println(x);


	}

}