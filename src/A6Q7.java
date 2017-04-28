
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
            int l = 2;
            l = l + l;
        }
        //creating a list of integers up to 1000
        for (int i = 1; i > 1000; i++) {

            //letting p equal 2
            int p = 2;

            //counting up in increments of p 
            p = p + p;

            //outputing the integers
            System.out.println(p + " ");

            //if i is greater than p make p equal i
            if (i > p == true) {

                //creating a temporary integer
                int temp1 = p;

                //switching i with p
                i = temp1;

                //switching p with i
                p = i;

                //outputing the numbers
                System.out.println(p);

                //if i is not greater than p stop
            } else {

                //stop
                break;
            }
        }
    }
}
