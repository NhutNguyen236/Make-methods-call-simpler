/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RenameMethod.noRename;

/**
 *
 * @author STUDENT TDTU
 */
public class Office {

    public static String officeAreaCode = "123";
    public static String officephoneNumber = "456";

    /**
     * There comes a method that without params and a nonsense method name
     *
     * @author NhutNguyen236
     * @return String this will return a pre-defined phone number info
     */
    public static String getTelephoneNumber() {
        return "(" + officeAreaCode + "-" + officephoneNumber + ")";
    }

    public static void main(String[] args) {
        System.out.println(getTelephoneNumber());
    }
}
