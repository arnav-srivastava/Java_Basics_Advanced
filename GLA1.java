
public class GLA1 extends svm {
    GLA1()
    {
        System.out.println("I am non para from gla ");
    }
    GLA1(int b)
    {
       super(b);
        System.out.println("I am para from gla ");
    }
    
    public static void main(String args[])
    {
        GLA1 con = new  GLA1(12);


    }

}
class svm {
    svm(){
        System.out.println("I am non para from svm");
    }
    svm(int a){
      //  super(a);
        System.out.println("I am para cons from svm");
    }
}