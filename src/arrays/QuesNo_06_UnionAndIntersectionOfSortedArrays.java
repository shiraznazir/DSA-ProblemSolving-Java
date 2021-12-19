package arrays;
/* QuesNo-06-Find the Union and Intersection of the two sorted arrays.
*/
public class QuesNo_06_UnionAndIntersectionOfSortedArrays {
	static void unionAndIntersection(int a1[], int a2[]) {
		int n = a1.length;
		int m = a2.length;
		int un[] =  new int[n + m];
		int in[] = new int[n];
		int i = 0, j = 0, p = 0, q = 0;
		while(i < n && j < m) {
			if(a1[i] < a2[j]) {
				un[p] = a1[i];
				p++;
				i++;
			} else if(a1[i] == a2[j]) {
				un[p] = a1[i];
				in[q] = a1[i];
				i++;j++;p++;q++;
			} else if(a1[i] > a2[j]) {
				un[p] = a2[j];
				p++;j++;
			}
		}if(i < n) {
			un[p] = a1[i];
			i++;p++;
		}
		if(j < m) {
			un[p] = a2[j];
			j++;p++;
		}
		System.out.println("Union Array : ");
		for(int item: un) {
			System.out.print(item + " ");
		}
		System.out.println();
		System.out.println("Intersection Array : ");
		for(int item: in) {
			System.out.print(item + " ");
		}
	}
	static void printUnion(int arr1[], int arr2[]) {
		
		int n = arr1.length;
		int m = arr2.length;
		int i = 0, j = 0;
		while(i < n && j < m) {
			if(arr1[i] < arr2[j]) {
				System.out.print(arr1[i++] + " ");
			} else if(arr1[i] == arr2[j]) {
				System.out.print(arr1[i++] + " ");
				j++;
			} else if(arr1[i] > arr2[j]) {
				System.out.print(arr2[j++] + " ");
			}
		}
		if(i < n) {
			System.out.print(arr1[i++] + " ");
		}
		if(j < m) {
			System.out.print(arr2[j++] + " ");
		}
	}
	public static void main(String[] args) {
		int arr1[] = {1, 3, 4, 5, 7};
        int arr2[] = {2, 3, 5, 6};
        unionAndIntersection(arr1,arr2);

	}

}
