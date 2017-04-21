
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

       int mark = marks.length;
       int temp;
       
        for (int i = 0; i < mark; i++) {
            for (int j = 1; j < (mark - i); j++) {

                //put the numbers in order if array 1 is greater
                if (marks[j - 1] > marks[j]) {
                    
                    //make a temporary integer for number 1
                    temp = marks[j - 1];
                    
                    //switch the places of array 1
                    marks[j - 1] = temp;
                    //switch the places of array 0
                    marks[j] = marks [j - 1];
                    
                    System.out.println(marks[j] + ", " + marks [j - 1]);
                }
            }
        }
    }
}