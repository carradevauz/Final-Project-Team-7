package FinalProject;

import java.util.Scanner;

public class rental {
    int hari;
    int harga;
    int sewa;
    double mobil;
    Scanner input = new Scanner(System.in);
    //    konstructor over loading rental untu motor
    public rental(int sewa){
        this.sewa=sewa;
        System.out.println("Sewa perhari :"+sewa);
    }
    //    konstructor over loading rental untuk mobil
    public rental(int mobil,int hari){
        this.mobil=mobil;
        this.hari=hari;
        int byr=mobil*hari;
        System.out.println("Sewa perhari :"+byr);
    }
    public static void pilihan(){
        Scanner input = new Scanner(System.in);
        System.out.println("Silahkan pilih Kendaraan :");
        System.out.println("1. Roda dua");
        System.out.println("2. Roda empat");
        System.out.print("Masukkan pilihan : ");
        int pilih = input.nextInt();
        switch(pilih){
            case 1:
                rental.roda2();
                break;
            case 2:
                rental.roda4();
                break;
        }


    }
    //    methode roda 2 ataumotor
    public static void roda2(){
        Scanner input = new Scanner(System.in);
        System.out.println("======================");
        System.out.println("Pilih Jenis Motor");
        System.out.println("======================");
        System.out.println("1.Honda vario");
        System.out.println("2.Honda beat");
        System.out.println("3.Yamaha Nmax");
        System.out.println("4.Yamaha Mio");
        System.out.print("Masukka pilihan : ");
        int pilih1=input.nextInt();
        switch(pilih1){
            case 1:
                rental vario=new rental(80000);
                vario.tampilroda2();
                break;
            case 2:
                rental beat=new rental(70000);
                beat.tampilroda2();
                break;
            case 3:
                rental Nmax=new rental(100000);
                Nmax.tampilroda2();
                break;
            case 4:
                rental mio=new rental(50000);
                mio.tampilroda2();
                break;
        }
    }
    //    methode roda 4 atau mobil
    public static void roda4(){
        Scanner input = new Scanner(System.in);
        System.out.println("======================");
        System.out.println("Pilih Tipe Mobil ");
        System.out.println("======================");
        System.out.println("1.Avanza");
        System.out.println("2.Xenia");
        System.out.println("3.Jazz");
        System.out.println("4.Yaris");
        System.out.println("5.Agya");
        System.out.print("Masukkan pilihan : ");
        int pilih2=input.nextInt();
        switch(pilih2){
            case 1:
                rental avanza=new rental(400000,1);
                avanza.tampilroda4();
                break;
            case 2:
                rental xenia=new rental(300000,1);
                xenia.tampilroda4();
                break;
            case 3:
                rental jazz=new rental(350000,1);
                jazz.tampilroda4();
                break;
            case 4:
                rental yaris=new rental(400000,1);
                yaris.tampilroda4();
                break;
            case 5:
                rental agya=new rental(250000,1);
                agya.tampilroda4();
        }
    }
    void tampilroda2(){
        int jumlahharir2;
        Scanner input = new Scanner(System.in);
        System.out.print("lama sewa:");
        int jmhari=input.nextInt();
        jumlahharir2=jmhari*sewa;
        System.out.print("Anda memilih motor");
        System.out.println("Dengan harga sewa : "+jumlahharir2);
    }
    void tampilroda4() {
        int jumlahhari;
        Scanner input = new Scanner(System.in);
        System.out.print("Lama sewa :");
        int jmhari = input.nextInt();
        jumlahhari = (int) (jmhari * mobil * hari);
        System.out.print("Anda memilih mobil");
    }

    }
