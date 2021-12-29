public class Car implements SimpleKey 
{
    private String car_model;
    private int car_number;
    private String car_status;
    private String car_name;
    public String toString(){
        String desc = "Car[model:"+car_model+
                      "\nnumber"+car_number+
                      "\nstatus:"+car_status+
                      "\nname:"+car_name+"]";
                      return desc;
    }
    public int getCar_number() {
        return car_number;
    }
    public String getCar_model() {
        return car_model;
    }
    public String getCar_status() {
        return car_status;
    }
    public String getCar_name() {
        return car_name;
    }
    public Car(int number, String model, String status, String name ){  
        this.car_number = number;
         this.car_model = model;
         this.car_status = status;
         this.car_name = name;
    }
    @Override
    public String getKey() {
        return null;
    }
}