package day7_Workshop;
import java.util.Scanner;

public class WorkShop1_UC2
{
	public static void letter(char s)
	{
		System.out.println(s);
		int i;
		//j = 0;
		char [] arr=new char[9];
		for(i=0;i<9;i++)
		{
			//for(j=0;j<3;j++)
			//{
				if(arr[i]!=0)
				{
					//arr[i][j]=s;
					break;
				}
				if(arr[i]==0)
				{
					arr[i]=s;
				}
				break;

			}

			System.out.println(arr[i]);

		}




	public static void main(String[] args) 
	{
		System.out.println("enter X or O to play");
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		WorkShop1_UC2 l=new WorkShop1_UC2();
		l.letter(c);
			
	}

}
