
public class ArraysHomework {

	public static void main(String[] args) {
		double[] values = toPower(4,2);
		for(double value: values) {
			System.out.println(value);
		}
	}

	public static double[] toPower(int size, int power) {
		double[] squared = new double[size];
		for (int i=0; i<size; i++) {
			squared[i] = Math.pow(i, power);
			
		}
			return squared;
	}
	
	
}
