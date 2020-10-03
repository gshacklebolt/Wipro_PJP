public class Project1 {

	public static void main(String[] args) {
		String employee_info[][]= {
				{"1001","Ashish","01/04/2009","e","R&D","20000","8000","3000"},
				{"1002","Sushma","23/08/2012","c","PM","30000","12000","9000"},
				{"1003","Rahul","12/11/2008","k","Acct","10000","8000","1000"},
				{"1004","Chahat","29/01/2013","r","Front Desk","12000","6000","2000"},
				{"1005","Ranjan","16/07/2005","m","Engg","50000","20000","20000"},
				{"1006","Suman","1/1/2000","e","Manufacturing","23000","9000","4400"},
				{"1007","Tanmay","12/06/2006","c","PM","29000","12000","10000"}
		};
		
		String desig[][]= {
				{"e","Engineer","20000"},
				{"c","Consultant","32000"},
				{"k","Clerk","12000"},
				{"r","Receptionist","15000"},
				{"m","Manager","40000"}
		};
		String res[]= {"","","","",""};

		for(int i=0;i<employee_info.length;i++)
		{
			if(employee_info[i][0].equals(args[0]))
			{
				res[0]=employee_info[i][0];
				res[1]=employee_info[i][1];
				res[2]=employee_info[i][4];
				res[3]=employee_info[i][3];
			    res[4]=Integer.toString(Integer.parseInt(employee_info[i][5])+Integer.parseInt(employee_info[i][6])-Integer.parseInt(employee_info[i][7]));

				for(int j=0;j<desig.length;j++)
				{
					if(desig[j][0].equals(res[3]))
					{
						res[3]=desig[j][1];
						res[4]=Integer.toString(Integer.parseInt(res[4])+Integer.parseInt(desig[j][2]));
					}
				}
			}
		}
		if("".equals(res[0])) {
			System.out.print("There is no employee with empid : "+args[0]);
		}else
		{
			System.out.println("Emp No.\tEmp Name\tDepartment\tDesignation\tSalary");
			System.out.print(res[0]+"\t"+res[1]+"\t"+res[2]+"\t"+res[3]+"\t"+res[4]);
		}
	}
}
