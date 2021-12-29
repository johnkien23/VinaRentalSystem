import java.util.HashSet;
import java.util.List;

public class Customer implements SimpleKey{
    public String getKey() {
        return null;
    }
private String customer_name;
private String customer_phone;
private String customer_driverlicense;
private HashSet<Rental> rentals;
public String toString(){
    HashSet<String> rental_numbers = new HashSet<String>();
    for(Rental r: rentals){
        rental_numbers.add(r.getRental_number());
    }
    String desc = "Customer(name:"+customer_name+
                   "\nphone:"+customer_phone+
                   "\ndriverlicense:"+customer_driverlicense+
                   "\nrentalnum:"+rental_numbers+")";
    return desc;
}
public String getCustomer_name(){
    return customer_name;
}
public String getCustomer_phone(){
    return customer_phone;
}
public List<Customer> getRentals() {
    return null;
}
public String getCustomer_driverlicense(){
    return customer_driverlicense;
}
public Customer(String name, String phone, String dl ){  
    this.customer_name = name;
     this.customer_phone = phone;
     this.customer_driverlicense = dl;
     this.rentals = new HashSet<Rental>();
}
public void addRental(Rental rental) throws Exception {
    rentals.add(rental);
}
}
