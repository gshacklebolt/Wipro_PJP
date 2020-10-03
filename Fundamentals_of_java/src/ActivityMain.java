import java.util.Scanner;

class Activity {
	String name;
	int start,finish;
	Scanner sc;
	
	
	public void setter() {
		sc=new Scanner(System.in);
		System.out.print((1)+".) Enter activity name: ");
		name=sc.nextLine();
		System.out.print("Enter start and finish times: ");
		start=sc.nextInt();
		finish=sc.nextInt();
	}
	
	public void getter(int i) {
		System.out.println((i+1)+".) --> ("+name+", "+start+", "+finish+")");
	}
}

public class ActivityMain {
	
	public void sort(Activity arr[],int n) {
		String t_name;
		int t_start,t_finish;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++) {
				if(arr[i].finish>arr[j].finish) {
					t_name=arr[i].name;
					t_start=arr[i].start;
					t_finish=arr[i].finish;
					
					arr[i].name=arr[j].name;
					arr[i].start=arr[j].start;
					arr[i].finish=arr[j].finish;
					
					arr[j].name=t_name;
					arr[j].start=t_start;
					arr[j].finish=t_finish;
				}
			}
		}
	}

	public static void main(String[] ar) {
		int n,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of activities: ");
		n=sc.nextInt();
		
		Activity ob[]=new Activity[n];
		System.out.println("Enter details");
		
		for(i=0;i<n;i++) {
			ob[i]=new Activity();
			ob[i].setter();
		}
		
		ActivityMain obj=new ActivityMain();
		obj.sort(ob,n);
		
		ob[0].getter(0);
		i=0;
		for(j=1;j<n;j++) {
			if(ob[j].start>=ob[i].finish) {
				ob[j].getter(j);
				i=j;
			}
		}
		sc.close();
	}
}