import java.util.Arrays;


public class Test1 {
	
	public void printStormName(String... names) {
		System.out.println(Arrays.toString(names));
	}
	
	public void printStormNames(String[] names) {
		System.out.println(Arrays.toString(names));
	}
	
	public static void main (String args[]) {
		Test1 t = new Test1();
		t.printStormNames("Arlene");
		
	}
}
