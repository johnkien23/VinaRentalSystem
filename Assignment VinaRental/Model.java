import java.util.HashSet;
import java.util.List;

public class Model implements SimpleKey{
    public String getKey() {
        return null;
    }
private String model_name;
private String model_type;
private int model_number;
private int model_numdoor;
private int model_consumption;
private HashSet<Car> car;
public String toString(){
    HashSet<String> car_model = new HashSet<String>();
    for(Car c: car){
        car_model.add(c.getCar_model());
    }
    String desc = "Model(name:"+model_name+
                   "\nnumber:"+model_number+
                   "\ntype:"+model_type+
                   "\nnumdoor"+model_numdoor+
                   "\nconsumption:"+model_consumption+")";
    return desc;
}
public String getModel_name(){
    return model_name;
}
public int getModel_number(){
    return model_number;
}
public String getModel_type(){
    return model_type;
}
public int getModel_numdoor(){
    return model_numdoor;
}
public int getModel_consumption(){
    return model_consumption;
}
public List<Model> getCars() {
    return null;
}

public Model(String name, String type,int number,int numdoor,int consumption){  
    this.model_name = name;
    this.model_type = type;
    this.model_number = number;
    this.model_numdoor = numdoor;
    this.model_consumption = consumption;
}
}
