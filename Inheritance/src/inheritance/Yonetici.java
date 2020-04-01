package inheritance;

public class Yonetici extends Calisan {

    private int sorumluKisiSayisi;

    public Yonetici(String isim, int maas, String departman, int sorumluKisiSayisi) {

        super(isim, maas, departman); //Kalıtım alınan sınıfın yapılandırıcısına isim,maaş ve departman bilgileri gönderildi...
        this.sorumluKisiSayisi = sorumluKisiSayisi;
    }

    public int getSorumluKisiSayisi() {
        return sorumluKisiSayisi;
    }

    public void setSorumluKisiSayisi(int sorumluKisiSayisi) {
        this.sorumluKisiSayisi = sorumluKisiSayisi;
    }

    public void zamYap(int tutar) {
        System.out.println(getIsim() + " yöneticisi "
                + tutar + " tutarında zam yaptı!");
    }

    @Override  // Method override ediliyor...
    public void bilgileriGoster() {
        super.bilgileriGoster();  //SuperClass'da bulunan bilgileriGoster Methodu çağırıldı...
        System.out.println(" Sorumlu Kişi Sayısı: " + sorumluKisiSayisi);
    }

    @Override
    public void Calis() {
        System.out.println("YÖNETİCİ çalışıyor!!!");
    }

}
