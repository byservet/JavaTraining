package chicago;

public class Loop {

	private static int count;
	private static String[] stops = new String[] {"Washington", "Monroe", "Jackson", "LaSalle"};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (count < stops.length) {
			if (stops[count++].length() < 8)
				break;
		}
		System.out.println(count);

	}

}
