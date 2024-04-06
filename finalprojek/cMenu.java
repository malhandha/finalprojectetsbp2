package finalprojek;

public class cMenu {
public String nama;
public int harga, stok;
cMenu(String nama, int harga, int stok){
    this.nama = nama;
    this.harga = harga;
    this.stok = stok;
}
public void setnama(String nama){
    this.nama=nama;
}
public void setharga(int harga){
    this.harga=harga;
}
public void setstok(int stok){
    this.stok=stok;
}
public String getnama() {
    return this.nama;
}
public int getstok(){
    return this.stok;
}
public int getharga() {
    return this.harga;
}
public String ToString() {
    return this.nama + " | harga: " + this.harga + " | stok: " + this.stok;
}
}
