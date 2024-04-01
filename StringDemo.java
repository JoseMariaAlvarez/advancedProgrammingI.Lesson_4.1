public class StringDemo {
	public static void main(String[] args) {
		String str = "Tina has a Fan";
		int len = str.length();
		StringBuilder str2 = new StringBuilder(len);
		char c;
		for (int i = 0; i < len; i++) {
			c = str.charAt(i);
			if (c == 'T') {
				c = 'G';
			} else if (c == 'F') {
				c = 'C';
			}
			str2.append(c);
		}
		System.out.println(str2);
	}
}