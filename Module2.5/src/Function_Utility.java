public class Function_Utility {
    /*
    * @param args
     */
    public static void main(String[] args){

        int rangeMax = 35;
        generateRandomNumber(rangeMax);

    }

    public static void generateRandomNumber(int n){

        int max = n;
        int rand = (int)(Math.random() *n);
        System.out.println(+rand);
    }
}
