package chicago;

import java.util.Arrays;
import java.util.List;

public class Loop {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> drinks = Arrays.asList("can", "cup");
		for (int container = 0; container < drinks.size(); container ++)
			System.out.println(drinks.get(container) + ",");
	}

}
