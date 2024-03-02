import java.util.Random; 
import java.util.Scanner; 
  
public class NumberGuessing{ 
    public static void main(String[] args) 
    {  
        int ans, guess;
        final int MAX = 100;  
        Scanner sc = new Scanner(System.in);  
        Random rand = new Random(); 
        boolean correct = false; 
        ans = rand.nextInt(MAX) + 1;  
        while (!correct) { 
  
            System.out.println("Guess a number between 1 and 100: "); 
            guess = sc.nextInt();  
            if (guess > ans) { 
                System.out.println("Too high, try again"); 
            } 
            else if (guess < ans) { 
                System.out.println("Too low, try again"); 
            }  
            else { 
                   System.out.println("Yes, you guessed the number."); 
                   correct = true;
            } 
        } 
        System.exit(0); 
    } 
}
