
import java.util.LinkedList;
//public class StringTokenizer1 {
////    public StringTokenizer(String str) {
////    }
//
//    public static void main(String[] args) {
////        String str= "hello welcome to hell ";
//        StringTokenizer st = new StringTokenizer("hello/I:elr",",");
//        System.out.println(st.countTokens());
//        while (st.hasMoreTokens()) {
//            System.out.println(st.nextToken("/"));
//            System.out.println(st.nextToken(":"));
////            System.out.println(st.nextToken(":"));
//
//        }
//
//    }
//}
import java.util.ArrayList;

public class StringTokenizer1 {
    public static void main(String[] args) {
        // create and initialize the ArrayList
//        ArrayList<String> sentence = new ArrayList<>();
//        sentence.add("Hello");
//        sentence.add("I");
//        sentence.add("am");
//        sentence.add("in");
//        sentence.add("GLA");
//        sentence.add("Welcome");
//        sentence.add("to");
//        sentence.add("GLA");
//        //print the ArrayList
//        System.out.println("The ArrayList: " + sentence);
//
//        LinkedList<String> l = new LinkedList<>(sentence);
//        System.out.println(l);
////        for (String element : l) {
////            if(element.equalsIgnoreCase("GLA"))
////                element.remove();
////            }
//            l.remove("GLA");
//            l.remove("GLA");
//        for (String ele:l) {
//            System.out.println(ele);
//        }
//
//
//            // Join with an empty delimiter to concat all strings.
////        String resultStr = String.join(" ", metroList);
////        System.out.println("\nString converted from ArrayList: "+resultStr);
//
//        System.out.println(l);
//    }
//}

        ArrayList al = new ArrayList();
        al.add("GLA");
        al.add("I'm");
        al.add("GLA");
        al.add("in");
        al.add("University");
        al.add("GLA");
        LinkedList l1 = new LinkedList();
        l1.addAll(al);
        for (Object s : l1) {
            if (s != "GLA") {
                System.out.println(s);
            }
        }
    }
}