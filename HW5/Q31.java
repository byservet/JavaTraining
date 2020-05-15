package chicago;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Loop {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 0;
		for (int i = 10; i > 0; i --) {
			while (i > 3) i -=3;
			k +=1;
		}
		System.out.println(k);
	}

}
