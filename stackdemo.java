import java.util.*;
public class stackdemo {
    void func(){
        Stack st = new Stack();
        st.push("mango");
        st.push("money");
        st.push(300);
        System.out.println(st);
        System.out.println("No of itme : " +st.size() );
        System.out.println("deleted : "+st.pop());
        System.out.println("last element : "+st.peek());
        System.out.println(st);
        System.out.println("No of itme : " +st.size() );
    }

    public static void main(String[] args) {
        stackdemo obj = new stackdemo();
        obj.func();
        
    }
    
}
