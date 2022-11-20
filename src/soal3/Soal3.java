package soal3;

import java.util.ArrayList;
import java.util.List;

public class Soal3 {
    public static void jawaban(){
        List<Mahasiswa> daftarMahasiswa = new ArrayList<>();

        daftarMahasiswa.add(new Mahasiswa(1,"Andi Sugara Putra","TIF RM 22 A",19));
        daftarMahasiswa.add(new Mahasiswa(2,"Siti Fatmah","12 IPA",07));
        daftarMahasiswa.add(new Mahasiswa(3,"Sakinah Aulia Putri","5 A",07));
        daftarMahasiswa.add(new Mahasiswa(4,"Salsabila Aulia Putri","3 B",12));
        daftarMahasiswa.add(new Mahasiswa(5,"Reza Prasetyo","2 A",13));

        System.out.println("Berikut adalah hasil dari toString daftar soal3.Mahasiswa");
        System.out.println("===================================================");

        daftarMahasiswa.forEach(mahasiswa -> System.out.println(mahasiswa));

        System.out.println("\nKemudian Hapus data ke 3");
        System.out.println("===================================================");
        daftarMahasiswa.remove(2);
        daftarMahasiswa.forEach(mahasiswa -> System.out.println(mahasiswa));

        System.out.println("\nKemudian Tambahkan data baru");
        System.out.println("===================================================");
        daftarMahasiswa.add(new Mahasiswa(6,"Michael Al-Gabriel","TI RP A",26));
        daftarMahasiswa.forEach(mahasiswa -> System.out.println(mahasiswa));

        System.out.println("Banyaknya data ="+ daftarMahasiswa.size());

    }
}
