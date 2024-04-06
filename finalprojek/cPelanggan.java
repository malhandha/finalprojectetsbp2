package finalprojek;

public class cPelanggan {
private String namap, telp;
cPelanggan(){
    namap="";
    telp="";
}
cPelanggan(String namap, String telp){
    this.namap = namap; this.telp=telp;
}
public void setNamap(String namap){
    this.namap=namap;
}
public void setTelp(String telp){
    this.telp=telp;
}
public String getNamap(){
    return namap;
}
public String ToString(){
    return namap+ " [ "+telp+" ] ";
}

}
