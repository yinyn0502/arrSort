package arrSort;

import java.util.Arrays;

public class arrSort {
	public static void main(String[] args) {
		testArrSort();
	}

	//使用冒泡对数组降序
	private static void testArrSort() {
		// TODO Auto-generated method stub
		int[] arr = { 56, 91, 65, 2, 14 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					arr[j] = arr[j] + arr[j + 1];// 利用两个数的和，将两个数进行原地交换，
					arr[j + 1] = arr[j] - arr[j + 1];
					arr[j] = arr[j] - arr[j + 1];
				}
			}
		}

		System.out.println(Arrays.toString(arr));
	}

}
