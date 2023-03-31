public class Cashier extends  Staff {

    private Integer strikeCount;
    private boolean fired = false;


    public Cashier(String name,String position, int strikeCount) {
        super(name,position);
        this.strikeCount =strikeCount;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getPosition() {
        return super.getPosition();
    }

    public Integer getStrikeCount() {
        return strikeCount;
    }

    public void setStrikeCount(Integer strikeCount) {
        this.strikeCount = strikeCount;
    }

    public boolean isFired() {
        return fired;
    }

    public void setFired(boolean fired) {
        this.fired = fired;
    }

    public void sellProduct(Customer customer, Products product) {
        if(product.getQuantity()<= 0) {
            System.out.println("There are not enough " + product.getName() + " in the store.");
        } else {
            System.out.println("Cashier: " + getName() + " sold " + product.getName() + " to " + customer.getName());
        }
    }

    public void dispenseReceipt(Customer customer) {
        System.out.println("Cashier: " + getName() + " dispensed receipt to " + customer.getName());
    }
}
