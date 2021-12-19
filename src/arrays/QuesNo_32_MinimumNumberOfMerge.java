package arrays;
/*Ques No-->32 Find minimum number of merge operations to 
 * make an array palindrome ?*/
public class QuesNo_32_MinimumNumberOfMerge {
	static int noOfMerge(int arr[]) {
		int n = arr.length;
		int merge = 0;
		int i = 0;
		int j = n-1;
		while(i < j) {
			if(arr[i] == arr[j]) {
				i++;
				j--;
			} else {
				arr[i] = arr[i] + arr[i+1];
				merge++;
				j--;
			}	
		}
		return merge;
	}
	public static void main(String[] args) {
		int arr[] =  {11, 14, 15, 99, 77, 11};
		
		int merge = noOfMerge(arr);
		System.out.println(merge);
	}

}
