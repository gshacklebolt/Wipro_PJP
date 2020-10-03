/*
 14. Write a program to find the biggest number in a 3*3 array. The program is supposed to receive 9 integer numbers as command line arguments.


Example1:
C:\>java Sample 1 2 3
O/P: Please enter 9 integer numbers

Example2:
C:\>java Sample 1 23 45 55 121 222 56 77 89
O/P: 
The given array is :
1 23 45 
55 121 222 
56 77 89 
The biggest number in the given array is 222
 */
package Arrays;

public class Assignment14 {

	public static void main(String[] args) {
		int[][] arr=new int[3][3];
		int counter=0;
		int biggest_number;
		if(args.length<9) {
			System.out.print("Please enter 9 integer numbers");
		}
		else {
			System.out.println("The given array is :");
			biggest_number=Integer.parseInt(args[0]);
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					arr[i][j]=Integer.parseInt(args[counter++]);
					System.out.print(arr[i][j]+" ");
					if(arr[i][j]>biggest_number) {
						biggest_number=arr[i][j];
					}
				}
				System.out.print("\n");
			}
			System.out.print("The biggest number in the given array is "+biggest_number);
		}
	}

}
