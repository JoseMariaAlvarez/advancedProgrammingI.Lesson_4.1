package split;

public class SplitTest {

	public static void main(String[] args) {
		String[] items1 = "hellow.to all;of you".split("[ ,.;:]");
		for (String s : items1) {
			System.out.println(s);
		}
		
		System.out.println("");

		String[] items2 = "john smith;17..,carpenter".split("[ ;.,]+");
		for (String s : items2) {
			System.out.println(s);
		}

	}

}
