package programme_24_method_overriding;

public class Test {
    public static void main(String[] args) {
        SBI s = new SBI();
        ICICI i = new ICICI();
        Axis a = new Axis();
        System.out.println("SBI Rate of interest :" + s.getRateOfInterest());
        System.out.println("ICICI rate of interest :" + i.getRateOfInterest());
        System.out.println("Axis rate of interest :" + a.getRateOfInterest());


    }
}
