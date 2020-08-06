package FinalProject;

import java.util.Scanner;

public class Rental1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        rental.pilihan();
        System.out.print(" Ingin Bertransaksi Lagi? Ya=1 Tidak=2 : ");
        int hari=input.nextInt();
        if(hari==1){
            //  pemangilan kelas rental dan methode pilihan
            //nama class.nama methode
            rental.pilihan();
        }

    }
}
