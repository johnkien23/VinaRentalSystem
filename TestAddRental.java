public class TestAddRental {
    public static void main(String[] args) throws Exception  {
        test(); 
    }
    public static void test() throws Exception{
        System.out.println("\n << Test Add Rental >>");
        VinaRentalSystem vrs= new VinaRentalSystem();
        vrs.addCustomer("Quan", "123456789","HCMxxx123");
        vrs.addCustomer("Kien", "987654321", "BDxxx456");
        System.out.println("\n"+vrs);
        vrs.addCar("1x2x3", "sport", "RENT-REDY", "Lamborghini");
        vrs.addCar("4x5x6", "pickup", "RENT-REDY", "Toyota");
        System.out.println("\n"+vrs);
        vrs.addRental("b1", "RENT-REDY", "group1", "Quan", "1x2x3");
        vrs.addRental("b2", "RENT-REDY", "group1", "Kien", "4x5x6");
    }
}
