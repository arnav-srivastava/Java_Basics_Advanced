// parent , super , 
class sunmicrosoft {
    void java(){
        System.out.println("java prog ...");
    }
}

class google extends sunmicrosoft {
    void Android(){
        System.out.println("Android app development ...");
    }
}

// child , sub , derived 
class oracle extends google{
    void DBMS(){
        System.out.println("sql.............");
    }
    public static void main(String[] args) {
        oracle con = new oracle();
        con.DBMS();
        con.java();
        
    }
}
