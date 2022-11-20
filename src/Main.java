import soal1.Soal1;
import soal2.Soal2;
import soal3.Soal3;
import soal4.Soal4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hallo,Ini Adalah Projek UTS Struktur data");
        System.out.println("Nama  : Andi Sugara Putra");
        System.out.println("NPM   : 22552011093");
        System.out.println("Kelas : TIF RM 22A");

        getSoal();

    }

    public static void getSoal(){
        try {
            Scanner inputScan = new Scanner(System.in);
            System.out.print("Pilih Nomor Soal Ujian 1-4 :");
            int noSoal = inputScan.nextInt();

            switch (noSoal){
                case 1:
                    Soal1.jawaban();
                    reRunSoal(1);
                    getSoal();
                    break;
                case 2:
                    Soal2.jawaban();
                    reRunSoal(2);
                    getSoal();
                    break;
                case 3:
                    Soal3.jawaban();
                    reRunSoal(3);
                    getSoal();
                    break;
                case 4:
                    Soal4.jawaban();
                    reRunSoal(4);
                    getSoal();
                    break;
                default:
                    System.out.println("No. Soal Tidak Tersedia");
                    getSoal();
                    break;
            }
        }catch (Exception e){
            System.out.println("Data yang dimasukan salah");
            getSoal();
        }

    }

    public static void reRunSoal(int noSoal){
        try {
            System.out.println("Jalankan Kembali Soal?");
            System.out.println("1.Ya");
            System.out.println("2.Tidak");

            System.out.print("Ketik 1 atau 2 :");
            Scanner numInput = new Scanner(System.in);
            int cekMetode = numInput.nextInt();

            switch (cekMetode){
                case 1:
                    getNoSoal(noSoal);
                    reRunSoal(noSoal);
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Salah memilih angka");
                    break;
            }
        }catch (Exception e){
            System.out.println("Data yang dimasukan salah");
            reRunSoal(noSoal);
        }
    }

    public static void getNoSoal(int noSoal){
        if (noSoal == 1){
            Soal1.jawaban();
        } else if (noSoal == 2) {
            Soal2.jawaban();
        } else if (noSoal == 3) {
            Soal3.jawaban();
        }else if (noSoal == 4) {
            Soal4.jawaban();
        }
    }

}