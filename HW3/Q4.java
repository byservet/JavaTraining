package planning;

public class ThePlan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int plan = 1;
		plan = plan++ + --plan;
		if (plan == 1) {
			System.out.println("Plan A");
		} else {
			if (plan == 2) System.out.println("plan b");
			else System.out.println("Plan C");
		}
	}

}
