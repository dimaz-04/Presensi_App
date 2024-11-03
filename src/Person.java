public abstract class Person implements Absensi {
    protected String nama;

    public Person(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    @Override
    public abstract void absen();
}
