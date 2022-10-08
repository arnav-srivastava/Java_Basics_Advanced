class ABC{

}
public class runable extends ABC implements Runnable{
public void run(){
    for(int i=1;i<=10;i++){
        System.out.println(i);
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){

        }
    }
    

}
public static void main(String args[]){
    runable obj = new runable();
    Thread th= new Thread(obj);
    th.start();
}
    
}
