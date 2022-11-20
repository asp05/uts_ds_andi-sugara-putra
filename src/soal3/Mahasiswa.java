package soal3;

public class Mahasiswa {
    private int id;
    private String nama;
    private String kelas;
    private int tglMasuk;

    public Mahasiswa(int id, String nama, String kelas, int tglMasuk) {
        this.id = id;
        this.nama = nama;
        this.kelas = kelas;
        this.tglMasuk = tglMasuk;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public int getTglMasuk() {
        return tglMasuk;
    }

    public void setTglMasuk(int tglMasuk) {
        this.tglMasuk = tglMasuk;
    }

    @Override
    public String toString() {
        return "soal3.Mahasiswa{" +
                "id=" + id +
                ", nama='" + nama + '\'' +
                ", kelas='" + kelas + '\'' +
                ", tglMasuk=" + tglMasuk +
                '}';
    }
}
