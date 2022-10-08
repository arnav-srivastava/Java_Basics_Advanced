import java.util.Scanner;
public class try_catch_final {
    void func1()
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter value");
            String var1=sc.next();
            System.out.println("String value : ");
            System.out.print(var1);
            System.out.println("\n\n.....................\n\n");
            int x = Integer.parseInt(var1);
            System.out.println("Numerical value :");
            System.out.println(x+ "...................try block");
            sc.close();

        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());

        }
        finally
        {
            System.out.println("I am fine ji ....finaly block ");
        }
    }
    void func2(){
        System.out.println("I am working ji ....");
    }
    public static void main(String[] args) {
        try_catch_final obj = new try_catch_final();
        obj.func1();
        obj.func2();
    }
}
