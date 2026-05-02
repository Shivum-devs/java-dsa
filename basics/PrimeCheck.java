package basics;

import java.util.Scanner;

/**
* Checks whether a number is prime using sqrt optimization
 */
public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
            // Handling the edge cases (0, 1, negative numbers).
        if (num<=1) {
             System.out.println("Not Prime");
             sc.close();
             return; 
        }
         for (int i=2; i*i<=num; i++){
            if (num%i==0) { 
                 // Check divisibility up to sqrt(num).  
                System.out.println("Not Prime");
                sc.close();
                 return;
            }
        }
            System.out.println("Prime");
                sc.close();
        
    }
}
 
    

