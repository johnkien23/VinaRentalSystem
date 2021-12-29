public class Rental implements SimpleKey 
{
    private String rental_status;
    private String rental_number;
    private String rental_group;
    private Customer cus ;
    private Car c;
    public String toString(){
        String desc = "Rental[number:"+rental_number+
                      "\nstatus:"+rental_status+
                      "\ngroup:"+rental_group+
                      "\n customer:"+cus.getCustomer_name()+"]";
                      return desc;
    }
    public String getRental_number() {
        return rental_number;
    }
    public String getKey() {
        return rental_number;
    }
    public String getRental_status() {
        return rental_status;
    }
    public String getRental_group() {
        return rental_group;
    }
    public Customer cus(){
        return cus;
    }
    public Car c(){
        return c;
    }
    public Rental(String number, String status, String group,Customer customer,Car c) throws Exception{  
        this.rental_number = number;
         this.rental_status = status;
         this.rental_group = group;
         this.cus.addRental(this);
         this.c.addRental(this);
    }
}
