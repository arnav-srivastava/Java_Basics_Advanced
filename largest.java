public class largest {
    public static void main(String args[]){
        int var1 = Integer.parseInt(args[0]);
        int var2 = Integer.parseInt(args[1]);
        int var3 = Integer.parseInt(args[2]);

        if(var1>var2){
            if(var1>var3){
                System.out.println("Larget Nuber is " + var1);
            }
            else{
                System.out.println("Larget Nuber is " + var3);
            }
        }else{
            if(var2>var3){
                System.out.println("Larget Nuber is " + var2);
            }
            else{
                System.out.println("Larget Nuber is " + var3);
            }
        }
            

    }
}
