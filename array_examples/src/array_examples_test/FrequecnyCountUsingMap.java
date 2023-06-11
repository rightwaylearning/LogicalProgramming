package array_examples_test;

import java.util.HashMap;
import java.util.Map;

public class FrequecnyCountUsingMap {

	public static void main(String[] args) {

		Integer[] arr = { 111, 222, 111, 333, 555, 111, 222 };

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {

			if (map.containsKey(arr[i])) {

				Integer count = map.get(arr[i]);
				count++;
				map.put(arr[i], count);

			} else {
				map.put(arr[i], 1);
			}

		}

	}
}
