public class Branch implements SimpleKey 
{
    private String branch_address;
    private int car_number;
    private String branch_number;
    public String toString(){
        String desc = "Branch[address:"+branch_address+
                      "\nnumber"+car_number+"]";
                      return desc;
    }
    public String getBranch_number() {
        return branch_number;
    }
    public String getBranch_address() {
        return branch_address;
    }
    public Branch(int number, String address){  
        this.car_number = number;
         this.branch_address = address;
  
    }
    @Override
    public String getKey() {
        return null;
    }
}