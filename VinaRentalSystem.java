import java.util.ArrayList;
import java.util.List;
public class VinaRentalSystem{
    List<Customer> customerList;
    List<Rental> rentalList;
    List<Car> carList;

    public VinaRentalSystem(){
        customerList = new ArrayList<Customer>();
        rentalList = new ArrayList<Rental>();
    }
    public String toString(){
        String desc="System[customerList:"+customerList+
          "\nrentalList:"+rentalList+"]";
        return desc;       
    }
    public void addCustomer(String name, String phone, String dl) throws Exception{
        Customer customer=(Customer) Helper.search(customerList,name);
        boolean pre = (customer == null);
        if(!pre){
            String mess =" The customer is already in the system";
            System.out.println(mess);
            throw new Exception(mess);
        }
        
        customer = new Customer(name, phone,dl);
        customerList.add(customer);
    }
    public void addRental(String number, String status, String group,Customer cus,Car c ) throws Exception{
        Rental rental =(Rental) Helper.search(rentalList,number);
        rental = new Rental(number,status,group,cus,c);
        rentalList.add(rental);
    }
   public void addCar(String number, String model, String status, String name ) throws Exception{
        Car car =(Car) Helper.search(carList,number);
        car = new Car(number,model,status,name);
        carList.add(car);
    }
public void addBranch(String address, int id) throws Exception{
        Branch branch=(Branch) Helper.search(branchList,id);
        boolean preb = (branch == null);
        if(!preb){
            String mess =" The branch is already in the system";
            System.out.println(mess);
            throw new Exception(mess);
        }
        
        branch = new Branch(address, id);
        branchList.add(branch);
    }
public void addModel(String name, String type, int number, int numdoor, int consumption) throws Exception{
        Model model=(Customer) Helper.search(modelList,number);
        boolean prem = (model == null);
        if(!prem){
            String mess =" The model is already in the system";
            System.out.println(mess);
            throw new Exception(mess);
        }
        
        model = new Model(name,type, number, numdoor, consumption);
        modelList.add(model);
    }
