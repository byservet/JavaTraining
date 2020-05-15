package chicago;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Loop {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] nycTourLoops = new String[] {"Downtown", "Uptown", "Brooklyn"};
		String[] times = new String[] {"Day", "Night"};
		for (int i = 0, j = 0; i < nycTourLoops.length 
			&& j < times.length; i++, j++){
			System.out.println(nycTourLoops[i] + " " + times[j] + "-");
		}
	}

}
