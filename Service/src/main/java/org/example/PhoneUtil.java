package org.example;

public class PhoneUtil {

    public static String getFullNumber(Phone phone) {
        return phone.getPrefix() + phone.getNumber();
    }

    public static String getPhoneWithCode(Phone phone) {
        return phone.getBonusCode() != null
                ? phone.getPrefix() + phone.getNumber() + "#" + phone.getBonusCode()
                : phone.getPrefix() + phone.getNumber() + "" + phone.getBonusCode();
    }
}
