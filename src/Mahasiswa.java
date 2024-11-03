import java.util.ArrayList;
import java.util.List;

public class Mahasiswa extends Person {
    private String nim;
    private boolean hadir;

    public Mahasiswa(String nama, String nim) {
        super(nama);
        this.nim = nim;
        this.hadir = false;
    }
    public String getNim() {
        return nim;
    }
    public boolean isHadir() {
        return hadir;
    }
    @Override
    public void absen() {
        hadir = true;
    }


}
