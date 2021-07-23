package WorkShop_Day7;

public class Uc_1 
{
		public static void printBoard()
		{
			System.out.println("********* TIC TAC TOE GAME DASHBOARD ************");
			char [][] arr=new char[3][3];
			int i,j;
			for( i=0;i<3;i++)
			{
				for( j=0;j<3;j++)
				{
					System.out.println("- "+"|"+" -"+" |"+"-");
					break;
				}
				if(i<2) 
					{
						System.out.println("_________");
					}
			}
		}
		//public static void main(String[] args) 
		//{
			//printBoard();
//		}
}
