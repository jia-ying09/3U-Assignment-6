
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author linj4653
 */
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // insert scanner
        Scanner input = new Scanner(System.in);

        //create a list with two numbers
        int[] numbers = new int[2];

        //ask the user to insert their numbers
        System.out.println("Enter two integers:");

        //input the two numbers
        numbers[0] = input.nextInt();
        numbers[1] = input.nextInt();

        //put the numbers in order if array 1 is greater
        if (numbers[0] < numbers[1]) {

            //make a temporary integer for number 1
            int temp1 = numbers[1];
            //make a temporary integer for number 0
            int temp = numbers[0];          
            
            //switch the places of array 1
            numbers[1] = temp;
            //switch the places of array 0
            numbers[0] = temp1;
            
            //output the numbers in ascending order
            System.out.println(numbers[1] + ", " + numbers[0]);

        } else {

            //put the numbers in order if array 0 is greater         
            if (numbers[1] < numbers[0]) {
                //output the numbers in ascending order
                System.out.println(numbers[1] + ", " + numbers[0]);

            } else {

                //if the numbers are equal
                if (numbers[0] == numbers[1]) {
                    //tell the user the numbers are equal
                    System.out.println("The two integers are equal.");
                }
            }

        }
    }
}
