
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
        for (int i = 0; i < marks.length; i++) {

            //insert 10 numbers
            marks[i] = input.nextInt();
        }

        //loop 10 times
        for (int i = 0; i < 10; i++) {
            
            //loop until all the numbers are in their rightful places
            for (int j = 0; j < 9; j++) {

                //put the numbers in order if array 1 is greater
                if (marks[j] < marks[j + 1]) {

                    //make a temporary integer
                    int temp = marks[j + 1];
                    
                    //swapping the numbers
                    marks[j + 1] = marks[j];
                    //switch the places of array 1
                    marks[j] = temp;
                }
            }
        }
        
        //telling the user their numbers
        System.out.println("Here are the marks in ascending order: ");
        
        //order the numbers into ascending order
        for (int i = 9; i > -1; i--) {

            //output the numbers inascending order
            System.out.print(marks[i] + "% ");
        }
    }
}
