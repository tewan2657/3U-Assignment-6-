
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tewan2657
 */
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int temp;
        // create a scanner 
        Scanner input = new Scanner(System.in);
        
        //create a list of 10 marks
        int[] marks = new int [10];
        
        //asking the user to enter in 10 marks 
        System.out.println("Enter in 10 marks");
        
       // For Loop to input the marks 
      for (int i = 0; i < marks.length; i++) 
          marks[i] = input.nextInt();
      
      // Sort the numbers from lowest to highest mark
        for (int i = 0; i < (10-1); i++) {
            for (int a = 0; a < (10-i-1); a++) {
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
        for (int i = 0; i < 10; i++) {
            
            System.out.print(marks[i]);
            System.out.print(", ");
        }
        System.out.println("");
      
      
    }
}