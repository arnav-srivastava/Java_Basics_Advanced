abstract class AKTU{
    void Btech()
    {
        System.out.println("Btech by Aktu");
    }
    abstract void manager(); // declaration
    abstract void CEO();
}
public class college extends AKTU{
    // kOverride
    void manager() // definition
    {
        System.out.println("AKTU manager");
    }
    void CEO(){
        System.out.println("CEO of AKTU");
    }
    void diploma(){
        System.out.println("self course");

    }
    
    public static void main(String[] args) {
        college obj = new college();
        obj.diploma();
        obj.manager();
        // AKTU con = new AKTU();
        // con.Btech();
    }
}
