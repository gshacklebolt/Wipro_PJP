/*
 13. Write a program to reverse the elements of a given 2*2 array. Four integer numbers needs to be passed as Command Line arguments.

Example1)
C:\>java Sample 1 2 3
O/P: Please enter 4 integer numbers

Example2)
C:\>java Sample 1 2 3 4
O/P: 
 The given array is :
  1 2 
  3 4 
 The reverse of the array is :
  4 3 
  2 1
 */
package Arrays;

public class Assignment13 {

	public static void main(String[] args) {
		int[][] arr=new int[2][2];
		int[][] revArr=new int[2][2];
		int counter=0;
		if(args.length<4) {
			System.out.print("Please enter 4 integer numbers");
		}
		else {
			System.out.println("The given array is :");
			for(int i=0;i<2;i++) {
				for(int j=0;j<2;j++) {
					arr[i][j]=Integer.parseInt(args[counter++]);
					System.out.print(" "+arr[i][j]);
				}
				System.out.print("\n");
			}
			
			System.out.println("The reverse of the array is :");
			for(int i=1,k=0;i>=0;i--,k++) {
				for(int j=1,l=0;j>=0;j--,l++) {
					revArr[k][l]=arr[i][j];
					System.out.print(" "+revArr[k][l]);
				}
				System.out.print("\n");
			}
		}
	}

}
