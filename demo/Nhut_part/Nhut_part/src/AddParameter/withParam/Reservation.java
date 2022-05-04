/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AddParameter.withParam;
import java.util.ArrayList;

/**
 *
 * @author STUDENT TDTU
 */
public class Reservation {

    public static ArrayList<String> customerQueue = new ArrayList<String>();

    /**
     * Now the method got that isPriority so we
     *
     * @param name A customer name passed by another method
     * @param isPriority A boolean value to determine if the customer is a
     * priority customer
     */
    public static void addCustomer(String name, boolean isPriority) {
        if (isPriority) {
            customerQueue.add(0, name);
        } else {
            customerQueue.add(name);
        }
    }

    /**
     * This method is used to add reservation. I renamed that getTelephoneNumber
     * to this one then I copied body to it so it will point to specific phone
     * number
     *
     * @author NhutNguyen236
     * @param customerName
     * @param Priority
     */
    public static void addReservation(String customerName, boolean Priority) {
        addCustomer(customerName, Priority);
    }

    public static void main(String[] args) {
        addReservation("Nhut", true);
        addReservation("Vi", false);
        addReservation("Peter", false);
        System.out.println(customerQueue);
    }
}
