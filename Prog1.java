
public class Prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RandomNumbers rn = new RandomNumbers();

		double pi = Math.PI;
		double x = rn.getRandomInt(1, 9);
		double computePI = Math.pow(pi, x);
		
		double y = rn.getRandomInt(3,14);
		double computeY = Math.pow(y, pi);
		
		System.out.println("Value " + x + " for pi^x is: " + computePI);
		System.out.println("Value " + y + " for y^pi is: " + computeY);
				
				
	}

}
