import koneksi.Database;

import model.Dosen;
import model.Mahasiswa;
import model.MataKuliah;

public class Main {
  public static void main(String[] args) {
    System.out.println("ini program main");

    Database.hubungkan();

    Dosen.tampilkan();
    Mahasiswa.tampilkan();
    MataKuliah.tampilkan();
  }
}
