class Box{
    double length;
    double breadth;
    double height;
    double vol;

    public Box(){
        length = 0;
        breadth = 0;
        height = 0;
        calculate_volume();
    }

    public Box(double side){
        length = side;
        breadth = side;
        height = side;
        calculate_volume();
    }

    public Box(double l,double b,double h){
        length = l;
        breadth = b;
        height = h;
        calculate_volume();
    }

    public void calculate_volume(){
        vol = length*breadth*height;
    }
    public void display1(){
        System.out.println("Volume of the box1:"+vol);
    }
     public void display2(){
        System.out.println("Volume of the box2:"+vol);
    }
     public void display3(){
        System.out.println("Volume of the box3:"+vol);
    }
}

public class main_ex9 {
    public static void main(String args[]){
        Box box1 = new Box();
        Box box2 = new Box(5);
        Box box3 = new Box(6,7,8);

        box1.display1();
        box2.display2();
        box3.display3();
    }
}
