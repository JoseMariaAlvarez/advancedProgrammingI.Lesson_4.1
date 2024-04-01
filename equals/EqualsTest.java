package equals;

public class EqualsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e = new Employee("Frank", 25);
		
		boolean inst  = e instanceof Person;
		System.out.println(inst);
		
	}

}
