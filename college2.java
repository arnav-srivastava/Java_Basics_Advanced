interface  AKTU1{
    // void Btech()
    // {
    //     System.out.println("Btech by Aktu");
    // }
    // abstract void manager(); // declaration
    // abstract void CEO();
    abstract void Btech();
    static void shu(){
        System.out.println("this is my program ");
    }
}
interface LPU
{
    abstract void mtech();
    public void mba();
}
class college2 implements AKTU1,LPU{
    // kOverride
    // void manager() // definition
    // {
    //     System.out.println("AKTU manager");
    // }
    public void Btech(){
        System.out.println("Btech of AKTU");
    }
    void diploma(){
        System.out.println("self course");

    }
    public void mba(){
        System.out.println("MBA ");
    }
    public void mtech(){
        System.out.println("Mtech .... ");
    }
    public static void main(String[] args) {
        college2 obj = new college2();
        obj.diploma();
        obj.mba();
        obj.mtech();
        obj.Btech();
        // AKTU con = new AKTU();
        // con.Btech();
    }
}
