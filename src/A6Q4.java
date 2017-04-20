
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
        // create a scanner 
        Scanner input = new Scanner(System.in);
        
        //create a list of 10 marks
        int[] marks = new int [10];
        
        //asking the user t enter in 10 marks 
        System.out.println("Enter in 10 marks");
        
       // For Loop to input the marks 
      for (int i = 0; i < marks.length; i++) {
          marks[i] = input.nextInt();
      }
      
      
      
    }
}