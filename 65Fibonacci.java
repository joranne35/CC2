
package Fibonacci;

import java.util.Scanner;
        
public class Fibonacci {
    
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number:");
    int a=input.nextInt();
     
   //This is for the fibonacci counter
 
   for(int b=0; b<a+1;b++){
        System.out.print("f("+b+")\t");
    }
     System.out.println();
   
//This is for the rows and columns
      
     for (int row = 0; row < a+1; row++ ){ 
        for (int column=0;column<row+1;column++)
            {System.out.print(fact(column)+"\t");
            }
            System.out.println();
            
        }
    }

// This is the main method 

        static int fact (int n){
        if (n<=1){return n;}
        else
        {return fact(n-1)+ fact(n-2);}

}
}

     
            
         
