public class SmartphoneAdapter implements PowerOutlet{
    public SmartphoneCharger spc = new SmartphoneCharger();

    @Override
    public void plugIn() {
        spc.chargePhone();
    }

    
}