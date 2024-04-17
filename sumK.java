public class sumK 
{
	static int maxSum(int arr[], int n, int k)
	{
		// Initialize result
		int max_sum = Integer.MIN_VALUE;
		// Consider all blocks starting with i.
		for (int i = 0; i < n - k + 1; i++) 
        {
			int current_sum = 0;
			for (int j = 0; j < k; j++)
				current_sum = current_sum + arr[i + j];

			// Update result if required.
			max_sum = Math.max(current_sum, max_sum);
		}

		return max_sum;
	}

	// Driver code
	public static void main(String[] args)
	{
		int arr[] = { 100, 200, 300, 400};
		int k = 2;
		int n = arr.length;
		System.out.println(maxSum(arr, n, k));
	}
}

/*
 * 
class GFG {
	static int maxSum(int arr[], int n, int k)
	{
		if (n < k) 
        {
			System.out.println("Invalid");
			return -1;
		}

		int max_sum = 0;
		for (int i = 0; i < k; i++)
			max_sum += arr[i];

		int window_sum = max_sum;
		for (int i = k; i < n; i++) {
			window_sum += arr[i] - arr[i - k];
			max_sum = Math.max(max_sum, window_sum);
		}
		return max_sum;
	}

	// Driver code
	public static void main(String[] args)
	{
		int arr[] = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
		int k = 4;
		int n = arr.length;
		System.out.println(maxSum(arr, n, k));
	}
}
 */
