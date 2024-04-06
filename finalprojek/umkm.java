package finalprojek;

import javax.swing.JOptionPane;
import java.util.Scanner;

class burger extends cMenu {

    burger(String nama, int harga, int stok) {
        super(nama, harga, stok);
    }
}

class kebab extends cMenu {

    kebab(String nama, int harga, int stok) {
        super(nama, harga, stok);
    }
}

public class umkm {
    public static void main(String[] args) {

        String validUsername = "bepehasik";
        String validPassword = "kelompok3";
        String pembatas = "================================";
        int pilih;
        int pilih2;
        int pilih3;
        int pilih4;
        int pilih5;
        boolean isLoggedIn = false;
        Scanner s = new Scanner(System.in);
        cBarang beli = new cBarang();

        cMenu makanan[] = new cMenu[10];
        for (int i = 0; i < makanan.length; i++) {
            makanan[i] = new cMenu("", 0, 0);
        }
        kebab kebab[] = new kebab[10];
        for (int i = 0; i < kebab.length; i++) {
            kebab[i] = new kebab("", 0, 0);
        }
        burger burger[] = new burger[10];
        for (int i = 0; i < burger.length; i++) {
            burger[i] = new burger("", 0, 0);
        }
        kebab[0].setnama("Jumbobeef");
        kebab[0].setharga(18000);
        kebab[0].setstok(50);

        kebab[1].setnama("Crunchy");
        kebab[1].setharga(19000);
        kebab[1].setstok(50);

        kebab[2].setnama("Supreme");
        kebab[2].setharga(21000);
        kebab[2].setstok(50);

        kebab[3].setnama("Beeffull");
        kebab[3].setharga(21000);
        kebab[3].setstok(50);

        kebab[4].setnama("Tuna");
        kebab[4].setharga(17000);
        kebab[4].setstok(50);

        kebab[5].setnama("SosisZ");
        kebab[5].setharga(17000);
        kebab[5].setstok(50);

        burger[0].setnama("BurgerBeef");
        burger[0].setharga(16000);
        burger[0].setstok(40);

        burger[1].setnama("BurgerChicken");
        burger[1].setharga(15000);
        burger[1].setstok(40);

        burger[2].setnama("BurgerMaxDuo");
        burger[2].setharga(20000);
        burger[2].setstok(40);

        burger[3].setnama("BurgerCrunchy");
        burger[3].setharga(17000);
        burger[3].setstok(40);

        makanan[0].setnama("Omeleto");
        makanan[0].setharga(20000);
        makanan[0].setstok(30);

        makanan[1].setnama("MaryamCheezeweec");
        makanan[1].setharga(12000);
        makanan[1].setstok(30);

        makanan[2].setnama("HotDog");
        makanan[2].setharga(15000);
        makanan[2].setstok(30);

        cPelanggan[] daftarPelanggan = new cPelanggan[50];
        daftarPelanggan[0] = new cPelanggan("Yudha", "08123456789");
        daftarPelanggan[1] = new cPelanggan("Tiara", "08234567891");
        daftarPelanggan[2] = new cPelanggan("Yosse", "08345678912");
        cPelanggan pl = new cPelanggan();
        do {
            String username = JOptionPane.showInputDialog("Username:");
            String password = JOptionPane.showInputDialog("Password:");
            if (username.equals(validUsername) && password.equals(validPassword)) {
                isLoggedIn = true;
                JOptionPane.showMessageDialog(null, "Login berhasil! Selamat datang");
            } else {
                JOptionPane.showMessageDialog(null,
                        "Login gagal! Username atau password salah. Silahkan login kembali");
            }
        } while (!isLoggedIn);

        do {
            System.out.println("===========SELAMAT DATANG===========");
            System.out.println("=============KEBAB KINGS=============");
            System.out.println("Silahkann pilih salah satu menu dibawah ini:");
            System.out.println(pembatas);
            System.out.println("1. Master Barang");
            System.out.println("2. Transaksi Penjualan");
            System.out.println("3. Pelanggan");
            System.out.println("4. Selesai");
            System.out.print("Pilih = ");
            System.out.println("");
            System.out.println(pembatas);
            pilih = s.nextInt();
            switch (pilih) {
                case 1:
                    do {
                        System.out.println(pembatas);
                        System.out.println("1. Tambah Barang");
                        System.out.println("2. Ubah Barang");
                        System.out.println("3. Hapus Barang");
                        System.out.println("4. Lihat Barang");
                        System.out.println("5. Kembali");
                        System.out.print("Pilih = ");
                        System.out.println("");
                        System.out.println(pembatas);
                        pilih2 = s.nextInt();
                        switch (pilih2) {
                            case 1:
                                do {
                                    System.out.println(pembatas);
                                    System.out.println("Tambah menu");
                                    System.out.println("Anda ingin menambahkan menu apa?");
                                    System.out.println("1. Kebab");
                                    System.out.println("2. Burger");
                                    System.out.println("3. Menu lain");
                                    System.out.println("4. Kembali");
                                    System.out.print("Pilih = ");
                                    pilih5 = s.nextInt();
                                    switch (pilih5) {
                                        case 1:
                                            System.out.println("Tambah Menu Kebab");
                                            System.out.println("Masukkan Nama = ");
                                            String nk = s.next();
                                            System.out.println("Masukkan Harga = ");
                                            int hk = s.nextInt();
                                            System.out.println("Masukkan Stok = ");
                                            int sk = s.nextInt();
                                            for (int i = 0; i < kebab.length; i++) {
                                                if (kebab[i].getnama().equals("")) {
                                                    kebab[i] = new kebab(nk, hk, sk);
                                                    break;
                                                }
                                            }
                                            break;
                                        case 2:
                                            System.out.println("Tambah Menu Burger");
                                            System.out.println("Masukkan Nama = ");
                                            String nb = s.next();
                                            System.out.println("Masukkan Harga = ");
                                            int hb = s.nextInt();
                                            System.out.println("Masukkan Stok = ");
                                            int sb = s.nextInt();
                                            for (int i = 0; i < burger.length; i++) {
                                                if (burger[i].getnama().equals("")) {
                                                    burger[i] = new burger(nb, hb, sb);
                                                    break;
                                                }
                                            }
                                            break;
                                        case 3:
                                            System.out.println("Tambah Menu Lain");
                                            System.out.println("Masukkan Nama = ");
                                            String nm = s.next();
                                            System.out.println("Masukkan Harga = ");
                                            int hm = s.nextInt();
                                            System.out.println("Masukkan Stok = ");
                                            int sm = s.nextInt();
                                            for (int i = 0; i < makanan.length; i++) {
                                                if (makanan[i].getnama().equals("")) {
                                                    makanan[i] = new cMenu(nm, hm, sm);
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                                } while (pilih5 != 4);
                                break;
                            case 2:
                                System.out.println(pembatas);
                                System.out.println("Ubah menu");
                                System.out.println("Pilih jenis menu yang ingin diubah:");
                                System.out.println("1. Kebab");
                                System.out.println("2. Burger");
                                System.out.println("3. Menu Lain");
                                System.out.println("4. Kembali");
                                System.out.print("Pilih = ");
                                int pilih6 = s.nextInt();
                                switch (pilih6) {
                                    case 1:
                                        System.out.println("Ubah Menu Kebab");
                                        System.out.print("Masukkan Nama Kebab yang Ingin Diubah = ");
                                        String namaKebab = s.next();
                                        for (int i = 0; i < kebab.length; i++) {
                                            if (kebab[i].getnama().equalsIgnoreCase(namaKebab)) {
                                                System.out.print("Masukkan Nama Baru = ");
                                                String kb = s.next();
                                                System.out.print("Masukkan Harga Baru = ");
                                                int kh = s.nextInt();
                                                System.out.print("Masukkan Stok Baru = ");
                                                int ks = s.nextInt();
                                                System.out.println("Apakah anda yakin ingin mengubahnya?");
                                                System.out.println("1. Iya");
                                                System.out.println("2. Tidak");
                                                System.out.print("Pilih = ");
                                                int y = s.nextInt();
                                                if (y == 1) {
                                                    kebab[i].setnama(kb);
                                                    kebab[i].setharga(kh);
                                                    kebab[i].setstok(ks);
                                                    System.out.println("Menu Kebab berhasil diubah.");
                                                } else {
                                                    System.out.println("Perubahan dibatalkan");
                                                }
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        System.out.println("Ubah Menu Burger");
                                        System.out.print("Masukkan Nama Burger yang Ingin Diubah = ");
                                        String namaBurger = s.next();
                                        for (int i = 0; i < burger.length; i++) {
                                            if (burger[i].getnama().equalsIgnoreCase(namaBurger)) {
                                                System.out.print("Masukkan Nama Baru = ");
                                                String bn = s.next();
                                                System.out.print("Masukkan Harga Baru = ");
                                                int bh = s.nextInt();
                                                System.out.print("Masukkan Stok Baru = ");
                                                int bs = s.nextInt();
                                                System.out.println("Apakah anda yakin ingin mengubahnya?");
                                                System.out.println("1. Iya");
                                                System.out.println("2. Tidak");
                                                System.out.print("Pilih = ");
                                                int y = s.nextInt();
                                                if (y == 1) {
                                                    burger[i].setnama(bn);
                                                    burger[i].setharga(bh);
                                                    burger[i].setstok(bs);
                                                    System.out.println("Menu Burger berhasil diubah.");
                                                } else {
                                                    System.out.println("Perubahan dibatalkan");
                                                }
                                                break;
                                            }
                                        }
                                        break;
                                    case 3:
                                        System.out.println("Ubah Menu Lain");
                                        System.out.print("Masukkan Nama Menu Lain yang Ingin Diubah = ");
                                        String namaMenuLain = s.next();
                                        for (int i = 0; i < makanan.length; i++) {
                                            if (makanan[i].getnama().equalsIgnoreCase(namaMenuLain)) {
                                                System.out.print("Masukkan Nama Baru = ");
                                                String mn = s.next();
                                                System.out.print("Masukkan Harga Baru = ");
                                                int mh = s.nextInt();
                                                System.out.print("Masukkan Stok Baru = ");
                                                int ms = s.nextInt();
                                                System.out.println("Apakah anda yakin ingin mengubahnya?");
                                                System.out.println("1. Iya");
                                                System.out.println("2. Tidak");
                                                System.out.print("Pilih = ");
                                                int y = s.nextInt();
                                                if (y == 1) {
                                                    makanan[i].setnama(mn);
                                                    makanan[i].setharga(mh);
                                                    makanan[i].setstok(ms);
                                                    System.out.println("Menu Lain berhasil diubah.");
                                                } else {
                                                    System.out.println("Perubahan dibatalkan");
                                                }
                                                break;
                                            }
                                        }
                                        break;
                                }
                                break;
                            case 3:
                                System.out.println(pembatas);
                                System.out.println("Hapus menu");
                                System.out.println("Pilih jenis menu yang ingin dihapus:");
                                System.out.println("1. Kebab");
                                System.out.println("2. Burger");
                                System.out.println("3. Menu Lain");
                                System.out.println("4. Kembali");
                                System.out.print("Pilih = ");
                                int hapus = s.nextInt();
                                switch (hapus) {
                                    case 1:
                                        System.out.println("MENU KEBAB");
                                        for (int i = 0; i < kebab.length; i++) {
                                            if (kebab[i] != null && !kebab[i].getnama().equals("")) {
                                                System.out.println(i+1 + ". " + kebab[i].getnama());
                                            }
                                        }
                                        System.out.print("Masukkan nama kebab yang ingin dihapus: ");

                                        int indexHapusMenu;

                                        indexHapusMenu = s.nextInt();
                                        if (indexHapusMenu >= 0 && indexHapusMenu < kebab.length) {
                                            System.out.println("Apakah anda yakin ingin menghapusnya?");
                                            System.out.println("1. Iya");
                                            System.out.println("2. Tidak");
                                            System.out.print("Pilih = ");
                                            int y = s.nextInt();
                                            if (y == 1) {
                                                kebab[indexHapusMenu] = new kebab("", 0, 0);
                                                System.out.println("Data kebab pada indeks " + indexHapusMenu
                                                        + " berhasil dihapus.");
                                            } else {
                                                System.out.println("Menu Batal dihapus");
                                            }
                                        } else {
                                            System.out.println("Indeks tidak valid.");
                                        }
                                        break;
                                    case 2:
                                        System.out.println("MENU BURGER");
                                        for (int i = 0; i < burger.length; i++) {
                                            if (burger[i] != null && !burger[i].getnama().equals("")) {
                                                System.out.println(i + ". " + burger[i].getnama());

                                            }
                                        }
                                        System.out.print("Masukkan indeks burger yang ingin dihapus: ");
                                        indexHapusMenu = s.nextInt();
                                        if (indexHapusMenu >= 0 && indexHapusMenu < burger.length) {

                                            System.out.println("Apakah anda yakin ingin menghapusnya?");
                                            System.out.println("1. Iya");
                                            System.out.println("2. Tidak");
                                            System.out.print("Pilih = ");
                                            int y = s.nextInt();
                                            if (y == 1) {
                                                burger[indexHapusMenu] = new burger("", 0, 0);
                                                System.out.println(
                                                        "Data burger pada indeks " + indexHapusMenu
                                                                + " berhasil dihapus.");
                                            } else {
                                                System.out.println("Menu Batal dihapus");
                                            }
                                        } else {
                                            System.out.println("Indeks tidak valid.");
                                        }
                                        break;
                                    case 3:
                                        System.out.println("MENU LAIN");
                                        for (int i = 0; i < makanan.length; i++) {
                                            if (makanan[i] != null && !makanan[i].getnama().equals("")) {
                                                System.out.println(i + ". " + makanan[i].getnama());
                                            }
                                        }
                                        System.out.print("Masukkan indeks menu lain yang ingin dihapus: ");
                                        indexHapusMenu = s.nextInt();
                                        if (indexHapusMenu >= 0 && indexHapusMenu < makanan.length) {
                                            makanan[indexHapusMenu] = new cMenu("", 0, 0);

                                            System.out.println("Apakah anda yakin ingin menghapusnya?");
                                            System.out.println("1. Iya");
                                            System.out.println("2. Tidak");
                                            System.out.print("Pilih = ");
                                            int y = s.nextInt();
                                            if (y == 1) {
                                                System.out.println("Data menu lain pada indeks " + indexHapusMenu
                                                        + " berhasil dihapus.");
                                            } else {
                                                System.out.println("Menu Batal hapus");
                                            }
                                        } else {
                                            System.out.println("Indeks tidak valid.");
                                        }
                                        break;
                                    case 4:
                                        break;
                                    default:
                                        System.out.println("Pilihan tidak valid.");
                                        break;
                                }
                                break;

                            case 4:
                                System.out.println(pembatas);
                                System.out.println("Daftar Menu");

                                System.out.println("MENU KEBAB");
                                for (int i = 0; i < kebab.length; i++) {
                                    if (kebab[i] != null && !kebab[i].getnama().equals("")) {
                                        System.out.println(kebab[i].ToString());
                                    }
                                }
                                System.out.println("");
                                System.out.println("MENU BURGER");
                                for (int i = 0; i < burger.length; i++) {
                                    if (burger[i] != null && !burger[i].getnama().equals("")) {
                                        System.out.println(burger[i].ToString());
                                    }
                                }
                                System.out.println("");
                                System.out.println("MENU LAIN");
                                for (int i = 0; i < makanan.length; i++) {
                                    if (makanan[i] != null && !makanan[i].getnama().equals("")) {
                                        System.out.println(makanan[i].ToString());
                                    }
                                }
                                System.out.println(pembatas);
                                System.out.println("");
                                break;
                            case 5:
                                System.out.println("");
                                break;
                        }
                    } while (pilih2 != 5);

                case 2:
                    beli.listpelanggan(pl);
                    do {
                        System.out.println(pembatas);
                        System.out.println("1. Tambah Keranjang");
                        System.out.println("2. Hapus Keranjang");
                        System.out.println("3. Bayar Keranjang");
                        System.out.println("4. Lihat Keranjang");
                        System.out.println("5. Kembali");
                        System.out.print("Pilih = ");
                        System.out.println("");
                        System.out.println(pembatas);
                        pilih3 = s.nextInt();
                        switch (pilih3) {
                            case 1:
                                do {
                                    System.out.println(pembatas);
                                    System.out.println("Tambah Keranjang");
                                    System.out.println("Anda ingin membeli apa?");
                                    System.out.println("1. Kebab");
                                    System.out.println("2. Burger");
                                    System.out.println("3. Menu lain");
                                    System.out.println("4. Kembali");
                                    System.out.print("Pilih = ");
                                    pilih4 = s.nextInt();
                                    switch (pilih4) {
                                        case 1:
                                            System.out.println("MENU KEBAB");
                                            for (int i = 0; i < kebab.length; i++) {
                                                if (kebab[i] != null && !kebab[i].getnama().equals("")) {
                                                    System.out.println(kebab[i].ToString());
                                                }
                                            }
                                            System.out.print("Nama Menu = ");
                                            String mk = s.next();
                                            for (int i = 0; i < kebab.length; i++) {
                                                if (mk.equalsIgnoreCase(kebab[i].getnama())) {
                                                    beli.tambahkeranjang(kebab[i]);
                                                    break;
                                                }
                                            }
                                            break;
                                        case 2:
                                            System.out.println("MENU BURGER");
                                            for (int i = 0; i < burger.length; i++) {
                                                if (burger[i] != null && !burger[i].getnama().equals("")) {
                                                    System.out.println(burger[i].ToString());
                                                }
                                            }
                                            System.out.print("Nama Menu = ");
                                            String mb = s.next();
                                            for (int i = 0; i < burger.length; i++) {
                                                if (mb.equalsIgnoreCase(burger[i].getnama())) {
                                                    beli.tambahkeranjang(burger[i]);
                                                    break;
                                                }
                                            }
                                            break;
                                        case 3:
                                            System.out.println("MENU LAIN");
                                            for (int i = 0; i < makanan.length; i++) {
                                                if (makanan[i] != null && !makanan[i].getnama().equals("")) {
                                                    System.out.println(makanan[i].ToString());
                                                }
                                            }
                                            System.out.print("Nama Menu = ");
                                            String mm = s.next();
                                            for (int i = 0; i < makanan.length; i++) {
                                                if (mm.equalsIgnoreCase(makanan[i].getnama())) {
                                                    beli.tambahkeranjang(makanan[i]);
                                                    break;
                                                }
                                            }
                                            break;

                                    }
                                } while (pilih4 != 4);
                                break;
                            case 2:
                                System.out.println(pembatas);
                                System.out.println("Hapus Keranjang");
                                beli.hapuskeranjang();
                                System.out.println(pembatas);
                                break;
                            case 3:
                                System.out.println(pembatas);
                                System.out.println("Bayar Keranjang");
                                beli.checkout(daftarPelanggan);
                                System.out.println(pembatas);
                                break;
                            case 4:
                                System.out.println(pembatas);
                                System.out.println("Lihat Keranjang");
                                beli.lihatkeranjang();
                                System.out.println(pembatas);

                                break;
                            case 5:
                                System.out.println(pembatas);
                                System.out.println("Kembali ke menu utama");
                                System.out.println(pembatas);
                                break;
                        }
                    } while (pilih3 != 5);
                    break;

                case 3:
                    System.out.println(pembatas);
                    System.out.println("=====Pendaftaran Pelanggan Tetap=====");
                    System.out.print("Nama = ");
                    String np = s.next();
                    pl.setNamap(np);
                    System.out.print("Nomor Telepon = ");
                    String nt = s.next();
                    pl.setTelp(nt);
                    System.out.println("");
                    System.out.println("Selamat datang " + np + " sebagai pelanggan tetap");
                    System.out.println(pembatas);
                    break;
            }
        } while (pilih != 4);
        System.out.println("Terimakasih");
    }
}