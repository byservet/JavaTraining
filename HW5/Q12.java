package hw5;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> drinks = Arrays.asList("can", "cup");
		for (int container = drinks.size() -1; container >= 0; container --)
			System.out.println(drinks.get(container) + ",");
	}

}
