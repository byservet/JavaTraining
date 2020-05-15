package chicago;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Loop {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		do {
			do {
				count ++;
			} while (count < 2);
			break;
		} while (true);
		System.out.println(count);
	}

}
