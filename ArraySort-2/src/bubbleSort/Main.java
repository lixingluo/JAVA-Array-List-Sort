package bubbleSort;

public class Main {
	public static void main(String[] args) {
		int[] unsorted_arr_1 = { 60, 55, 45, 35, 25, 10 };
		int[] unsorted_arr_11 = { 10, 25, 35, 45, 55, 60 };
		int[] unsorted_arr_111 = { 10, 55, 45, 35, 25, 60 };

		int[] unsorted_arr_2 = { 60, 55, 45, 35, 25, 10 };
		int[] unsorted_arr_22 = { 10, 25, 35, 45, 55, 60 };
		int[] unsorted_arr_222 = { 10, 55, 45, 35, 25, 60 };

		printArray(unsorted_arr_1, 1);
		printArray(unsorted_arr_11, 11);
		printArray(unsorted_arr_111, 111);

		printArray(unsorted_arr_2, 2);
		printArray(unsorted_arr_22, 22);
		printArray(unsorted_arr_222, 222);

		int outside_loop_1 = bubbleSort1(unsorted_arr_1);
		int outside_loop_11 = bubbleSort1(unsorted_arr_11);
		int outside_loop_111 = bubbleSort1(unsorted_arr_111);
		
		System.out.println("Outside Loop 1 : " + outside_loop_1);
		System.out.println("Outside Loop 11 : " + outside_loop_11);
		System.out.println("Outside Loop 111 : " + outside_loop_111);
		
		int outside_loop_2 = bubbleSort2(unsorted_arr_2);
		int outside_loop_22 = bubbleSort2(unsorted_arr_22);
		int outside_loop_222 = bubbleSort2(unsorted_arr_222);
		
		System.out.println("Outside Loop 2 : " + outside_loop_2);
		System.out.println("Outside Loop 22 : " + outside_loop_22);
		System.out.println("Outside Loop 222 : " + outside_loop_222);
		
	}

	public static int bubbleSort1(int[] arr) {
		int count = 0;

		int unsorted_last_index = arr.length - 1;
		boolean unsorted = true;
		while (unsorted) {
			unsorted = false;
			for (int i = 0; i < unsorted_last_index; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					unsorted = true;
				}
			}
			count++;
		}
		return count;
	}

	public static int bubbleSort2(int[] arr) {
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			count++;
		}
		return count;
	}

	public static void printArray(int[] arr, int index) {
		System.out.println("Print Array " + index + " : ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println("");
	}
}
