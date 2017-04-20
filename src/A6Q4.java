
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author linj4653
 */
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // insert scanner
        Scanner input = new Scanner(System.in);

        //create a list of 10 numbers
        int[] marks = new int[10];

        //ask user to insert 10 numbers
        System.out.println("Enter 10 marks:");

        //loop until all 10 numbers are inserted
        for (int i = 0; i < 10; i++) {           
            //insert 10 numbers
            marks[i] = input.nextInt();
        }

        while (true) {
            //put the numbers in order if array 1 is greater
            if (marks[0] < marks[1]) {

                //make a temporary integer for number 1
                int temp1 = marks[1];
                //make a temporary integer for number 0
                int temp = marks[0];
                //switch the places of array 1
                marks[1] = temp;
                //switch the places of array 0
                marks[0] = temp1;
                //output the marks in ascending order
                System.out.println(marks[1] + " " + marks[0]);

            } else {

                //put the numbers in order if array 0 is greater         
                if (marks[1] < marks[0]) {
                    //output the numbers in ascending order
                    System.out.println(marks[1] + " " + marks[0]);

                    /*  //WHAT?!?!?! BUBBLE SORTING */
                   /*   repeat from marks[0] to marks[9]-1 as x:
                     repeat from x */

                }
            }
        }
    }
}