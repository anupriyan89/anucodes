package leetcode;

public class ClimbStairs {

	public static void main(String[] args) {
		
		System.out.println(climbStairs(5));

	}
	public static int climbStairs(int n) {
		
		if(n==1 || n==0) {
			return 1;
		}
		int[] val = new int[n+1];
		val[0] = 1;
		val[1] = 1;
		for(int i=2;i<=n;i++) {
			val[i] = val[i-1] + val[i-2];
		}
		return val[n];
        
    }
	

}
