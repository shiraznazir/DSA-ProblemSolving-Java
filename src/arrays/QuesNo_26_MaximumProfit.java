package arrays;
/*Ques No 26 --> Maximum profit by buying and selling a share at most twice*/
public class QuesNo_26_MaximumProfit {
	
	static int maxProfit(int arr[]) {
		
		int n = arr.length;
		int profit = 0;
		int min = 1;
		int max = 1;
		int buy = arr[0];
		int sell = 0;
		
		if(n < 2) {
			sell = arr[1];
			profit = sell - buy;
		}
		
		for(int i = 2; i < n; i++){
			if(arr[min] > arr[i]){
				min = i; 
			}
			if(arr[max] < arr[i] && max > min) {
				max = i;
			}
		}
		sell = arr[max];
		
		if(sell - buy > 0) {
			profit += sell - buy;
		}
		
		buy = arr[min];
		max  = min;
		for (int j = max + 1; j < n; j++) {
			if(arr[max] < arr[j]) {
				max = j;
			}
		}
		sell = arr[max];
		
		if(sell - buy > 0) {
			profit += sell - buy;
		}
		return profit;
	}
	public static void main(String[] args) {
		
		int price[] = {100, 30, 15, 10, 8, 25, 80};
		int profit = maxProfit(price);
		System.out.println("The maximum profit : " + profit);
	
	}

}
