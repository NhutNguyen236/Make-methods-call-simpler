public class no_rename {
    public static String officeAreaCode = "123";
    public static String officephoneNumber = "456";

    /**
     * There comes a method that without params and a nonsense method name 
     * @author NhutNguyen236
     * @param unused
     * @return String this will return a pre-defined phone number info
     */
    public static String getTelephoneNumber() {
        return "(" + officeAreaCode + "-" + officephoneNumber + ")";
    } 
    public static void main(String[] args) {
        System.out.println(getTelephoneNumber());
    }
}
