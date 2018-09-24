public class Function_PassINValues {
    public static void main(String[] args){

        sumAll(1, 2, 4);
        sumAll(10, 20, 40);
        int sum = returnSum(12, -2, 100);
        String country = "U.S.A.";

        if (sum < 100){
            System.out.println(sum +" is less than 100");
        } else{
            System.out.println(sum +" is greater than 100");
        }
    }

    public static void sumAll(int a, int b, int c){
        int sum = a+b+c; // local var
        System.out.println(sum);


        int tmp = 100; //local var
    }

    public static int returnSum(int a, int b, int c){
        int sum = a+b+c; // local var
        System.out.println(sum);
        return(sum);

    }
}


/*
Return Types:
 - void

    - Primitive Data Types

        - Objects ????



 */
