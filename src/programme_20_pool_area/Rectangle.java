package programme_20_pool_area;

public class Rectangle {
    double length;
    double width;

    public Rectangle(double length,double width){
        this.length=length;
        this.width=width;
        if(this.width<0){
            this.width=0;
        }
        if(this.width<0){
            this.width=0;
        }

    }
    public double getWidth(){
        return this.width;
    }

    public double getLength() {
        return length;
    }
    public double getArea(){
        return (getWidth()*getLength());
    }
}
