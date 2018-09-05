/**
 */
import java.lang.*;
import java.util.*;
public class Executor extends User{


    /**
     */
    private Vector<Order> functions = new Vector<Order>();
    private Vector<Order> orders = new Vector<Order>();
    public Executor(Vector<Order> order,String x,String y,String z) {
        super(x,y,z);
        functions = order;
    }

    public void getOrder(Order order){
        orders.add(order);
    }

    public Vector<Order> getOrders() {
        return orders;
    }

    public void setOrders(Vector<Order> orders) {
        this.orders = orders;
    }

    public void setFunctions(Vector<Order> functions) {
        this.functions = functions;
    }

    public Vector<Order> getFunctions() {
        return functions;
    }
}