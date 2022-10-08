 class sunmicrosoft {
     //overridden
     final  void clang(){
        System.out.println("c by sunmicrosoft....base");
    }
    
}

class fnoverriding extends sunmicrosoft{
    // override
    void clang(int a){
        System.out.println("c by oracle.....derived");
    }
    public static void main(String[] args) {
        fnoverriding   con = new fnoverriding ();
        con.clang(23);

    }
}