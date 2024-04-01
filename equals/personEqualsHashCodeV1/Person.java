class Person {
	private String name;
	private int age;
	public Person(String n, int a) {
		name = n;
		age  = a;
	}

	public boolean equals(Object o) {
		return (o instanceof Person) &&
				(age == ((Person) o).age) &&
				(((Person) o).name.equals(name));
	}

	public int hashCode() {
		return name.hashCode() + Integer.hashCode(age);
	}
}

