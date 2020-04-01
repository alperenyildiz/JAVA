package polymorphism;

class Hayvan {

    private String isim;
    private int yas;

    public Hayvan(String isim, int yas) {
        this.isim = isim;
        this.yas = yas;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public void BilgileriGetir() {
        System.out.println("İsim: " + this.getIsim() + "\nYas:" + this.getYas());
    }

    public String Konus() {

        return "Hayvan Konuşuyor...";
    }

    public void YemekYe() {

        System.out.println("Hayvan yemek yiyor...");
    }
}

class Kopek extends Hayvan {

    public Kopek(String isim, int yas) {
        super(isim, yas);
    }

    @Override
    public void YemekYe() {

        System.out.println(getIsim() + " isimli köpek yemek yiyor...");
    }

    @Override
    public String Konus() {
        return getIsim() + " isimli köpek Havlıyor...";
    }

}

class At extends Hayvan {

    public At(String isim, int yas) {
        super(isim, yas);
    }

    @Override
    public void YemekYe() {

        System.out.println(getIsim() + " isimli At yemek yiyor...");
    }

    @Override
    public String Konus() {
        return getIsim() + " isimli At Kişniyor...";
    }

}

public class Test {

    public static void Konustur(Object o) {
        if (o instanceof Kopek) {
            Kopek kopek = (Kopek) o;  //Downcasting
            System.out.println(kopek.Konus());
        } else if (o instanceof At) {
            At at = (At) o;
            System.out.println(at.Konus());
        }
    }

    public static void main(String[] args) {

        Hayvan hayvan1 = new Hayvan("Tarçın", 5);
        Kopek hayvan2 = new Kopek("Şila", 2);
        At hayvan3 = new At("Bold Pilot", 3);

        /* 
        Hayvan hayvan1=new Hayvan("Tarçın",5);
        Hayvan hayvan2=new Kopek("Şila",2);
        Hayvan hayvan3=new At("Bold Pilot",3);
         */
        System.out.println(hayvan1.Konus());
        System.out.println(hayvan2.Konus());
        System.out.println(hayvan3.Konus());
        System.out.println("");
        hayvan1.YemekYe();
        hayvan2.YemekYe();
        hayvan3.YemekYe();

        System.out.println("*********Konustur() Methodu ile;**************");

        Konustur(new Kopek("Karabaş", 2));
        Konustur(new At("Şimşek", 3));

    }

}
