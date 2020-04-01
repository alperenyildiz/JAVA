/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

/**
 *
 * @author User
 */
public class AgeUserCheckService implements IUserCheckServices {

    @Override
    public boolean checkUser(User user) {
        if (user.getAge() >= 18) {
            return true;
        }
        return false;
    }

}
