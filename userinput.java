import java.util.Scanner;
class userinput {
    public static void main(String args[])
    {
        Scanner  sc = new Scanner(System.in);
        // System.out.println("Input 1st no :");
        //String str1 = sc.next();
        // int var1 = Integer.parseInt(str1);
        // int var1 = sc.nextInt();
        // System.out.println("Input 2nd no :");
        //String str2 = sc.next();
        // int var2 = Integer.parseInt(str2);
        // int var2 = sc.nextInt();
        // int var3 = var1 + var2;
        int ar[]= new int[5];
        System.out.println("Input 5 element :");
        for (int i=0;i<5;i++)
        {
            ar[i]= sc.nextInt();
        }
        int sum =0;
        for (int  i=0;i<5;i++)
        {
            //System.out.println("your " + i +"th no is :"+ ar[i]);
            sum = sum +ar[i];
            
        }
        System.out.println("Sum of  array of element is : "+sum);
        //System.out.println("Addition of var1 and var2 is :"+var3);
    }
}
