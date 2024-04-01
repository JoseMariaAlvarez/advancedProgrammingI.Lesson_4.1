package fileName;

public class FileName {
	private String path;
	private char pathSeparator, extensionSeparator;

	public FileName(String str, char sep, char ext) {
		path = str;
		pathSeparator = sep;
		extensionSeparator = ext;
	}
	public String extension() {	
		int pto = path.lastIndexOf(extensionSeparator);
		return path.substring(pto + 1);
	}
	public String name() {
		int pto = path.lastIndexOf(extensionSeparator);
		int sep = path.lastIndexOf(pathSeparator);
		return path.substring(sep + 1, pto);
	}
	public String directory() { 
		String dir = null;
		// implement this method (exercise)
		dir = path.substring(0, path.lastIndexOf(pathSeparator) + 1);
		return dir;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileName fn =
	new FileName("/users/jmalvarez/Documents/exam.pdf",
			     '/', '.');
		System.out.println(fn.directory());
		// expected output: /user/jmalvarez/Documents/"
	}

}
