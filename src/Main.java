
public class Main {

	public static void main(String[] args) {

		int[] arr = { 14, 16, 19, 32, 32, 32, 56, 69, 72};

		System.out.println(page(arr, 4) + " 4");
		System.out.println(page(arr, 20) + " 20");
		System.out.println(page(arr, 32) + " 32");
		System.out.println(page(arr, 60) + " 60");
		System.out.println(page(arr, 70) + " 70");
		System.out.println(page(arr, 72) + " 72");

	}

	public static int page(int[] arr, int i) {
		int resalt = 0;

		if (i < arr[0]) {
			return arr.length;
		} else if (i >= arr[arr.length - 1]) {
			return 0;
		}
		
		int left = 0;
		int right = arr.length - 1;

		while (true) {
			
			int middle = (left + right) / 2;
			if (i >= arr[middle] && i < arr[middle+1]) {
				return arr.length - middle-1;
			} else if (i < arr[middle]) {
				right = middle-1;
			} else if (i >= arr[middle]) {
				left = middle+1;
			}
		}

	}

}