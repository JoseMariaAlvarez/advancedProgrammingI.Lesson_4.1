package equals.personEqualsHashCodeV2;

public class Person {
	private String name;
	private int age;
	public Person(String n, int a) {
		name = n;
		age  = a;
	}

	public boolean equals(Object o) {
		return (o instanceof Person) &&
				(age == ((Person) o).age) &&
				(((Person) o).name.equalsIgnoreCase(name));
	}

	public int hashCode() {
		return name.toLowerCase().hashCode() + 
				Integer.hashCode(age);
	}
}