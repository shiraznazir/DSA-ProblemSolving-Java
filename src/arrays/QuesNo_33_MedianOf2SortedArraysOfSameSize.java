package arrays;
/*Ques No 33 There are 2 sorted arrays A and B of size n each.
 *  Write an algorithm to find the median of the array obtained 
 *  after merging the above 2 arrays(i.e. array of length 2n)*/
public class QuesNo_33_MedianOf2SortedArraysOfSameSize {
	
	static int median(int arr1[], int arr2[]) {
		
		int n = arr1.length + arr2.length;
		
		int ans [] = new int[n];
		
		int i = 0;
		int j = 0;
		int z = 0;
		
		while(z < n && i < arr1.length && j < arr2.length) {
			if(arr1[i] < arr2[j]) {
				ans[z] = arr1[i];
				i++;
				z++;
			}else if(arr1[i] > arr2[j]) {
				ans[z] = arr2[j];
				j++;
				z++;
			} else {
				ans[z] = arr1[i];
				z++;i++;
				ans[z] = arr2[j];
				z++;j++;
			}
			
		}
		
		if(i == arr1.length - 1) {
			ans[z] = arr1[i];
			
		}
		
		if(j == arr2.length - 1) {
			ans[z] = arr2[j];
		}
		
		for(int items : ans) {
			System.out.print(items + " ");
		}
		System.out.println();
		int mid = n / 2;
		System.out.println("mid value : "  + ans[mid -1]);
		System.out.println("mid value : "  + ans[mid]);
		int median = (ans[mid]  + ans[mid - 1]) / 2;
		return median;
	}
	public static void main(String[] args) {
		int arr1[] = { 1, 13, 15, 26, 38};
		int arr2[] = { 2, 13, 17, 30, 45};
		
		int result = median(arr1, arr2);
		System.out.println(result);
	}

}
