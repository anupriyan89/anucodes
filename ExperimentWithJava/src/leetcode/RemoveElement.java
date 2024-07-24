package leetcode;

public class RemoveElement {
	public static void main(String[] args) {
		System.out.println(removeElement(new int[] {1,5,5,7,5}, 5));
	}

	private static int removeElement(int[] num, int n) {
		
		int j =0;
		for(int i=0;i<num.length;i++) {
			
			if(num[i]==n) {
				continue;
				
			} else {
				num[j] = num[i];
				j++;
			}
		}
		
		return j;
	}

}
