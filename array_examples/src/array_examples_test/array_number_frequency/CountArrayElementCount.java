package array_examples_test.array_number_frequency;

public class CountArrayElementCount {

	public static void main(String[] args) {

		Integer[] arr = {10,20,10,20,20};
		
		CountFrequency[] store =  countElementFrequency(arr);
		
		for (int i = 0; i < store.length; i++) {
			System.out.println(store[i]);
		}

	}

	static CountFrequency[] countElementFrequency(Integer[] arr) {
		
		if(arr!= null) {
			int index =0 ;
			CountFrequency[] store = new CountFrequency[arr.length];
			
			for (int i = 0; i < arr.length; i++) {
				
				if(isPresent(store,arr[i])) {
				
				}else {
					CountFrequency obj = new CountFrequency();
					obj.setElement(arr[i]);
					obj.setCoount(1);
					store[index] = obj;
					index++;
				}
				
			}
			return store;
		}
		return null;
	}


    static Boolean isPresent(CountFrequency[] store, Integer element) {
    	
    	if(store != null && element != null) {
    		
    		for (int i = 0; i < store.length; i++) {
				
    			if(store[i] != null &&  element.equals(store[i].getElement())) {
    				
    				 Integer count = store[i].getCoount();
    				 count++;
    				 store[i].setCoount(count);
    				 return true;
    			}
    			
			}
    		
    	}
    	
    	
    	return false;
    }



}
