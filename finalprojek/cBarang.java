package finalprojek;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

class cBarang {
    private cPelanggan pelanggan;
    private cMenu menu[];
    private int jmenu, maksproduk;
    private Scanner s = new Scanner(System.in);
    String pembatas = "================================";
    private static int nomornota = 1000;

    cBarang() {
        maksproduk = 20;
        menu = new cMenu[maksproduk];
        jmenu = 0;
        System.out.println("");
    }

    public void listpelanggan(cPelanggan p) {
        pelanggan = p;
        System.out.println("");
    }

    public void tambahkeranjang(cMenu m) {
        if ((jmenu >= maksproduk)) {
            System.out.println("Daftar menu penuh");
        } else {
            menu[jmenu] = m;
            System.out.println("Penambahan Berhasil");
            jmenu++;
        }
    }

    public void tambahmenu(cMenu t) {
        if ((jmenu >= maksproduk)) {
            System.out.println("Menu penuh");
            jmenu++;
        } else {
            menu[jmenu] = t;
            System.out.println("Penambahan berhasil");
        }
    }

    public void hapuskeranjang() {
        if (maksproduk < 0) {
            System.out.println("Keranjang Kosong");
        } else {
            System.out.print("Menu yang ingin dihapus = ");
            String nm = s.next();
            boolean ada = false;
            for (int i = 0; i < maksproduk; i++) {
                if (nm.equalsIgnoreCase(menu[i].getnama())) {
                    ada = true;
                    System.out.println("Apakah anda yakin ingin menghapusnya?");
                    System.out.println("1. Iya");
                    System.out.println("2. Tidak");
                    System.out.print("Pilih = ");
                    int y = s.nextInt();
                    if (y == 1) {
                        menu[i] = null;
                        int x = i;
                        for (int j = x; j < maksproduk; j++) {
                            if (j == maksproduk - 1) {
                                menu[j] = null;
                            } else {
                                menu[j] = menu[j + 1];
                            }
                        }
                        maksproduk--;
                        System.out.println("Menu dihapus");
                    } else {
                        System.out.println("Penghapusan Dibatalkan");
                    }
                    break;
                }
            }
            if (!ada) {
                System.out.println("Menu tidak ditemukan");
            }
        }
    }

    public void checkout(cPelanggan[] daftarPelanggan) {
        System.out.print("Masukkan nama pelanggan: ");
        String namaPelanggan = s.nextLine();

        boolean isMember = false;
        for (cPelanggan pl : daftarPelanggan) {
            if (pl != null && pl.getNamap().equalsIgnoreCase(namaPelanggan)) {
                isMember = true;
                break;
            }
        }
        int nomornota = generateNomorNota();
        System.out.println("Nota: #" + nomornota);
        System.out.println("Nama Pelanggan : " + namaPelanggan);
        System.out.println("Checkout");
        System.out.println(pembatas);
        int totalHarga = 0;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i] != null) {
                System.out.println("Nama Menu: " + menu[i].getnama());
                System.out.println("Harga: " + menu[i].getharga());
                LocalTime waktuSekarang = LocalTime.now();
                System.out.println(waktuSekarang);
                totalHarga += menu[i].getharga();
                LocalDate tanggalSekarang = LocalDate.now();
                System.out.println(tanggalSekarang);
                System.out.println(pembatas);

                menu[i].setstok(menu[i].getstok() - 1);
            }
        }
        if (isMember) {
            double diskon = 0.1 * totalHarga;
            totalHarga -= diskon;
            System.out.println("Anda mendapatkan diskon 10%!");
            System.out.println("Total Harga Setelah Diskon: " + totalHarga);
        }
        System.out.println("Total Harga: " + totalHarga);

        System.out.print("Masukkan nominal uang yang ingin dibayarkan: ");
        int nominalBayar = s.nextInt();

        int kembalian = nominalBayar - totalHarga;
        System.out.println("Kembalian: " + kembalian);

        while (nominalBayar < totalHarga) {
            System.out.println("Uang yang dibayarkan kurang dari total harga. Harap masukkan nominal uang yang cukup.");
            System.out.print("Masukkan nominal uang yang ingin dibayarkan: ");
            nominalBayar = s.nextInt();
            kembalian = nominalBayar - totalHarga;
            System.out.println("Kembalian: " + kembalian);
        }

        System.out.println("=================================");
    }

    private static int generateNomorNota() {
        return ++nomornota;
    }

    public void lihatkeranjang() {
        System.out.println("Keranjang Pembelian");
        System.out.println(pelanggan.ToString());

        for (int i = 0; i < maksproduk; i++) {
            if (menu[i] != null) {
                System.out.println((i + 1) + " . " + menu[i].ToString());
            }
        }
        System.out.println("");
    }

}