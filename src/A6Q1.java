
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tewan2657
 */
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner 
        Scanner input = new Scanner(System.in);
        //asking the user for how many Students are in the class
        System.out.println("How many students in the class?");
        //get a number from the user 
        int Student = input.nextInt();
        
        //creating a list of marks according to the number of students 
        double[] marks = new double[Student];
        
        //scan in some marks 
        System.out.println("Enter the marks:");
        
      // For Loop to input mark of each student 
      for (int i = 0; i < marks.length; i++) {
          marks[i] = input.nextInt();
      }
     double sum = 0;
        // for loop to go through each number 
        for (int i = 0; i < marks.length; i++) {
         // add up all the marks 
          sum = sum + marks[i];
        }
      //calculate average 
        double average = sum/marks.length;
        double rounded =  Math.round(average  *100)/100.00;
        
        //print out the class average 
        System.out.println("The class average is " + rounded + "%");
        
    }
}
