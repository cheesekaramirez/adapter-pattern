public class RefrigeratorAdapter implements PowerOutlet{
    public Refrigerator ref = new Refrigerator();

    @Override
    public void plugIn() {
        ref.startCooling();
    }
    
    
}