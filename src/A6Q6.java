
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tewan2657
 */
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int temp; 
        int temp1;
        int temp2;
        
        //create a scanner
        Scanner input = new Scanner(System.in);
            
        //asking the user for the size of the class 
        System.out.println("What is the size of the class?");
        int size = input.nextInt();
        
        //create a list of marks according to the size of the class
        int[]marks = new int[size];
        
        //Asking the user to enter in the marks according to the size of the class
        System.out.println("Enter in the class marks ");
        
        //for loop to input the marks according to the size of the class
        for (int i = 0; i < size; i++) 
            marks[i]=input.nextInt();
            
            
        for (int i = 0; i < (size - 1); i++) {
            for (int a = 0; a < (size - i - 1); a++) {
                if(marks[a] > marks[a+1]){
                    
                    temp = marks[a];
                    marks[a]= marks[a+1];
                    marks[a+1] = temp;
                    
                }
                
            }
        }
        System.out.println("");
        
        //Display the lowest mark in the class
        System.out.println("Lowest mark in the class: ");
        System.out.println(marks[0]);   
        
        System.out.println("");
            
        //display the highest mark in the class
        System.out.println("Highest mark in the class: ");
        System.out.println(marks[marks.length - 1]);
            
        System.out.println("");
        
        //display the Average of the class
        System.out.println("The Average of the class is:");
        //add up all the marks 
        double sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }
        //calculate average 
        //divide the total sum of marks by the number of marks entered  
        double average = sum/marks.length;
        double rounded = Math.round(average * 100)/100.0;
        
        System.out.println(rounded);
    }
}
