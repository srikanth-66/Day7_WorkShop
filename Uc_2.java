package WorkShop_Day7;
import java.util.Scanner;
public  class Uc_2 
{

	public static void inputRead() 
	{
		
		String player1 = "User Turn";
		String player2="Computer Turn";
		int player=(int) (Math.floor(Math.random()*10%2));
		System.out.println(player);
		if(player==0) 
		{
           

			System.out.println(player2);
		}
		if(player==1)
		{
			System.out.println(player1);
		}
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if(ch =='o'||ch =='O'||ch =='x'||ch =='X')
		{
			//System.out.println(ch);

		}
		else 
		{
			System.out.println("Please only enter 'x' and 'o' only");

		}
		 if (ch == 'X' || ch == 'x')
         {
			 System.out.println("Player's letter is o");
			 System.out.println("Computer's letter is x.");
         }
         else if (ch== 'O' || ch== 'o')
         {
        	 System.out.println("Player's letter is x.");
        	 System.out.println("Computer's letter is o.");
         }
         else
         {
        	 System.out.println("Error. You have to choose X or O only.");
         }
	}
	
	
}
	


