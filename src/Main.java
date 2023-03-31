import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Manager manager = new Manager("Mr Bob", "The Manager");

        Cashier cashier1 = new Cashier("Mr John", "Cashier-1", 2);
        Cashier cashier2 = new Cashier("Mrs Jones",  "Cashier-2", 0);
        Cashier cashier3 = new Cashier("Mr James", "Cashier-3", 0);

        Products product1 = new Products("Ice-cream", 999, 20);
        Products product2 = new Products("Soft drink", 200, 39);
        Products product3 = new Products("Toiletries", 799, 45);

//
        Customer customer1 = new Customer("Mr. Mike", 100);
        Customer customer2 = new Customer("Miss Mary", 9536);
        Customer customer3 = new Customer("Miss Jane", 49);

        customer1.addMoney(1000);
        customer2.addMoney(2000);
        customer3.addMoney(100);

        manager.hire(new Applicant("James", 20));
        manager.hire(new Applicant("Mrs. Tobi", 30));

        manager.fire(cashier1);
        manager.fire(cashier2);

        cashier1.sellProduct(customer1, product3);
        cashier1.dispenseReceipt(customer1);

        customer1.buyProduct(product1);
        customer2.buyProduct(product3);
        customer3.buyProduct(product2);
    }
}

