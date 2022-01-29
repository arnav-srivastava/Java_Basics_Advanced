import java.util.ArrayList;

import static java.util.Arrays.sort;

public class ArraySorted {
    public static void main(String[] args) {
//        int arr[]={8,15,14,16};
//        sort(arr);
//        for (int i = 0; i <arr.length; i++) {
//            System.out.println(arr[i]);
//        }
        ArrayList al=new ArrayList();
        al.add(24);
        al.add(42);
        al.add(12);
        al.add(34);
        Object[] arr =al.toArray();
        for (Object ele:
             arr) {
            System.out.println(ele);
        }

    }
}
