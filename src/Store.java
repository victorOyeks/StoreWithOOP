import java.util.ArrayList;

public class Store {
    private String name;
    private Manager manager;
   // public ArrayList<Cashier> cashiers = new ArrayList<Cashier>();
    //public ArrayList<Customer> customers = new ArrayList<Customer>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}