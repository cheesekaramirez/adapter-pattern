public class LaptopAdapter implements PowerOutlet{
    public Laptop lpt = new Laptop();

    @Override
    public void plugIn() {
       lpt.charge();
    }

    
}