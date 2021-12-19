package arrays;
/*QuesNo 17 -> The cost of a stock on each day is given in an array,
 *  find the max profit that you can make by buying and selling in those days.*/
public class QuesNo_16_StockBuySellToMaximizeProfit {
    static int maxProfit(int arr[]) {
    	int n = arr.length;
    	int maxProfit = 0;
    	int buy = arr[0];
    	for (int i = 1; i < arr.length; i++) {
			if(buy > arr[i]) {
				maxProfit += ( arr[i-1] - buy);
				buy = arr[i];
			}
			if(i == n-1) {
				maxProfit += ( arr[i] - buy);
			}
		}
    	return  maxProfit;
    }
	public static void main(String[] args) {
		 int price[] =  {4,2,2,2,4};
		 int profit = maxProfit(price);
		 System.out.println("The maximum profit  : " + profit);
	}

}
