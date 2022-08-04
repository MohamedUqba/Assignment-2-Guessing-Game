import java.util.Scanner;



class Guesser
{
	int guessNum;
	
	public int guessNumber()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println();
		System.out.println("Guesser kindly guess the number");
		guessNum = scan.nextInt();
		
		while(guessNum<0 || guessNum>10) 
		{
			System.out.println("Guesser, Please the Gussing range is from 0 to 10 only");
			guessNum = scan.nextInt();
		}
		
		return guessNum;
	}
	
}

class Player
{
	int pGuessNum;
	
	public int guessNumber() 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Player kindly guess the number");
		pGuessNum = scan.nextInt();
		
		while(pGuessNum<0 || pGuessNum>10) 
		{
			System.out.println("Player, Please the Gussing range is from 0 to 10 only");
			pGuessNum = scan.nextInt();
		}
		
		
		
		return pGuessNum;
	}
	
}

class Umpire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	
	public void welcomingMessage()
	{
		System.out.println("--------------------------------------------");
		System.out.println("\\Welcome To the Guessing Game By Umpaire/");
		System.out.println("--------------------------------------------");
	}
	public void collectNumFromGuesser() 
	{
		Guesser g=new Guesser();
		numFromGuesser = g.guessNumber();
	}
	
	public void collectNumFromPlayer()
	{
		
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		
		numFromPlayer1=p1.guessNumber();
		numFromPlayer2=p2.guessNumber();
		numFromPlayer3=p3.guessNumber();
	}
	
	void compare() 
	{
		if (numFromGuesser==numFromPlayer1)
		{
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
			{
				System.out.println("Game tied all three players guessed correctly");
			}
			else if(numFromGuesser==numFromPlayer2)
			{
				System.out.println("Player1 and Player2 Won the game ");
			}
			else if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player1 and Player3 Won the game ");
			}
			else
			{
				System.out.println("Play 1 won the game");
			}
		}
		else if (numFromGuesser==numFromPlayer2)
		{
			if (numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player2 and Player3 Won");
			}
			
			else
			{
				System.out.println("Player 2 won the game");
			}
		}
		
		else if (numFromGuesser==numFromPlayer3)
		{
			System.out.println("Play 3 won the game");
		}
		
		else 
		{
			System.out.println("Game lost! try again");
		}
	}
	
}






public class LaunchGame {
	
	public static void main(String args[]) 
	{
		Scanner scan = new Scanner(System.in);
		int terminator = 0;
		while(terminator==0) 
		{
		Umpire u=new Umpire();
		u.welcomingMessage();
		u.collectNumFromGuesser();
		u.collectNumFromPlayer();
		u.compare();
		
		System.out.println("If you want to terminate the game enter 1 or 0 to continue the game");
		 terminator = scan.nextInt();
			 if(terminator == 1) 
			 {
				 System.out.println("Bye");
			 		break;
			 }
			 System.out.println("Welcome back");
		}
		
		
		
		
	}

}
