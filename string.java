

public class string {
    public static void main(String[] args) {
        String str1="Hello wE aRe learnING JAva ";
        String str2="Hello wE aRe learnING JAva";
        char str4 ='w';
        char str5='w';
        System.out.println(str1);
        System.out.println("---------------------------------------");
        String res1 = str1.toUpperCase();
        String res2 = str1.toLowerCase();
        String res3 = str1.replace("Hello", "I am ji");
        String res4 = str1.replace('a','x');
        int res5 = str1.length();
        String res6 = str1.trim();
        char res7 = str1.charAt(2);
        int res8 = str1.indexOf("wE");
        boolean res9 = str1.equals(str2);
        boolean res10 = str1.equalsIgnoreCase(str2);
        int res11 = str1.compareTo(str2);
       // int res12 = str4.compareTo(str5);
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res4);
        System.out.println(res5);
        System.out.println(res6.length());
        System.out.println(res7);
        System.out.println(res8);
        System.out.println(res9);
        System.out.println(res10);
        System.out.println(res11);
    }
    
}
