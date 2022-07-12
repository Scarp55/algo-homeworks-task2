
public class Main {

	public static void main(String[] args) {

		int[] arr = { 9, 10, 14, 16, 19, 32, 32, 32, 56, 69, 72 };

		System.out.println(page(arr, 7) + " 7");
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
		int resalt = 0;

		if (i < arr[0]) {
			return arr.length;
		} else if (i >= arr[arr.length - 1]) {
			return 0;
		}

		int left = 0;
		int right = arr.length - 1;


		return resalt;
	}

}