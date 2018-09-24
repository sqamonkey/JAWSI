public class Two_Dim_Arrays {
    public static void main(String[] args){

        String x[][] = new String[3][4];

        // First Row
        x[0][0]= "A0";
        x[0][1]= "B0";
        x[0][2]= "C0";
        x[0][3]= "D0";

        x[1][0]= "A1";
        x[1][1]= "B1";
        x[1][2]= "C1";
        x[1][3]= "D1";

        x[2][0]= "A2";
        x[2][1]= "B2";
        x[2][2]= "C2";
        x[2][3]= "D2";

        // rows
        System.out.println("rows are "+ x.length);
        // columns
        System.out.println("columns are "+ x[0].length);

        for (int rowNum=0; rowNum < x.length; rowNum++){
            for(int colNum=0; colNum < x[0].length; colNum++){
                System.out.println((x[rowNum][colNum]));
            }
        }
    }
}
