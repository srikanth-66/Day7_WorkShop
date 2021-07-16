package day7_Workshop;

import java.util.Scanner;

public class WorkShop1_UC3 
{
	   public static void printBoard() 
	   {
		   char [][ ] board=new char[3][3];
		   char ROWS=3,COLS=3;
	      for (int row = 0; row < ROWS; row++)
	      {
	         for (int col = 0; col < COLS; col++) 
	         {
	            if (col != COLS - 1)
	            {
	               System.out.print("|"); 
	            }
	         }
	         System.out.println();
	         if (row != ROWS - 1)
	         {
	            System.out.println("______"); 
	         }
	      }
	      System.out.println();
	   }

	public static void main(String[] args) 
	{
		System.out.println("enter X or O to play");
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		//WorkShop1_UC3 p=new WorkShop1_UC3();
		printBoard();
			
	}


}
