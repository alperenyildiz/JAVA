package inheritance;

public class Calisan {

    private String isim;
    private int maas;
    private String departman;

    public Calisan(String isim, int maas, String departman) {
        this.isim = isim;
        this.maas = maas;
        this.departman = departman;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public void Calis() {
        System.out.println("Çalışan çalışıyor...");
    }

    public void bilgileriGoster() {

        System.out.println("İsim: " + isim + "\nMaaş:" + maas + "\nDepartman:" + departman);
    }

    public void departmanDegistir(String yeniDepartman) {

        this.departman = yeniDepartman;
        System.out.println("Çalışanın departman bilgisi " + yeniDepartman
                + "olarak değiştirildi...");
    }

}
