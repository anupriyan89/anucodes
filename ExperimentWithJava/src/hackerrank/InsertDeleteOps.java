package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsertDeleteOps {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		List<Integer> numbers = new ArrayList<>();
		for(int i=0;i<size;i++) {
			numbers.add(in.nextInt());
		}
		int opSize = in.nextInt();
		for(int i=0;i<opSize;i++) {
			String op = in.next();
			if("Insert".equals(op)) {
				int index = in.nextInt();
				int val = in.nextInt();
				numbers.add(index, val);
				
			} 
			//System.out.print(op);
			if("Delete".equals(op)) {
				int index = in.nextInt();
				
				numbers.remove(index);
			}
		}
		for(Integer num: numbers) {
			System.out.print(num+" ");
		}
		in.close();

	}

}
