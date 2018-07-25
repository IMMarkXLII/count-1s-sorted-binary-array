/**
 * @author ashish.adhikari
 */
package algo.count1ssortedbinaryarray;

/**
 * @author ashish.adhikari
 *
 */
public class Count1sSortedBinaryArray {

	public static void main(String[] args) {
		int arr[] = { 1, 1, 1, 1 };
		int n = arr.length;

		int count = count1s(arr, 0, n - 1);
		System.out.println(count);
	}

	/**
	 * @param arr
	 * @param i
	 * @param j
	 * @return
	 */
	private static int count1s(int[] arr, int i, int j) {
		if (j >= i) {
			int mid = i + (j - i) / 2;
			
			if (arr[mid] == 1 && (mid == j || arr[mid + 1] == 0)) {
				return mid + 1;
			}
			if (arr[mid] == 0) {
				return count1s(arr, i, mid - 1);
			}
			return count1s(arr, mid + 1, j);
		}
		return -1;
	}
}
