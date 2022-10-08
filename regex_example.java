import java.util.regex.*;
class regex_example{
    public static void main(String args[]) {

        System.out.println(Pattern.matches(".s","as"));//true (2nd char is s)
        System.out.println(Pattern.matches(".s","asss"));//false (legth is more than 2)
        System.out.println(Pattern.matches(".s","ammm"));//false (both length and s is not fit)
        System.out.println(Pattern.matches(".s","as1212"));//false (length is greater than 2)
        System.out.println(Pattern.matches(".s","as5"));//false (length is greater than 2 )

        System.out.println(Pattern.matches("[amm]","abcd"));//false (not a a or m or n)
        System.out.println(Pattern.matches("[amm]","amn"));//false (legth is more than 2)
        System.out.println(Pattern.matches("[amm]","a"));//true (amonng a or m or n)
        System.out.println(Pattern.matches("[amm]","ammma"));//false (m and a comes more than ones )
        System.out.println(Pattern.matches("[amm]","as5"));//false (length is greater than 2 )

        System.out.println("? quantifier ....");  
        System.out.println(Pattern.matches("[amn]?", "a"));//true (a or m or n comes one time)  
        System.out.println(Pattern.matches("[amn]?", "amn"));//false (a comes more than one time)  
        System.out.println(Pattern.matches("[amn]?", "aammmnn"));//false (a m and n comes more than one time)  
        System.out.println(Pattern.matches("[amn]?", "aazzta"));//false (a comes more than one time)  
        System.out.println(Pattern.matches("[amn]?", "am"));//false (a or m or n must come one time)  
          
        System.out.println("+ quantifier ....");  
        System.out.println(Pattern.matches("[amn]+", "a"));//true (a or m or n once or more times)  
        System.out.println(Pattern.matches("[amn]+", "aaa"));//true (a comes more than one time)  
        System.out.println(Pattern.matches("[amn]+", "aammmnn"));//true (a or m or n comes more than once)  
        System.out.println(Pattern.matches("[amn]+", "aazzta"));//false (z and t are not matching pattern)  
          
        System.out.println("* quantifier ....");  
        System.out.println(Pattern.matches("[amn]*", "ammmna"));//true (a or m or n may come zero or more times) 

        System.out.println("metacharactes d....."); // false 
        System.out.println(Pattern.matches("\\d", "abc"));//false (non-digit)  
        System.out.println(Pattern.matches("\\d", "1"));//true (digit and comes once)  
        System.out.println(Pattern.matches("\\d", "4443"));//false (digit but comes more than once)  
        System.out.println(Pattern.matches("\\d", "323abc"));//false (digit and char)  
  
        System.out.println("metacharacters D....");// \\D means non-digit  
  
        System.out.println(Pattern.matches("\\D", "abc"));//false (non-digit but comes more than once)  
        System.out.println(Pattern.matches("\\D", "1"));//false (digit)  
        System.out.println(Pattern.matches("\\D", "4443"));//false (digit)  
        System.out.println(Pattern.matches("\\D", "323abc"));//false (digit and char)  
        System.out.println(Pattern.matches("\\D", "#"));//true (non-digit and comes once)  
  
        System.out.println("metacharacters D with quantifier....");  
        System.out.println(Pattern.matches("\\D*", "mak"));//true (non-digit and may come 0 or more times)  
        
        // create a regular expression that accepts alphanumeric characters only.
        // its length must be six characters long only.
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","shu23A"));
        System.out.println(Pattern.matches("[0-9]{10}","9455593295"));
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","shu23Ass")); // more than 6 characters
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","123456")); // condition is matched
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","su23A@")); // ($ is not matched)
        
        // Create a regular expression that accepts 10 digit numeric characters starting with 7,8,9 only .
        System.out.println(Pattern.matches("[789]{1}[0-9]{9}","9455593295"));//true
        System.out.println(Pattern.matches("[789][0-9]{9}","9455593295"));//true
        System.out.println(Pattern.matches("[789][0-9]{9}","94552593295"));//false
        System.out.println(Pattern.matches("[789][0-9]{9}","6455593295"));//false
        System.out.println(Pattern.matches("[789]{1}[0-9]{9}","9455593295"));//true
        System.out.println("by metacharacters .....");

        System.out.println(Pattern.matches("[789]{1}\\d{9}","9455593295"));
        System.out.println(Pattern.matches("[789]{1}\\d{9}","3455593295"));
        
    }



}