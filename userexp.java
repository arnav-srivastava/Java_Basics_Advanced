import java.util.Scanner;
class AgeException extends Exception
{
    AgeException()
    {
        System.out.println("Under 18 problem");
    }
}
class userexp
{
    void func()
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter your age");
            int age = sc.nextInt();
            if(age>=18)
            {
                System.out.println("Vote done");
            }
            else
            {
                throw new AgeException();

            }
        }
        catch(AgeException ae)
        {
            System.out.println(ae);

        }
        finally
        {
            System.out.println("next voter will come");
        }
    }
    public static void main(String args[])
    {
        userexp obj=new userexp();
        obj.func();
    }
}