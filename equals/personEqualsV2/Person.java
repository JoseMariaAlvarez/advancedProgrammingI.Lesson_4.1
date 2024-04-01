package equals;

public class Person {
	private String name;
	private int age;

	public Person(String n, int a) {
		name = n;
		age  = a;
	}

public boolean equals(Object o) {
			boolean res = o instanceof Person;
			Person p = res ? (Person)o: null;
			return res && age == p.age &&
				     name.equals(p.name);
  	}

}
