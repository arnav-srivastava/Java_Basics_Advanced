import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
       double y= sc.nextDouble();
        if (x>y){
            System.out.printf("%.2f",y);
        }
        else if(x<y && x%5==0){
            double trans=y-(x+0.5);
            System.out.printf("%.2f",trans);
        }
        else
            System.out.printf("%.2f",y);
    }
}
