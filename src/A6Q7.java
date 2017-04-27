

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tewan2657
 */
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int n = 1000;
       
       // number 1 will always be false(not prime) 
       boolean[]num = new boolean[n];
       num[0] =  false;
       
       //make all numbers prime 
        for (int f = 1; f < n; f++) {
            num[f] = true; 
        }
       
         
        for (int i = 2; i < n; i++) {
            if(num[i-1]){
                
                
              //print out the prime numbers 
                System.out.println(i);
                
                //getting rid of any number that is not prime 
                for (int j = i*1; j <= n; j+=i) {
                    num[j-1]= false;
                }    
            }
        }
            
}               
}
