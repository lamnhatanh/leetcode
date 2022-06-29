package leetcode;
import java.util.*;
public class PascalTriangle {
	
	public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        
        if (numRows == 0) return triangle;
        
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);
        
        for (int i=1; i<numRows; i++) {
        	List<Integer> prev_row = triangle.get(i-1);
        	List<Integer> row = new ArrayList<>();
        	
        	row.add(1);
        	
        	for (int j=1; j<i; j++) {
        		row.add(prev_row.get(j-1) + prev_row.get(j));
        	}
        	
        	row.add(1);
        	triangle.add(row);
        }
        
        return triangle;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(generate(5));
	}

}
