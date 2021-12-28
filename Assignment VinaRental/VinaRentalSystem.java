import java.util.ArrayList;
import java.util.List;
public class VinaRentalSystem{
    List<Customer> customerList;
    List<Rental> rentalList;

    public VinaRentalSystem(){
        customerList = new ArrayList<Customer>();
        rentalList = new ArrayList<Rental>();
    }
    public String toString(){
        String desc="System[customerList:"+customerList+
          "\nrentalList:"+rentalList+"]";
        return desc;       
    }
    public void addCustomer(String name, String phone, boolean dl) throws Exception{
        Customer customer=(Customer) Helper.search(customerList,dl);
        boolean pre = (customer == null);
        if(!pre){
            String mess =" The customer is already in the system";
            System.out.println(mess);
            throw new Exception(mess);
        }
        
        customer = new Customer(name, phone,dl);
        customerList.add(customer);
    }
    public void addRental(String number, String status, String group ) throws Exception{
        Rental rental =(Rental) Helper.search(rentalList,number);
        rental = new Rental(number,status,group);
        rentalList.add(rental);
    }
}
