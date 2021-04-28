/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kanin
 */
import java.math.BigInteger;
import java.util.Scanner;
public class Main 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        DisplayMenu();
    }
    public static void DisplayMenu()
    {
        int response;
        boolean display = true;
        while(display)
        {
            Scanner in = new Scanner(System.in);
            System.out.println("");
            System.out.println("");
            System.out.println("Select an option: ");
            System.out.println("Factorials:      1");
            System.out.println("Perfect Numbers: 2");
            System.out.println("Prime Numbers:   3");
            System.out.println("Exit Program:    4");
            response = in.nextInt();
            
            if(response == 1)
                GetFactorials();
            else if(response == 2)
                GetPerfectNumbers();
            else if(response == 3)
                GetPrimeNumbers();
            else
            {
                System.out.print("Closing Menu...");
                break;
            }
                
        }
        
    }
    
    public static void GetFactorials()
    {
        int userNum;
        boolean control = true;
        Scanner in = new Scanner(System.in);
        System.out.println("");
        System.out.println("");
        System.out.println("Factorial Calculator");
        System.out.println("Enter a number: ");
        userNum = in.nextInt();

        while(control)
            {
                System.out.print(userNum);
                int num = userNum;
                long number = num;

                while(num > 1)
                {
                    num--;
                    System.out.print(" x " + num);
                    number *= num;
                }
                System.out.print(" = " + number);
                control = false;
            }
    }
    
    public static void GetPrimeNumbers()
    {
        int userNum;
        Scanner in = new Scanner(System.in);
        System.out.println("");
        System.out.println("");
        System.out.println("Prime Numbers Calculator");
        System.out.println("Enter a number: ");
        userNum = in.nextInt();
        
        System.out.println("Prime numbers from 1 to " + userNum + " are:");
        for(int x = 2; x <= userNum; x++)
        {
            int prime = 1;
            for(int y = 2; y < x; y++)
            {
                if(x % y == 0)
                {
                    prime = 0;
                    break;
                }
            }
            if (prime == 1)
            {
                System.out.print(x + " ");
            }
        }
    }
    
    public static void GetPerfectNumbers()
    {
        int userNum, sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("");
        System.out.println("");
        System.out.println("Perfect Numbers Calculator");
        System.out.println("Enter a number: ");
        userNum = in.nextInt();
        
        System.out.println("Perfect numbers from 1 to " + userNum + " are:");
        for(int x = 1; x <= userNum; x++)
        {
            for(int y = 1; y <= x - 1; y++)
            {
                if(x % y == 0)
                    sum = sum + y;
            }
            if(sum == x)
            {
                System.out.print(sum + " ");
            }
            sum = 0;
        }
        
    }
    
}
