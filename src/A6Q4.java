
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

        for (int i = 0; i < 10; i++) {
            {
                for (int j = marks.length; j < 9; j++) {

                    //put the numbers in order if array 1 is greater
                    if (marks[j] < marks[j - 1]) {

                        //make a temporary integer
                        int temp = marks[j - 1];
                        //swapping the numbers
                        marks[j - 1] = marks[j];
                        //switch the places of array 1
                        marks[j] = temp;
                    }
                }
            }
            System.out.println(" ");

            //order the numbers into ascending order
            for (int n = 9; n > -9; n--) {

                //output the numbers inascending order
                System.out.print(marks[i] + ", ");
            }

        }
    }
}
