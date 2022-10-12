class Balok {
     int luas, keliling, volume;
    
    public int luas(int panjang, int lebar, int tinggi){
        luas = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
        return luas;
    }
    
     public int keliling(int panjang, int lebar, int tinggi){
        keliling = 4 * (panjang + lebar + tinggi);
        return keliling;
    }
     
     public int volume(int panjang, int lebar, int tinggi){
        volume = panjang * lebar * tinggi;
        return volume;
    }
}

public class Hitung {
    public static void main(String[] args)
    {
        int panjang, lebar, tinggi, volume, luas, keliling;
        Balok balok = new Balok();
        Scanner key = new Scanner(System.in);
        
        System.out.println("===============================================");
        System.out.println("Program Menghitung Volume, Luas, Keliling Balok");
        System.out.println("================================================");
        
        System.out.print("Masukkan Panjang Balok: ");
        panjang = key.nextInt();
        System.out.print("Masukkan Lebar Balok: ");
        lebar = key.nextInt();
        System.out.print("Masukkan Tinggi Balok: ");
        tinggi = key.nextInt();
        
        volume = balok.volume(panjang, lebar, tinggi);
        luas = balok.luas(panjang, lebar, tinggi);
        keliling = balok.keliling(panjang, lebar, tinggi);
        
        System.out.println("===============================================");
        System.out.println("Volume Balok Adalah: "+volume);
        System.out.println("Luas Balok Adalah: "+luas);
        System.out.println("Keliling Balok Adalah: "+keliling);
    } 
}