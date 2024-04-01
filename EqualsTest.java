import equals.Person;
import equals.Employee;

public class EqualsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e = new Employee("Frank", 25);
		Person f = new Person("Frank", 25);
		
		boolean inst  = e instanceof Person;
		System.out.println(inst);
		System.err.println(f.equals(e));
		
		String s1 = "thirst";
		String s2 = "Thirsty";
		System.out.println(s1.compareToIgnoreCase(s2));
		
	}

}
