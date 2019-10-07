/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.pkg1.pkg10118007.latihan17.tunjangan;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Nama      : Rama Al Halik
 * Kelas     : IF-1
 * NIM       : 10118007
 * Deskripsi : Menampilkan tunjangan gaji seorang karyawan
 * @author Rama
 */
public class Tunjangan {

    String status;
    double gajiPokok;

    public void dataPegawai() {

        Scanner masuk = new Scanner(System.in);

        System.out.println("===========Program Tunjangan===========");

        System.out.print("Berapa gaji pokok anda perbulan? \t: Rp. ");
        gajiPokok = masuk.nextDouble();

        System.out.print("Status Anda? (Menikah/Belum)\t\t: ");
        status = masuk.nextLine();
        status = masuk.nextLine();
    }

    public void Hitung() {
        double tunjangan;
        double total;
        DecimalFormat satuan = new DecimalFormat("0.00");

        tunjangan = status.equals("Menikah") ? 0.35 * gajiPokok : 0;
        total = tunjangan + gajiPokok;

        System.out.println("========Hasil Perhitungan Gaji Anda=============");
        System.out.println("Gaji Pokok \t\t: Rp. " + satuan.format(gajiPokok));
        System.out.println("Tunjangan \t\t: Rp. " + satuan.format(tunjangan));
        System.out.println("Total Gaji \t\t: Rp. " + satuan.format(total));
    }

    public static void main(String[] args) {
        Tunjangan Hasil = new Tunjangan();
        Hasil.dataPegawai();
        Hasil.Hitung();
    }

}