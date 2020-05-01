package voting;

public class Election {

	public void calcalateResult(Integer candidateA, Integer candidateB) {
		boolean process = candidateA == null || candidateA.intValue() < 10;
		boolean value = candidateA && candidateB;
		System.out.println(process || value);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Election().calcalateResult(null, 203);
	}	

}
