
package WorkShop_Day7;
import java.util.Random;
import java.util.Scanner;

public class Uc_4 
{
	String[][] board = new String[3][3];

	int row;
	int column;

	Scanner scan = new Scanner(System.in);

	String currentTurn = "X";


		public static void computerMove()
		{
		    Random computerMove = new Random();
		    int row = computerMove.nextInt(3);
		   int  column = computerMove.nextInt(3);
		    String[][] board = new String[3][3];
			while (board[row][column] != "-") 
			{
		        row = computerMove.nextInt(3);
		        column = computerMove.nextInt(3);
		    }
		    board[row][column] = turn();
		}

		private static String turn() {
			
			// public static String computerTurn = "O";

			{
			    if (currentTurn == "X") {
			        currentTurn = "O";
			    } else {
			        currentTurn = "X";
			    }
			    return currentTurn;
			}

			// TODO Auto-generated method stub
			//return null;
		}
		public static void playerMove() {
		    System.out.println();
		    System.out.println("Your Move: ");
		    row = scan.nextInt() - 1;
		    column = scan.nextInt() - 1;
		    if (board[row][column] == "-") {
		        board[row][column] = turn();
		    } else {
		        System.out.println("Invalid entry. Please go again");
		        row = scan.nextInt() - 1;
		        column = scan.nextInt() - 1;
		        board[row][column] = turn();
		    }


}



