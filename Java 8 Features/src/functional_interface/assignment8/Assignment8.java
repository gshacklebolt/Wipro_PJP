package functional_interface.assignment8;

import java.util.ArrayList;
import java.util.function.Supplier;

public class Assignment8 {

	public static void main(String[] args) {
		Supplier<ArrayList<Integer>> supplier=()->{
			ArrayList<Integer> list=new ArrayList<Integer>();
			for(int i=2;list.size()<10;i++) {
				boolean flag=true;
				for(int j=2;j<=Math.sqrt(i);j++) {
					if(i%j==0) {
						flag=false;
						break;
					}
				}
				if(flag==true)
					list.add(i);
			}
			return list;
		};
		
		ArrayList<Integer> myArr=supplier.get();
		myArr.forEach(System.out::println);
	}

}
