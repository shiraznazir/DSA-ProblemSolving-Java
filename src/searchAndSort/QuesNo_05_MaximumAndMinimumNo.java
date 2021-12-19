package searchAndSort;
/*Ques No-05 --> Maximum and minimum of an array using minimum number of comparisons ?*/
public class QuesNo_05_MaximumAndMinimumNo {
	static class Pair{
		int min;
		int max;
	}
	public static Pair getNumber(int arr[]) {
		
		Pair num = new Pair();
		int i;
		
		int n = arr.length;
		if(n == 1) {
			num.max = arr[0];
			num.min = arr[0];
		}
		
		if(arr[0] > arr[1]) {
			num.max = arr[0];
			num.min = arr[1];
		} else {
			num.max = arr[1];
			num.min = arr[0];
		}
		for(i = 2; i < n; i++) {
			if(arr[i] > num.max) {
				num.max = arr[i];
			} else if(arr[i] < num.min) {
				num.min = arr[i];
			}
		}
		return num;
	}
	public static void main(String[] args) {
		int arr[] = { 32, 48, 6, 92, 102, 25};
		Pair num = getNumber(arr);
		System.out.println("The maximum number is : " + num.max);
		System.out.println("The minimum number is : " + num.min);
	}

}
