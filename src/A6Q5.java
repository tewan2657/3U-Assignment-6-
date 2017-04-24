
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tewan2657
 */
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int temp;
        //create a scanner 
        Scanner input = new Scanner(System.in);
        
        //asking the user to input the number of marks 
        System.out.println("Enter the number of marks");
        int num = input.nextInt();
        
        //create a list of numbers according to the number of marks 
        int[]marks = new int[num];
        
        //asking the user to enter in the number of marks 
        System.out.println("Enter " + num + " marks");
        
        // for loop to input the marks
        for (int i = 0; i < num; i++) 
          marks[i] = input.nextInt();
          
       // Sort the numbers from lowest to highest mark
        for (int i = 0; i < (10-1); i++) {
            for (int a = 0; a < (num-i-1); a++) {
                if(marks[a] > marks[a+1]){
                 
                    temp = marks[a];
                    marks[a]=marks[a+1];
                    marks[a+1] = temp;
                }
                
            }
            
        }
        System.out.println("");
        
        System.out.println("Sorted List of Marks:");
        //Print out the sorted marks
        for (int i = 0; i < num; i++) {
            System.out.print(marks[i]);    
            System.out.print(",");
        }
        System.out.println("");
        
        // if the number is even then the remainder is 0 
        if(num % 2 == 0){
           int temp1 = (marks[num/2] + marks[(num/2)-1]) / 2; 
            System.out.println("Your Median is " + temp1);
        }
        // if the remainder is not 0 - execute 
        else{
            int temp2 = (marks[num/2]);
            System.out.println("Your Median is " + temp2);
            
        }
        
        
        
    }
}
