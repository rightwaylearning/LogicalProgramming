package array_examples_test;

public class CountFrequencyOfGivenNumber {

	public static void main(String[] args) {
		
		Integer[] arr = {1,2,3,2,4,5,62,3,4,2,2};
		Integer element = 2;
		System.out.println(countFequencyOfNumber(arr, element));
	}
	
	
	
	static Integer countFequencyOfNumber(Integer[] arr, Integer element) {
		Integer frequency = 0;
          
		 if(arr != null && element != null) {
			 
			 for (int i = 0; i < arr.length; i++) {
				  
				 if(element.equals(arr[i])) {
					 frequency++;
				 }
			}
		 }
		
		
		
		return frequency;
	}
}