package chicago;

import java.util.Arrays;
import java.util.List;

public class Loop {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean ballonInflated = false;
		do {
			if (!ballonInflated) {
				ballonInflated = true;
				System.out.println("inflate-");
			}
		}while (! ballonInflated);
		System.out.println("done");
	}

}
