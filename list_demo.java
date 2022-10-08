import java.util.*;
public class list_demo {

    void func(){
        List ls = new ArrayList();
        ls.add("mango");
        ls.add("money");
        ls.add(300);
      
        ls.add("man");
        ls.remove("man"); // delete particular
        ls.clear(); // delete all
        System.out.println(ls);
        System.out.println("No of itme : " +ls.size() );
    }

    public static void main(String[] args) {
        list_demo obj = new list_demo();
        obj.func();
        
    }
    
}
