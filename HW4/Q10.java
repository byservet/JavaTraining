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
		String[] nums = new String[] {"1", "9", "10"};
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
	}
	
}
