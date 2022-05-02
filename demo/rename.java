public class rename {
    public static String officeAreaCode = "123";
    public static String officephoneNumber = "456";

    /**
     * There comes a method without params but it now has a better name though
     * I renamed that getTelephoneNumber to this one then I copied body to it so it will point to specific phone number
     * @author NhutNguyen236
     * @param unused
     * @return String this will return a pre-defined phone number info
     */
    public static String getOfficeTelephoneNumber() {
        return "(" + officeAreaCode + "-" + officephoneNumber + ")";
    }

    /**
     * After renaming the method, I can call it by this name
     * @return getOfficeTelephoneNumber value 
     */
    public static String getTelephoneNumber() {
        return getOfficeTelephoneNumber();
    }
    
    public static void main(String[] args) {
        System.out.println(getTelephoneNumber());
    }
}
