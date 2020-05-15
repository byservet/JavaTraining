package chicago;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Loop {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 10;
		List<Character> chars = new ArrayList<>();
		
		do {
			chars.add('a');
			for (Character x: chars) count -=1;
		} while (count > 0);
		System.out.println(chars.size());
	}

}
