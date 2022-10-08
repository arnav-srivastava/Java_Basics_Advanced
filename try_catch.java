import java.util.Scanner;
public class try_catch {
    void func1()
    {
    try
        {
            int ar[]= new int[5];
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Element in array ");
            for(int i=0; i<5;i++){
                ar[i]= sc.nextInt();
            }
            System.out.println("/n /n ......................Array Elements............\n\n");
            for(int i=5; i>0;i++){
                System.out.println(ar[i]/i);
            }
            // String var1=sc.next();
            // System.out.println("String value : ");
            // System.out.print(var1);
            // System.out.println("\n\n.....................\n\n");
            // int x = Integer.parseInt(var1);
            // System.out.println("Numerical value :");
            // System.out.println(x+ "...................try block");
            sc.close();

        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array problem occur");

        }
        catch(ArithmeticException e1){
            System.out.println("Mathmatical problem occur");

        }
    }
        public static void main(String[] args) {
            try_catch obj = new try_catch();
            obj.func1();

        }
}
