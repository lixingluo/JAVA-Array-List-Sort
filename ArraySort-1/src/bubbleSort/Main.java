package bubbleSort;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[] scoreArr1 = new int[] { 9, 3, 4, 2, 12, 8, 11 };
		int[] scoreArr2 = new int[] { 9, 3, 4, 2, 12, 8, 11 };

		printArr(scoreArr1);
		printArr(scoreArr2);

		bubbleSort1(scoreArr1);
		printArr(scoreArr1);
		bubbleSort2(scoreArr2);
		printArr(scoreArr2);

		run(scoreArr1);
	}

	public static void bubbleSort1(int[] scoreArr) {
		for (int i = 0; i < scoreArr.length - 1; i++) {
			for (int j = i + 1; j < scoreArr.length; j++) {
				if (scoreArr[i] > scoreArr[j]) {
					int temp = scoreArr[j];
					scoreArr[j] = scoreArr[i];
					scoreArr[i] = temp;
				}
			}
		}
		System.out.println("After Bubble Sort 1");
	}

	public static void bubbleSort2(int[] scoreArr) {
		for (int i = 0; i < scoreArr.length - 1; i++) {
			for (int j = 0; j < scoreArr.length - 1 - i; j++) {
				if (scoreArr[j] > scoreArr[j + 1]) {
					int temp = scoreArr[j + 1];
					scoreArr[j + 1] = scoreArr[j];
					scoreArr[j] = temp;
				}
			}
		}
		System.out.println("After Bubble Sort 2");
	}

	public static int[] insertNewElement(int[] scoreArr, int newScore) {
		int[] newScoreArr = new int[scoreArr.length + 1];
		int insertPosition = newScoreArr.length - 1;

		for (int i = 0; i < scoreArr.length; i++) {
			if (newScore < scoreArr[i]) {
				insertPosition = i;
				break;
			}
		}

		for (int j = newScoreArr.length - 1; j > insertPosition; j--) {
			newScoreArr[j] = scoreArr[j - 1];
		}
		for (int i = 0; i < insertPosition; i++) {
			newScoreArr[i] = scoreArr[i];
		}
		newScoreArr[insertPosition] = newScore;

		return newScoreArr;
	}

	public static void run(int[] scoreArr) {
		System.out.println("Please input new student score");
		Scanner scanner = new Scanner(System.in);
		int newScore = scanner.nextInt();
		int[] newScoreArr = insertNewElement(scoreArr, newScore);
		System.out.println("After inserting");
		printArr(newScoreArr);

		// isContinue(scoreArr);
		isContinue(newScoreArr);
	}

	public static void isContinue(int[] scoreArr) {
		System.out.println("Continue inserting ? ");
		Scanner scanner = new Scanner(System.in);
		String inputChoiceString = scanner.next();
		if (inputChoiceString.equals("y")) {
			run(scoreArr);
		}
		System.out.println("End");
	}

	public static void printArr(int[] arr) {
		System.out.println("Print Array");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
	}
}
