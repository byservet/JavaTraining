package chicago;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Loop {

	private static int count;
	private static String[] stops = new String[] {"Washington", "Monroe", "Jackson", "LaSalle"};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (count < stops.length) {
			if (stops[count++].length() < 8) {
				continue;
			}
		}
		System.out.println(count);
		
	}

}
