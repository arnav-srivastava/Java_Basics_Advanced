public class swap {
    public static void main(String args[]){
        int var1 = Integer.parseInt(args[0]);
        int var2 = Integer.parseInt(args[1]);

        System.out.println("Original value ");
        System.out.println("value of varr1 :" + var1);
        System.out.println("value of varr2 :" + var2);

        // swaping code using third variable
        // int var3 = var1;
        // var1 = var2;
        // var2 = var3;
        // swaping code using without third variable
        var1 = var1 +var2;
        var2 = var1 - var2;
        var1 = var1 - var2; 


        System.out.println("After swaping value ");
        System.out.println("value of varr1 :" + var1);
        System.out.println("value of varr2 :" + var2);
    }
}
