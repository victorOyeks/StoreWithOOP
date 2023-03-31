import java.util.ArrayList;
import java.util.List;

class Manager extends Staff {
   private String name;
   private String designation;

    public Manager(String name, String position) {
        super(name, position);
    }


//    public Manager(String name, String designation) {
//        this.name = name;
//        this.designation = designation;
        

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void hire (Applicant applicant) {
        if (applicant.getAge() >= 25) {
            //applicant.setHired(true);
            System.out.println("Congratulations " + applicant.getName()+ ", you have been hired.");
        } else {
            System.out.println("Thank you " + applicant.getName() + ", but you cannot work with us.");
        }
    }

    public void fire(Cashier cashier) {
      if(cashier.getStrikeCount()==2) {
          cashier.setFired(true);
          System.out.println(cashier.getName() + " has been fired.");
      } else {
          System.out.println(cashier.getName() + " cannot be fired.");
      }
    }
}


