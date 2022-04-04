package com.uts.prakrplbo;

import com.sun.tools.javac.util.List;

public class Keranjang {
    private List<Buah> daftarBuah;

    public void tambahProduk(Buah buah){
       daftarBuah.add(buah);
    }
    public void hapusProduk(Buah buah){
        daftarBuah.remove(buah);
    }
    public List<Buah> getKeranjang(){
        return daftarBuah;
    }
}
