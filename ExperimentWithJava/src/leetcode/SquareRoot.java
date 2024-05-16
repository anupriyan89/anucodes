package leetcode;

public class SquareRoot {

	public static void main(String[] args) {
		int x = 2147395599;
		//int x = 729;
		int start = 1;
		int end = x;
		int result = 0;
		
		while(start <= end){
           int mid = (start + end)/2;
           System.out.println("Test: "+mid);
            if(mid == x/mid) {
            		//mid*mid == x){
            	result = mid;
            	System.out.println("Test1: "+mid);
                break;
            }else if(mid < x/mid){
                start = mid+1;
                result = mid;
                System.out.println("Test2: "+start);
            }else{
                end = mid-1;
               System.out.println("Test3: "+end);
            }
        }
		System.out.println("Result: "+Math.round(result));
	}

}
			