
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tewan2657
 */
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner 
        Scanner input = new Scanner(System.in);
        //asking the user for how many People are there
        System.out.println("How many people are there?");
        //get a number from the user 
        int people = input.nextInt();
        
        //creating a list of heights according to the number of people 
        int[] height = new int[people];
        
        //asking the user to enter in the height(cm) according to how many people are there.
        System.out.println("Enter in the Height in cm.");
        //for loop to input height of each person 
        for (int i = 0; i < height.length; i++) {
            height[i] = input.nextInt();
        }
        //add up the all the heights given by the user 
        int sum = 0;
        for (int i = 0; i < height.length; i++) {
            sum = sum + height[i];
            
        }
        //calculate average
        double average = sum/height.length;
        //print out the average 
        System.out.println("The average height is " + average);
        

           for (int i = 0; i < height.length; i++) {
               if(height[i]>average){
                   System.out.print(height[i] + ", ");
               }
           }          
        
           
             System.out.println();
          
      
    }     
    }
          
        
        
    

