public class Main {
    public static void main(String[] args) {
        LaptopAdapter lptAdapt = new LaptopAdapter();
        RefrigeratorAdapter refAdapt = new RefrigeratorAdapter();
        SmartphoneAdapter spAdapt = new SmartphoneAdapter();

        System.out.println("---Power Outlet---");
        lptAdapt.plugIn();
        refAdapt.plugIn();
        spAdapt.plugIn();
    }
}
