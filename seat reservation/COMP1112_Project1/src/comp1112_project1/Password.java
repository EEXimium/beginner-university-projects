package comp1112_project1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author efe_19comp1035
 */
public class Password {

    private String password;

    public Password(String password) {
        if (checkPassword(password) == true) {
            this.password = password;
        } else {
            randomPassword(password);
        }
    }

    public void resetPassword() {
        Scanner scn = new Scanner(System.in);
        System.out.println("New password: ");
        String newPassword = scn.next();

        while (true) { //for döngüsü ile de yapılabilir

            if (checkPassword(newPassword)) {
                this.password = newPassword;
                System.out.println("New password successfully set!");
                break;
            } else {
                System.out.println("You can't use that password. Enter a valid one: ");
                newPassword = scn.next();
                checkPassword(newPassword);
            }

        }

    }//end of resetPassword

    public boolean checkPassword(String password) {

        if (password.charAt(0) == '0') { //ilk basamak 0 olamaz
            return false;
        }

        if (password.length() != 6) { // 6 basamaklı bir sayı dışında başka bir
            return false;
        }

        for (int i = 0; i < password.length() - 1; i++) {
            for (int j = i + 1; j < password.length(); j++) {
                if (password.charAt(i) == password.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }//end of checkPassword

    public String randomPassword(String password) {
        int randomPassword = 0;

        while (true) {
            if (checkPassword(password) == false) {
                randomPassword = (int) (Math.random() * (1000000));
                password = String.valueOf(randomPassword);
                this.password = password;
            } else {
                return password;
            }
        }
    }//end of randomPassword

    public String displayPas() {
        return password;
    }

}//end of Password class
