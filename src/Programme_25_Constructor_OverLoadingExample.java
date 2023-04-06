public class Programme_25_Constructor_OverLoadingExample {
    int id;
    String name;
    int age;
    // creating two args constructor
    Programme_25_Constructor_OverLoadingExample(int i,String n){
        id=i;
        name=n;

    }
    //creating three arg constructor
    Programme_25_Constructor_OverLoadingExample(int i,String n,int a){
        id=i;
        name=n;
        age=a;
    }
    public void display(){
        System.out.println(id+" "+name+" "+age);
    }

    public static void main(String[] args) {
        Programme_25_Constructor_OverLoadingExample s1= new Programme_25_Constructor_OverLoadingExample(111,"Karan");
        Programme_25_Constructor_OverLoadingExample s2= new Programme_25_Constructor_OverLoadingExample(222,"Aryan",25);
        s1.display();
        s2.display();
    }

}
