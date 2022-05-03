package add_param;
import java.util.ArrayList;

public class detailed_param {
    public static ArrayList<String> customerQueue = new ArrayList<String>();

    /**
     * Now the method got that isPriority so we 
     * @param name A customer name passed by another method
     * @param isPriority A boolean value to determine if the customer is a priority customer
     */
    public static void addCustomer(String name, boolean isPriority) {
        if(isPriority) {
            customerQueue.add(0, name);
        } else {
            customerQueue.add(name);
        }
    }

    /**
     * This method is used to add reservation.
     * I renamed that getTelephoneNumber to this one then I copied body to it so it will point to specific phone number
     * @author NhutNguyen236
     * @param customerName
     */
    public static void addReservation(String customerName) {
        addCustomer(customerName);
    }

    public static void main(String[] args) {
        addReservation("Nhut");
        addReservation("Vi");
        System.out.println(customerQueue);
    }
}
