package arrSort;

import java.util.Arrays;

public class arrSort {
	public static void main(String[] args) {
		testArrSort();
	}

	//ʹ��ð�ݶ���ֵ���н���  
	private static void testArrSort() {
		// TODO Auto-generated method stub
		int[] arr = { 56, 91, 65, 2, 14 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					arr[j] = arr[j] + arr[j + 1];// �����������ĺͣ�������������ԭ�ؽ�����
					arr[j + 1] = arr[j] - arr[j + 1];
					arr[j] = arr[j] - arr[j + 1];
				}
			}
		}

		System.out.println(Arrays.toString(arr));
	}

}
