package programme_26_encapsulation;

public class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulate obj= new Encapsulate();
        //setting the variable
        obj.setName("Amit");
        obj.setAge(19);
        obj.setRollNo(51);
        // displaying variable of the variable
        System.out.println("Prime's name :"+obj.getName());
        System.out.println("Prime's age :"+obj.getAge());
        System.out.println("Prime's rollNo: " + obj.getRollNo(222));
        // Direct access of rollNo is not possible due to     encapsulation
        // System.out.println("Prime's rollNo : " +     obj.geekName);

    }
}
