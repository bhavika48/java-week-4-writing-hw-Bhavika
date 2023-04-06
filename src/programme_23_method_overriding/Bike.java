package programme_23_method_overriding;

public class Bike extends Vehicle{
    //defining same methos as in the parent class
    public void run(){
        System.out.println("bike is running");
    }

    public static void main(String[] args) {
        Bike obj= new Bike();
        obj.run();
    }
}
