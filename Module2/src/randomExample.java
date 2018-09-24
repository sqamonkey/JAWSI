import java.lang.Math;

public class randomExample{
    public static void main(String[] args) {

        // define the range
        int max = 35;
        int min = 1;
        int range = (max - min) + 1;
        int intRand;
        double dblRand;

        dblRand = Math.random();
        intRand = (int)dblRand;

        // generate random numbers within 1 to 10
        /*for (int i = 0; i < 10; i++) {
            int rand = (int) (Math.random() * range) + min;

            // Output is different everytime this code is executed
        }*/

        for (int i=0; i<5; i++){
            intRand = (int)(Math.random() *35);
            System.out.println(intRand);
        }
        //System.out.println(+intRand +", " +(dblRand *10));
        //System.out.println(+intRand +", " +(dblRand *100));
        //System.out.println(+intRand +", " +(dblRand *1000));
        //System.out.println(+intRand +", " +(dblRand *10000));
        //System.out.println(+intRand +", " +(dblRand *100000));
    }
}
