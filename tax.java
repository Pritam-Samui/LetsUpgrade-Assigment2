import java.util.Scanner;
class tax
{
	public static void main(String[] ar)
	{
		Scanner obj=new Scanner(System.in);
		String name;
		int year,month,day,salary,age;
		int saltax=0;
		System.out.println("Enter the Name:-");
		name=obj.nextLine();
		System.out.println("Enter Date of Birth-");
		System.out.print("Day:-");
		day=obj.nextInt();
		System.out.print("Month:-");
		month=obj.nextInt();
		System.out.print("Year:-");
		year=obj.nextInt();
		System.out.print("Salary:-");
		salary=obj.nextInt();
		if(salary<=500000&&salary>400000)
			saltax=(20*salary)/100;
		else if(salary<=400000&&salary>300000)
			saltax=(15*salary)/100;
		else if(salary<=300000&&salary>200000)
			saltax=(10*salary)/100;
		else if(salary<=200000&&salary>100000)
			saltax=(5*salary)/100;
		else
			System.out.println("Salary not greaterthan 5 lakhs and not lessthan 1lakhs");
		age=2020-year;
		System.out.println("*******************************************************");
		System.out.println("*******************************************************");
		System.out.println("Name:-"+name);
		System.out.println("Age:-"+age);	
		System.out.println("Annual Salary:-"+salary);
		System.out.println("Tax on your salary:-"+saltax);
	}	
}




