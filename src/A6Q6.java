
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author linj4653
 */
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // insert scanner
        Scanner input = new Scanner(System.in);

        //ask the user how many students are in the class       
        System.out.println("Enter the number of students in the class: ");

        //input the number of students in the class       
        int students = input.nextInt();

        //ask the user to enter the marks
        System.out.println("Enter each individuals percentage: ");

        //input the marks
        double[] marks = new double[students];


        //loop until all marks are inserted
        for (int i = 0; i < marks.length; i++) {

            //insert the marks
            marks[i] = input.nextDouble();
        }

        //loop 10 times
        for (int i = 0; i < marks.length; i++) {

            //loop until all the numbers are in their rightful places
            for (int j = 0; j < (marks.length - 1); j++) {

                //put the numbers in order if array 1 is greater
                if (marks[j] < marks[j + 1]) {

                    //make a temporary integer
                    double temp = marks[j + 1];

                    //swapping the numbers
                    marks[j + 1] = marks[j];
                    //switch the places of array 1
                    marks[j] = temp;
                }
            }
        }
         //order the numbers into ascending order
        for (int i = (marks.length - 1); i > -1; i--) {}
        
         
            System.out.println("The highest percentage is " + marks[0] + "%. You are doing an amazing job, keep up the great work!");
        
        //finding the lowest percentage
        double min = 0;
        for (int i = 0; i < marks.length; i++) {
            min = marks[i];
        }
        //outputing the lowest percentage
        System.out.println("The lowest percentage is " + min + "%. Continue to work hard. ");

        //average 
        double sum = 0;
        for (int i = 0; i < marks.length; i++) {
            //calculating the sum
            sum = sum + marks[i];
        }
        //calculating the average 
        double average = (sum / students);
        //outputing the average percentage
        average = Math.round(average * 100.0) / 100.0;
        System.out.println("The average percentage is " + average + "%.");

    }
}
