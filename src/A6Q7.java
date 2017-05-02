
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author linj4653
 */
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creating a ist of integers
        int[] numbers = new int[1000];
        {

            //output the prime numbers 2, 3, 5, 7
            System.out.println("2");
            System.out.println("3");
            System.out.println("5");
            System.out.println("7");

            //loop through all the numbers from 2-1000
            for (int i = 0; i < 1000; i++) {
                numbers[i] = i;

                //delete 1
                if (numbers[i] == 1) {
                } else {

                    //delete any multiples of 2
                    if (numbers[i] % 2 == 0) {
                    } else {

                        //delete any multiples of 3
                        if (numbers[i] % 3 == 0) {
                        } else {

                            //delete any multiples of 5
                            if (numbers[i] % 5 == 0) {
                            } else {

                                //delete any multiples of 7
                                if (numbers[i] % 7 == 0) {
                                } else {

                                    //print out the prime numbers
                                    System.out.println(numbers[i]);
                                }

                            }
                        }
                    }

                }
            }
        }
    }
}
