public class Arrays {
    public static void main(String[] args){

        String username = "xxxx";
        String password = "yyyy";
        String email = "abc@gmail.com";
        String zip = "12345";
        String city = "London";

        // Arrays
        String str[] = new String[5];
        str[0] = "xxxx";
        str[1] = "xxxx";
        str[2] = "xxxx";
        str[3] = "xxxx";
        str[4] = "xxxx";

        int i[] = new int[4];
        char c[] = new char[4];

        // length of an array
        System.out.println("str.length");
        System.out.println("int.length");

        for (int x=0; x < str.length; x++){
            System.out.println(str[x]);
        }

        for (int y=3; y < i.length; y--){
            System.out.println(i[y]);
        }


    }
}
