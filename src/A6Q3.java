
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tewan2657
 */
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner 
        Scanner input = new Scanner(System.in);

        //creating a list of heights accordin to the number of people 
        int[] integer = new int[2];

        //asking the user to enter two integers 
        System.out.println("Enter two Integers");

        //first integer
        integer[0] = input.nextInt();
        //second integer
        integer[1] = input.nextInt();

        //if the first integer is bigger than the second integer 
        if (integer[0] > integer[1]) {
            //placed in ascending order
            System.out.println("The integers in ascending order are: " + integer[1] + " : " + integer[0]);
        } 
        //if the second integer is bigger than the first integer 
        else {
            //placed in ascending order 
            System.out.println("The integers in ascending order are: " + integer[0] + " : " + integer[1]);
        }
    }
}
