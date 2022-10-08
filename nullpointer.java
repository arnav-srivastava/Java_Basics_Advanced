class Nullpointer
{
    void func()
    {
        System.out.println("hello");
    }    
    public static void main(String args[])
    {
        Nullpointer obj=null;
        //obj=new Nullpointer();
        obj.func();
    }
}
