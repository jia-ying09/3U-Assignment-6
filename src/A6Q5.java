
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author linj4653
 */
public class A6Q5 {

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

        //telling the user their numbers
        System.out.println("Here are the marks in ascending order: ");

        //order the numbers into ascending order
        for (int i = (marks.length - 1); i > -1; i--) {

            //output the numbers inascending order
            System.out.print(marks[i] + "% ");
        }

        //blank line
        System.out.println(" ");

        //if the median is an even number
        if (students % 2 == 0) {

            //find the median of an even number
            double even = (marks[students / 2] + marks[(students / 2) - 1]) / 2;

            //output the median
            System.out.println("The class median is " + even + "%. ");

        } else {

            //finding the median of odd number    
            double median = marks[students / 2];

            //tell the user their median
            System.out.println("The class median is " + median + "%.");
        }
    }
}
