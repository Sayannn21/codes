
class room_demo{
    double height,length,width;
    void get_value(double h,double l,double w){
        height = h;
        length = l;
        width = w;
    }
    double get_volume(){
        return (height*length*width);
    }
}
class classroom_ex7{
    public static void main(String args[]){
        room_demo obj = new room_demo();
        obj.get_value(5, 6, 7);
        System.out.println(obj.get_volume());
    }
}