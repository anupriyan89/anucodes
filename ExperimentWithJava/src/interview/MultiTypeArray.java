package interview;

import java.util.ArrayList;
import java.util.List;

public class MultiTypeArray {
	
	/* An input consists of different type elements. ex: [5,6,new Item[3], new Item[new Item[2],4],9] .
	 *  Evaluate the elements: 5+6+2*3+3*2+2*4+9 
	 * */
	
	public static void main(String[] args) {
        List<Object> values = new ArrayList<>();
        values.add(2); // Integer
        values.add(new Item(5));
        values.add(new Item(new Item(3)));
        values.add(4);
        System.out.println("Input: "+values);
        addValues(values);
    }

	private static void addValues(List<Object> values) {
		String num = "[0-9]";
		int sum=0;
		for(Object val: values) {
			if(val.toString().matches(num)) {
				sum=sum+(int)val;
			}
			else if(val.getClass().isInstance(new Item())) {
				
			}
		}
		System.out.println("Output: "+sum);
		
	}

}
