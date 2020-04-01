package pkginterface;

public class SignUpManager {

    private IUserCheckServices iUserCheckService;

    public SignUpManager(IUserCheckServices iUserCheckService) {
        this.iUserCheckService = iUserCheckService;
    }

    void signUp(User user) {

        if (iUserCheckService.checkUser(user)) {
            System.out.println("Kayıt Başarılı:" + user.getName());
        } else {
            System.out.println("Kayıt Yapılamadı.\n SEBEP:" + iUserCheckService.getClass().getName());
        }
    }

    public IUserCheckServices getiUserCheckService() {
        return iUserCheckService;
    }

    public void setiUserCheckService(IUserCheckServices iUserCheckService) {
        this.iUserCheckService = iUserCheckService;
    }

}
