package io.searchins.algo;
// this is recursive implementation of Binary Search..
public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
		int element = 6;
		int length = arr.length;
		int index = binarySearch(arr, 0, length, element);

		if (index != -1) {
			System.out.println("Element " + element + " is found at index: " + index);
		} else {
			System.out.println("Element not found in array.");
		}

	}

	private static int binarySearch(int[] arr, int left, int right, int element) {
		if (left <= right) {
			int mid = (left + right) / 2; // left + (right - left)/ 2;
			if (arr[mid] == element) {
				return mid;
			} else if (arr[mid] > element) {
				return binarySearch(arr, left, mid, element);
			} else if (arr[mid] < element) {
				return binarySearch(arr, mid, right, element);
			}
		}

		return -1;
	}

}
