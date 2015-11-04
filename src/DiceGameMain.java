//Main Constructor

//Main Constructor

import java.util.Scanner;

public class DiceGameMain 
{

    public static void main(String[] args)
    {
    	Scanner input =  new Scanner(System.in);
     	Dice g1to6 = new Dice(1,6);
        Dice g1to12 = new Dice(1,12);
        Dice g1to18 = new Dice(1,18);
        int i = 1;
        int size = 10;
        int highGuess1 = 1000000;
        int[] oddGuess = new int[size];
        int[] evenGuess = new int[size];
        int[] compNum = new int[size];
        int[] won = new int [size];
        int[] lost = new int [size];
        int[] round = new int [size];
        String response = null;
      
        
       
        int guessNum ;
        int odd;
        int even = 0;
        
        while (i < 10 )
        {
        	
            System.out.println("How many dice do you want to roll? 1, 2, 3,");
            guessNum = input.nextInt();
            
            if (guessNum == 1)
            {
            	compNum[i]  = g1to6.GetANumber();
            	System.out.println("1 Dice = Choose a number 1 - 6:");
                guessNum = input.nextInt();
            }
            else if (guessNum == 2)
            {
            	compNum[i]  = g1to12.GetANumber();
            	System.out.println("2 Dice = Choose a number 1 - 12:");
                guessNum = input.nextInt();
            }
            else if (guessNum == 3)
            {
            	compNum[i]  = g1to18.GetANumber();
            	System.out.println("3 Dice = Choose a number 1 - 18:");
                guessNum = input.nextInt();
            }
           
     
            int gameNum = compNum[i];
            
            
            if ((guessNum < 0)|| (guessNum > 1000))
            {
                System.out.println("Please choose only a number between your low number and high number!");
            }
            for(int e=1;e <= highGuess1; e++){
                
                //if the number is not divisible by 2 then it is odd
                if( e % 2 != 0)
                {
                	odd = e;
                }
                else
                {
                	even = e;
                }
                
                int even1 = even;
                
                if (guessNum == even1)
                {
                    evenGuess[i] = 1;
                }
            
                else 
                {
                oddGuess[i] = 1;
                }
            
                if (guessNum == gameNum)
                {
                    response = "You guessed right";
                    won[i] = 1;
                }
                else
                {
                    response = "Sorry you guessed wrong!"+" Computer Number is: "+gameNum;
                    lost[i] = 1;
                            
                }
                
            
            }
        
            System.out.println(response);
            round[i] = i+1;
            i++;
        }    
        i = 0;
        while (i <10)
        {
            System.out.print("round: "+round[i]+" Even Guess: "+evenGuess[i]+" Odd Guess: "+oddGuess[i]+" Computer's Numnber: "+compNum[i]+" Won: "+won[i]+"\n");
            i++;
        }
    }
    
    }