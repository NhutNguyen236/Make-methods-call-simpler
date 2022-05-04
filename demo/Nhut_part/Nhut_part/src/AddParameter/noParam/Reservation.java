/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AddParameter.noParam;
import java.util.ArrayList;

/**
 *
 * @author STUDENT TDTU
 */
public class Reservation {
    public static ArrayList<String> customerQueue = new ArrayList<>();

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
