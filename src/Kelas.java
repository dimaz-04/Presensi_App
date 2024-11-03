import java.util.ArrayList;
import java.util.List;
public class Kelas {
    private String nama;
    private List<Mahasiswa> daftarMahasiswa;

    public Kelas(String nama) {
        this.nama = nama;
        this.daftarMahasiswa = new ArrayList<>();
    }
    public void tambahMahasiswa(Mahasiswa mahasiswa){
        daftarMahasiswa.add(mahasiswa);
    }

    public String getNama() {
        return nama;
    }



    public void absenMahasiswa(String nim) {
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            if (mahasiswa.getNim().equals(nim)) {
                mahasiswa.absen();
                System.out.println("Absensi berhasil untuk mahasiswa dengan NIM " + nim);
                return;
            }
        }
        System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan");
    }

    public void tampilkanDaftarMahasiswa() {
        System.out.println("Daftar Mahasiswa untuk Kelas " + getNama() + ":");
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            System.out.println("Nama: "+ mahasiswa.getNama() + ", NIM: " + mahasiswa.getNim() + ", Hadir: " + (mahasiswa.isHadir() ? "Ya" : "Tidak"));
        }
    }

}
