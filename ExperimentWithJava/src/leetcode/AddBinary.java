package leetcode;

public class AddBinary {

	public static void main(String[] args) {
		
		String a = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101", b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
		System.out.println(addBinary(a, b));

	}

	private static String addBinary(String a, String b) {
		
		long result = 0;
		long tempa = Long.parseLong(a);
		
		result = getDecimal(Long.parseLong(a)) + getDecimal(Long.parseLong(b));
		
		return String.valueOf(getBinary(result));
	}
	
	private static long getDecimal(long b) {
		long dec = 0;
		int n = 0;
		while(true) {
			if(b==0) {
				break;
			} else {
				long temp = b%10;
				dec+= temp*Math.pow(2, n);
				b = b/10;
				n++;
			}
		}
		return dec;
	}
	
	private static  long getBinary(long d) {
		long bin = 0;
        int cnt = 0;
        while (d != 0) {
            long rem = d % 2;
            double c = Math.pow(10, cnt);
            bin += rem * c;
            d /= 2;

            cnt++;
        }

		return bin;
	}

}
