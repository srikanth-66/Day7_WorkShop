package WorkShop_Day7;

import java.util.Scanner;

public class Uc_3 
{
	public static void showBoard()
	{
		 int board[][] = 
		      {
		    		  { 1, 2, 3 }, 
		    		  { 4, 5, 6 }, 
		    		  { 7, 8, 9 } 
		      };
		    for(int i=0; i<board.length; i++)
		    {
		      // inner loop for column
		      for(int j=0; j<board[0].length; j++) 
		      {
		    	 
		    		  System.out.print(board[i][j]);
		    		  if(j<2) {
					      System.out.print("|"); // new line

		    		  }

		      }
		      System.out.println(); // new line
		      if(i<2)
		      {
			      System.out.println("______"); // new line

		      }
		      //System.out.println("______"); // new line
		    }
	}
}
	      /*  System.out.print(board[0][0] + " | ");
	        System.out.print(board[0][1] + " | ");
	        System.out.print(board[0][2] + " ");
	        System.out.println();
	        System.out.println("__________");
	        System.out.print(board[1][0] + " | ");
	        System.out.print(board[1][1] + " | ");
	        System.out.print(board[1][2] + " ");
	        System.out.println();
	        System.out.println("__________");
	        System.out.print(board[2][0] + " | ");
	        System.out.print(board[2][1] + " | ");
	        System.out.print(board[2][2] + "  ");

		  } */   
	
		        	




