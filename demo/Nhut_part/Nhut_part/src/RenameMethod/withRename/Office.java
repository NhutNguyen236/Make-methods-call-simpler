/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RenameMethod.withRename;

/**
 *
 * @author STUDENT TDTU
 */
public class Office {

    public static String officeAreaCode = "123";
    public static String officephoneNumber = "456";

    /**
     * There comes a method without params but it now has a better name though I
     * renamed that getTelephoneNumber to getOfficeTelephoneNumber one then I copied all the body to it so
     * it will point to specific phone number - office phone number
     *
     * @author NhutNguyen236
     * @param unused
     * @return String this will return a pre-defined phone number info
     */
    public static String getOfficeTelephoneNumber() {
        return "(" + officeAreaCode + "-" + officephoneNumber + ")";
    }

    /**
     * After renaming the method, I can call it by this name
     *
     * @return getOfficeTelephoneNumber value
     */
    public static String getTelephoneNumber() {
        return getOfficeTelephoneNumber();
    }

    public static void main(String[] args) {
        System.out.println(getTelephoneNumber());
    }
}
