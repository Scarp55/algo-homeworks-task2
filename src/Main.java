
public class Main {

	public static void main(String[] args) {

		int[] arr = { 9, 10, 14, 16, 19, 32, 32, 32, 56, 69, 72 };

//		System.out.println(page(arr, 7) + " 7");
//		System.out.println(page(arr, 14) + " 14");
//		System.out.println(page(arr, 15) + " 15");
//		System.out.println(page(arr, 16) + " 16");
//		System.out.println(page(arr, 17) + " 17");
		System.out.println(page(arr, 20) + " 20");
//		System.out.println(page(arr, 32) + " 32");
//		System.out.println(page(arr, 70) + " 70");
//		System.out.println(page(arr, 72) + " 72");
//		System.out.println(page(arr, 73) + " 73");

	}

	public static int page(int[] arr, int i) {
		int left = 0;
		int right = arr.length - 1;
		int resalt = 0;

		while (left < right) {
			int middle = (left + right) / 2;
			if (i < arr[0]) {
				resalt = arr.length;
				break;
			} else if (i >= arr[arr.length - 1]) {
				resalt = 0;
				break;
			} 
			if (i >= arr[middle] && i < arr[middle + 1]) {
				resalt = arr.length - middle - 1;
				break;
			} else if (i < arr[middle]) {
				right = middle - 1;
			} else if (i >= arr[middle]) {
				left = middle + 1;
			}
			if (left == right || right == 1) {
				resalt = arr.length - middle;
				break;
			}
		}

		return resalt;
	}

}