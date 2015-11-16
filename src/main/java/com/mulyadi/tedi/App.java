package com.mulyadi.tedi;

import com.mulyadi.tedi.belajar.jdbc.KoneksiDatabase;
import com.mulyadi.tedi.belajar.jdbc.Kontak;
import com.mulyadi.tedi.belajar.jdbc.KontakDao;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost/belajar_jdbc";
        String username = "root";
        String password = "admin";

        KoneksiDatabase koneksi = new KoneksiDatabase(driver, url, username, password);

        Kontak k = new Kontak();
        k.setNama("Tedi Mu");
        k.setEmail("ted@mail");
        k.setNoHp("09877666");

        KontakDao kd = new KontakDao(koneksi);
        kd.simpan(k);
    }
}
