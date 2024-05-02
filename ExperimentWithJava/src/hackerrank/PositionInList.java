package hackerrank;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PositionInList {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<List<Integer>> myList = new ArrayList<>();
		
		int size = in.nextInt();
		for(int i=0; i< size;i++) {
			int colSize = in.nextInt();
			List<Integer> myCol = new ArrayList<>();
			for(int j=0; j< colSize;j++) {
				myCol.add(in.nextInt());
			}
			myList.add(myCol);
		}
		int querySize = in.nextInt();
		for(int i=0; i< querySize;i++) {
			int x = in.nextInt();
			int y = in.nextInt();
			try {
				System.out.println(myList.get(x-1).get(y-1));
			} catch(Exception e) {
				System.out.println("ERROR!");
			}
			
			
		}
		in.close();
		
		
	}
}
