
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author linj4653
 */
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // add scanner
        Scanner input = new Scanner(System.in);

        //ask the user how many students are in their class
        System.out.println("How many students are in the class?");

        //input the number of students that are in the class
        int students = input.nextInt();

        //ask the user to enter the marks are
        System.out.println("Enter the marksin percentage: ");

        //input the percentage of marks there are per student
        double[] marks = new double[students];

        //loop for inputting the marks
        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextDouble();
        }

        //getting the sum of the marks
        double sum = 0;
        for (int i = 0; i < marks.length; i++) {
             sum = sum + marks[i];
        }

             //finding the average
            double average = (sum / students);

            //outputting the class average
            System.out.println("The class average is " + average + " %");

        }
    }
