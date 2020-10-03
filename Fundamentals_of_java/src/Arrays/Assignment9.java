/*
  Print a version of the given array where all the 10's have been removed. The remaining elements should shift left towards the start of the array as needed, and the empty spaces at the end of the array should be 0. So {1, 10, 10, 2} yields {1, 2, 0, 0}. You may modify and display the given array or make a new array.

withoutTen([1, 10, 10, 2]) -> [1, 2, 0, 0]
withoutTen([10, 2, 10]) -> [2, 0, 0]
withoutTen([1, 99, 10]) -> [1, 99, 0]
 */
package Arrays;

public class Assignment9 {
	public static int[] withoutTen(int[] arr) {
		
		//Initialize a new Array of the same length as the argument and set everything in it to 0
		int [] newArr=new int[arr.length];
		for(int i=0;i<newArr.length;i++) newArr[i]=0;
		
		//Copy only the values which are not equal to 10 from the argument to the new array 
		for(int i=0,j=0;i<arr.length;i++) {
			if(arr[i]!=10) {
				newArr[j]=arr[i];
				j++;
			}
		}
		return newArr;
	}
	public static void main(String[] args) {
		int []arr = withoutTen(new int[]{1, 99, 10});
		
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}

}
