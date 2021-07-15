package day7_Workshop;

public class WorkShop1_UC1_1 
{
	public static void printBoard()
	{
		System.out.println("********* TIC TAC TOE GAME DASHBOARD ************");
		System.out.println("\n");

		char [][] arr=new char[3][3];
		int i,j;
		for( i=0;i<3;i++)
		{
			for( j=0;j<3;j++)
			{
				System.out.println(+arr[i][j] +"|"+ +arr[i][j] +"|"+ +arr[i][j]);
				break;
			}
			if(i<2)
			{
				
				System.out.println("______");
			}
			

		}
		System.out.println("\n");

		System.out.println("*********** ITS A DASHBOARD ****************");

	}
	public void printBoardObj()
	{
		System.out.println("********* TIC TAC TOE GAME DASHBOARD FROM METHOD PRINTBOARDOBJ ************");
		System.out.println("\n");

		char [][] arr=new char[3][3];
		int i,j;
		for( i=0;i<3;i++)
		{
			for( j=0;j<3;j++)
			{
				System.out.println(" " +"|"+ " " +"|"+ " ");
				break;
			}
			if(i<2)
			{
				
				System.out.println("______");
			}
			

		}
		System.out.println("\n");

		System.out.println("*********** ITS A DASHBOARD ****************");

	}


	public static void main(String[] args) 
	{
		
		/*System.out.println("********* TIC TAC TOE GAME DASHBOARD ************");
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
			

		}*/
		int [] arr= {1,2,3,4,5,6,7,8,9};
		
		System.out.println("************ STATIC TIC TC TOE GAME *************");
		System.out.println("\n");


		System.out.println( + arr[0] + " | " + arr[1] + " | " + arr[2]);
		System.out.println("__________");
		System.out.println( + arr[3] + " | " + arr[4] + " | " + arr[5]);
		System.out.println("__________");
		System.out.println(+ arr[6] + " | " + arr[7] + " | " + arr[8] );
		System.out.println("\n");
		System.out.println("\n");


		WorkShop1_UC1_1 p=new WorkShop1_UC1_1();
		printBoard();
		System.out.println("\n");

		p.printBoardObj();

		
	

}
}