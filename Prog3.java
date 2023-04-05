
public class Prog3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String arr[] = {"horse", "dog", "cat", "horse", "dog"};
		
		for(String elem: RemoveDups(arr)) {
			
			System.out.println(elem);
		}

	}
	public static String[] RemoveDups(String arr[]) {
		
		String newarr[] = new String[arr.length];
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			boolean isDup = false;
			
			for(int j = i+1; j < arr.length; j++) {
				
				if(arr[i] == arr[j]) {
					
					isDup = true;
					break;
				}
			}
			
			if(!isDup) {
				
				newarr[count++] = arr[i];
			}
		}
		
		String retArray[] = new String[count];
		int k = 0;
		
		for(int i = 0; i < retArray.length; i++) {
			
			retArray[k++] = newarr[i];
		}
		
		return retArray;
	}
}
