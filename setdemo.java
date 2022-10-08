import java.util.*;
public class setdemo {
    void func(){
        Set st = new HashSet();
        st.add("mango");
        st.add("money");
        st.add(300);
        System.out.println(st);
        System.out.println("No of itme : " +st.size() );
    }

    public static void main(String[] args) {
        setdemo obj = new setdemo();
        obj.func();
        
    }
    
}
