import java.util.regex.*;
 
class url {
    public static boolean
    isValidURL(String url)
    {
        // Regex to check valid URL
        String regex = "((http|https)://)(www.)?"
              + "[a-zA-Z0-9@:%._\\+~#?&//=]"
              + "{2,256}\\.[a-z]"
              + "{2,6}\\b([-a-zA-Z0-9@:%"
              + "._\\+~#?&//=]*)";
        String regex1 = "^[A-Za-z0-9+_.-]+@(.+)$";
        String regex2 = "^[A-Za-z0-9+_.-]+@gla.ac.in";
        Pattern p = Pattern.compile(regex2);
        if (url == null) {
            return false;
        }
        Matcher m = p.matcher(url);
        return m.matches();
    }
    public static void main(String args[])
    {
        String url = "shubhanshunishadcsccv20@gmail.com";
        if (isValidURL(url) == true) {
            System.out.println("Yes");
        }
        else
            System.out.println("NO");
    }
}


// import java.util.regex.*;
// class url{
//     public static void main(String args[]) {

//         String passwd = "aaZZa44@"; 
//         String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
//         System.out.println(passwd.matches(pattern));
//         System.out.println(Pattern.matches("(?=.[a-z])*[A-Z]*[0-9]*","shu"));
        
//     }



// }