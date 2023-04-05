
public class Prog5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[] = {5,6,-4,3,1};
		int arr2[] = {3,8,9,11};
		
		int arr3[] = new int[9];
		
		System.arraycopy(arr1, 0, arr3, 0, 5);
		System.arraycopy(arr2, 0, arr3, 5, 4);
		
		
		for(int elem: arr3) {
			
			System.out.println(elem);
		}
		
	}

}
