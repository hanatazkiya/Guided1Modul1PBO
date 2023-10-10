public class main {
    public static void main(String args[])
    {
        int jumlah_looping=5;
        int bil1=5;
        int bil2=2;
        DemoObjectOriented Demo = new DemoObjectOriented ();
        Demo.helloWorld(jumlah_looping);
        System.out.print("\n-Pemanggilan Fungsi Tambah-\n");
        System.out.print(" Hasil Operasi Tambah : "+Demo.tambah(bil1,bil2)+"\n");
    }

}
