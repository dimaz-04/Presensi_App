import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIProgramAbsensiKelas {
    private Kelas kelasJava;
    private JTextField nimField;

    public GUIProgramAbsensiKelas() {
        kelasJava = new Kelas("Pemrograman Java");
        initializeUI();
    }

    private void initializeUI() {
        JFrame frame = new JFrame("Sistem Absensi Kelas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        JLabel labelNIM = new JLabel("NIM Mahasiswa:");
        nimField = new JTextField();

        JButton buttonAbsen = new JButton("Absen Mahasiswa");
        buttonAbsen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nim = nimField.getText();
                kelasJava.absenMahasiswa(nim);
                nimField.setText("");
            }
        });

        JButton buttonTampilkan = new JButton("Tampilkan Daftar Mahasiswa");
        buttonTampilkan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kelasJava.tampilkanDaftarMahasiswa();
            }
        });

        JButton buttonTambah = new JButton("Tambah Mahasiswa");
        buttonTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = JOptionPane.showInputDialog("Masukkan Nama Mahasiswa:");
                String nim = JOptionPane.showInputDialog("Masukkan NIM Mahasiswa:");
                kelasJava.tambahMahasiswa(new Mahasiswa(nama, nim));
            }
        });

        panel.add(labelNIM);
        panel.add(nimField);
        panel.add(buttonAbsen);
        panel.add(buttonTampilkan);
        panel.add(buttonTambah);

        frame.add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GUIProgramAbsensiKelas();
            }
        });
    }
}
