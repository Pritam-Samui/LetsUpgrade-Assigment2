import java.util.Scanner;

class percentage
{
	public static void main(String[] ar)
	{
		int sub[]=new int[5];
		float percentage;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the marks out of 100 of five subject:-");
		int marks=0;
		for(int i=0;i<5;i++)
		{
			sub[i]=obj.nextInt();
			marks=marks+sub[i];
		}
		percentage=(marks*100)/500;
		if(percentage>89&&percentage<=100)
			System.out.println("Your grade is 'A' as you get "+percentage+" percentage.");
		else if(percentage>79&&percentage<=89)
			System.out.println("Your grade is 'A+' as you get "+percentage+" percentage.");
		else if(percentage>69&&percentage<=79)
			System.out.println("Your grade is 'B' as you get "+percentage+" percentage.");
		else if(percentage>59&&percentage<=69)
			System.out.println("Your grade is 'B+' as you get "+percentage+" percentage.");
		else if(percentage>49&&percentage<=59)
			System.out.println("Your grade is 'C' as you get "+percentage+" percentage.");
		else if(percentage>39&&percentage<=49)
			System.out.println("Your grade is 'C+' as you get "+percentage+" percentage.");
		else if(percentage>29&&percentage<=39)
			System.out.println("Your grade is 'D' as you get "+percentage+" percentage.");
		else
			System.out.println("Your grade is 'F' as you get "+percentage+" percentage.");
	       
	}
}