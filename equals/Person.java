package equals;

public class Person {
	private String name;
	private int age;

	public Person(String n, int a) {
		name = n;
		age  = a;
	}

public boolean equals(Object o) {
		boolean res = false;
		if (o instanceof Person) {
			  Person p = (Person) o;
		  res = age == p.age &&
		 name.equals(p.name);
 		}
		return res;
	}

}
