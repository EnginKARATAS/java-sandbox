import java.util.*;
import java.util.stream.*;

public class Main {

    static class Order {

        Long id;
        Long customerId;
        double amount;
        String status;

        public Order(Long id, Long customerId, double amount, String status) {
            this.id = id;
            this.customerId = customerId;
            this.amount = amount;
            this.status = status;
        }
    }


    /**TODO: Implement the logic here
     *Requirements:
     * 1. Filter only orders with status "PAID"
     * 2. Group orders by customerId
     * 3. Calculate total amount per customer
     * 
     * Expected reult:
     * Map<customerId, totalPaidAmount>
     **/


    public static void main(String[] args) {

        List<Order> orders = new ArrayList<>();

        orders.add(new Order(1L, 101L, 100, "PAID"));
        orders.add(new Order(2L, 101L, 50, "CREATED"));
        orders.add(new Order(3L, 102L, 200, "PAID"));
        orders.add(new Order(4L, 101L, 70, "PAID"));

        System.out.println(orders.stream()
        .filter(i->i.status == "PAID")
        .mapToDouble(i -> i.amount)
        .collect(Collectors.groupingBy(i->i.status))

        
    
    );
        /**TODO: Call the method here and print result
         *
         *Print the result in the following format:
         *Customer 101 -> 170
         *Customer 102 -> 200
         * 
        **/
    }
}