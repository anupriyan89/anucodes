package leetcode;

public class BestBuySellStock {

	public static void main(String[] args) {
		System.out.println(maxiProfit(new int[] {7,6,4,3,1}));

	}
	
	 public static int maxProfit(int[] prices) {
		 int result= 0;
		 for(int i=0;i<prices.length;i++) {
			 for(int j=i;j<prices.length;j++) {
				 
				 if(prices[j]-prices[i] > result) {
					 result = prices[j]-prices[i];
				 }
			 }
			 if(result<0) {
				 result = 0;
			 }
		 }
		 return result;
	        
	    }
	 
	 public static int maxiProfit(int[] prices) {
		 
	        int result = 0, temp = 0;
	        int val = prices[0];
	        for(int i = 0; i < prices.length; i++){
	        	
	            if(prices[i] < val){
	                val = prices[i];
	            }
	            temp = prices[i] - val;
	            if(result < temp){
	            	result = temp;
	            }
	        }
	        return result;
	    }
		 
	 

}
