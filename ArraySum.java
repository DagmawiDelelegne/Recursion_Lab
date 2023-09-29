package Recursion_Lab;

public class ArraySum {
	public int sumOfArray (Integer[] a,int index) {
		if (index < 0 || index >= a.length) {
	        return 0; 
	    }
		  return a[index] + sumOfArray(a, index - 1);
		}
}
