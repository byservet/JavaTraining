package hw5;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> bottles = Arrays.asList("glass", "plastic");
		for (int type = 0; type < bottles.size();) {
			System.out.println(bottles.get(type) + ",");
		}
		System.out.println("end");
	}

}
