
package inheritance;


public class Main {

   
    public static void main(String[] args) {
        
        Calisan c=new Calisan("Alperen",12000,"IT");
        Yonetici y=new Yonetici("John",15000, "Software Developer",30);
        
        c.bilgileriGoster(); //Super Class'ın bilgileriGoster Methodu çağrıldı
        
        y.bilgileriGoster(); //Super Class'ın bilgileriGoster Methodu override edildi ve subClasstaki method çalıştı
        
        
    }
    
}
