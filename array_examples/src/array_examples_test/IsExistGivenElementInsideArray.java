package array_examples_test;

public class IsExistGivenElementInsideArray {

	public static void main(String[] args) {
		Integer[] arr = {10,1120,30,40,50};
		Integer element = 1120;
		boolean result =  isElementPresent(arr,null);
		System.out.println(result);
		
	}
	
	
	static Boolean  isElementPresent(Integer[] arr,Integer element) {
		
		if(arr != null && element != null) {
		
			for(int i = 0; i< arr.length; i++) {
				if(element.equals(arr[i])) {
					return true;
				}
			}
			
		}
		
		
		return false;
	}
}
