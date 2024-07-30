package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {

	public static void main(String[] args) {
		Arrays.asList(generate(5)).forEach(System.out::println);;

	}
	public static List<List<Integer>> generate(int numRows) {
		
		List<List<Integer>> triangle = new ArrayList<>() ;
		List<Integer> rows ;
		int one = 1;
		
		
		for(int i=0; i<numRows; i++) {
			rows =  new ArrayList<>();
			for(int j=0; j<i+1; j++) {
				
				if(i<2 || (i>=2 && (j==i || j==0))) {
					rows.add(one);
				} else  {
					rows.add(triangle.get(i-1).get(j)+triangle.get(i-1).get(j-1));
				}
			}
			
			triangle.add(rows);
			
		}
	
		
		return triangle;
        
    }

}
