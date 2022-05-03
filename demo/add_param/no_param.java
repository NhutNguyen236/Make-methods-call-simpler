package add_param;
import java.util.ArrayList;

public class no_param {
    public static ArrayList<String> customerQueue = new ArrayList<String>();

    /**
     * This method is used to add a customer to the customer queue.
     * @param name A customer name passed by another method
     */
    public static void addCustomer(String name) {
        customerQueue.add(name);
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
