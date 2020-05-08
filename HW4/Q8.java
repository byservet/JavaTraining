import java.util.Arrays;


public class Test1 {
	
	public void printStormName(String... names) {
		System.out.println(Arrays.toString(names));
		int a = names.length;
		
	}
	int [][] blue = new int [2][2];
	
	public void printStormNames(String[] names) {
		System.out.println(Arrays.toString(names));
	}
	
	public static void main (String args[]) {
		String [] days = new String[] {"sunday", "monday", "tuesday", "wednesday", "thursday", "froder", "saturday"};
		for (int i = 0; i < days.length; i ++)
			System.out.println(days[i]);
		
	}
}
