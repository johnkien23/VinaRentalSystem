public class TestAddCustomer{
    public static void main(String[] args) throws Exception {
        test1(); //valid variable
        test2(); //invalid variable
    }
    public static void test1() throws Exception{
        System.out.println("\n Add Customer: valid case");
        VinaRentalSystem vrs= new VinaRentalSystem();
        System.out.println(vrs);
        vrs.addCustomer("Quan", "123456789","HCMxxx123");
        System.out.println("\n"+vrs);
        vrs.addCustomer("Kien", "987654321", "BDxxx456");
        System.out.println("\n"+vrs);
    }
    public static void test2() throws Exception{
        System.out.println("\n Add Customer: invalid case ");
        System.out.println("Driver License is invalid or in the blaclist");
        VinaRentalSystem vrs= new VinaRentalSystem();
        vrs.addCustomer("Quan", "123456789", "HCMxxx123");
        System.out.println("\n"+vrs);
        try{
            vrs.addCustomer("Kien", "987654321", "BDxxx456");
        }
        catch(Exception e){
            System.out.println("\n"+e.getMessage());
        }
        finally{
            System.out.println("\n"+vrs);
        }
}
}