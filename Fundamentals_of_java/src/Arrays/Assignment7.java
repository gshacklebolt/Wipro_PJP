/*
 7.  Write a program to remove the duplicate elements in an array and print the same.
	Example)
	I/P:{12,34,12,45,67,89}
	O/P:{12,34,45,67,89}
 */
package Arrays;

public class Assignment7 {

	public static void main(String[] args) {
		int[] arr=new int[] {12,34,12,45,67,89};
		int length=arr.length;
		int[] arrCopy=new int[length];

		int i,j;
		for(i=0,j=0;i<length;i++) 
		{
			int flag=1;
			for(int k=0;k<length;k++) 
			{
				if(arrCopy[k]==arr[i])
				{
					flag=0;
				}
			}
			if(flag==1) {
				arrCopy[j]=arr[i];
				j++;
			}
		}
		
		for(i=0;i<j;i++) {
			System.out.print(arrCopy[i]+" ");
		}
	}

}
