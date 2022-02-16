
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        int inputan;
        Mobil M_71200617 = new Mobil();
        PejalanKaki P_71200617 = new PejalanKaki();
        Scanner a = new Scanner(System.in);
        System.out.println("Input lalu lintas");inputan = a.nextInt();


        if(inputan==1){
            System.out.println("Lampu Merah");
            M_71200617.jalan();
            P_71200617.menunggu();

        }else if(inputan==2){
            System.out.println("Lampu Kuning");
            M_71200617.kurangiKecepatan();
            P_71200617.bersiap();
        }else if(inputan==3){
            System.out.println("Lampu Hijau");
            M_71200617.berhenti();
            P_71200617.menyebrang();
        }




    }
}
