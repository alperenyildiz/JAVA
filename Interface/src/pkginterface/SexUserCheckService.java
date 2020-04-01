package pkginterface;

public class SexUserCheckService implements IUserCheckServices {

    @Override
    public boolean checkUser(User user) {

        if (user.getSex().startsWith("Fe")) {
            return true;
        }
        return false;
    }

}
