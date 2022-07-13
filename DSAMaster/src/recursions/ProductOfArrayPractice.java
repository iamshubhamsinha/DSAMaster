package recursions;

public class ProductOfArrayPractice {

	protected int getProductofArray(int[] arr, int length) {
		if(length == 0) {
			return 0;
		} else if(length == 1) {
			return arr[0];
		}
		return arr[length-1] * getProductofArray(arr,length-1);
	}
}