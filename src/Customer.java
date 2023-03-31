public class Customer {

    private String name;
    private int wallet;

    public Customer(String name, int wallet) {
        this.name = name;
        this.wallet = wallet;
    }

    public void addMoney (int amount) {
        wallet += amount;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

    public void buyProduct (Products product) {
        if (wallet - product.getPrice() < 0 ) {
            System.out.println("Sorry, you don't have enough cash in your wallet.");
        } else {
            System.out.println("Thank you for shopping with us. Do have a nice day.");
        }
    }
}