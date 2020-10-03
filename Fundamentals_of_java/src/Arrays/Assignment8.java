/*
 8.  Write a program to print the sum of the elements of an array following the given below condition.

If the array has 6 and 7 in succeeding orders, ignore the numbers between 6 and 7 and consider the other numbers for calculation of sum.

Eg1) Array Elements - 10,3,6,1,2,7,9
O/P: 22   
[i.e 10+3+9]

Eg2) Array Elements - 7,1,2,3,6
O/P:19

Eg3) Array Elements - 1,6,4,7,9
O/P:10 
 */
package Arrays;

public class Assignment8 {

	public static void main(String[] args) {
		int[] arr=new int[] {1,6,4,7,9};
		int sum=0;
		int sum2=0,flag=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==6) {
				flag=1;
			}
			sum=sum+arr[i];
			if(flag==1) {
				sum2=sum2+arr[i];
			}
			
			if(arr[i]==7 && flag==1) {
				sum=sum-sum2;
				flag=0;
				sum2=0;
			}
		}
		System.out.print(sum);
	}

}
