package soal4;

import soal3.Mahasiswa;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Soal4 {
    static LinkedList<Mahasiswa> mahasiswaLinkedList = new LinkedList<>();
    public static void jawaban(){
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Simple Linked List");
        System.out.println("Pilih Menu");
        System.out.println("1.Tampil Mahasiswa");
        System.out.println("2.Tambah Mahasiswa");
        System.out.println("3.Hapus Mahasiswa");
        System.out.println("4.Kembali");
        System.out.print("Pilih 1/2/3/4 = ");


        try {
        int menu = inputScanner.nextInt();
            switch (menu){
                case 1:
                    getMahasiswa(mahasiswaLinkedList);
                    jawaban();
                    break;
                case 2:
                    setMahasiswa();
                    jawaban();
                    break;
                case 3:
                    deleteMahasiswa();
                    jawaban();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Menu tidak ada");
                    break;
            }
        }catch (Exception e){
            System.out.println("Data yang dimasukan salah");
            jawaban();
        }
    }

    public static void getMahasiswa(LinkedList<Mahasiswa> mahasiswaLinkedList){

        Iterator iter = mahasiswaLinkedList.iterator();
        System.out.print("HEAD -> ");
        while (iter.hasNext()) {
            System.out.print(iter.next());
            System.out.print("<=>");
        }
        System.out.println("null");
    }


    public static void setMahasiswa(){
        try {
            Scanner scannerID = new Scanner(System.in);
            Scanner scannerNama = new Scanner(System.in);
            Scanner scannerKelas = new Scanner(System.in);
            Scanner scannerTgl = new Scanner(System.in);
            System.out.println("Masukan data mahasiswa");
            System.out.print("ID mahasiswa = ");
            int id = scannerID.nextInt();
            System.out.print("Nama Mahasiswa = ");
            String nama = scannerNama.nextLine();
            System.out.print("Kelas = ");
            String kelas = scannerKelas.nextLine();
            System.out.print("Tanggal Masuk = ");
            int tanggal = scannerTgl.nextInt();

            Mahasiswa mahasiswa = new Mahasiswa(id,nama,kelas,tanggal);
            mahasiswaLinkedList.addFirst(mahasiswa);
        }catch (Exception e){
            System.out.println("Data yang dimasukan salah");
            setMahasiswa();
        }
    }

    public static void deleteMahasiswa(){
        try {
            System.out.print("Hapus mahasiswa berdasarkan urutan data(contoh : 1) =");
            Scanner inputId = new Scanner(System.in);
            int id = inputId.nextInt();
            mahasiswaLinkedList.remove(id -1);
        }catch (Exception e){
            System.out.println("Tidak ada data mahasiswa");
            deleteMahasiswa();
        }
    }
}
