package pkginterface;

public class Interface {

    public static void main(String[] args) {

        SignUpManager signUp = new SignUpManager(new SexUserCheckService());
        signUp.signUp(new User(1, "Alperen Yıldız", "male", 21));

    }

}
