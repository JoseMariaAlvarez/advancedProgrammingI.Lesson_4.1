package format;

public class FormatExample {
	public final static double G = 6.67e-11;

	public static void main(String args[]) {
		String ex = "Example string";
		String s = String.format("The length of %s is %d", 
				ex, ex.length());
		String s2 = String.format("The length of %20s is %6d", 
				ex, ex.length());
		System.out.println(s);
		System.out.println(s2);

		String s3 = String.format("G: %f", G);
		System.out.println(s3);

		String s4 = String.format("G: %7.3f", G);
		System.out.println(s4);
	}
}
