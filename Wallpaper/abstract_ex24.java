abstract class Triangle{
    abstract void type_of_triangle();
}

class Equilateral_Triangle extends Triangle {
    @Override
    void type_of_triangle(){
        System.out.println("3 sides are equal.");
    }   
}

class Isosceles_Triangle extends Triangle{
    @Override
    void type_of_triangle(){
        System.out.println("2 sides are equal.");
    }
}

class Scalene_Triangle extends Triangle{
    @Override
    void type_of_triangle(){
        System.out.println("3 sides are different.");
    }
}

public class abstract_ex24 {
    public static void main(String args[]){
        Equilateral_Triangle eq = new Equilateral_Triangle();
        Triangle is = new Isosceles_Triangle();
        Triangle sc = new Scalene_Triangle();

        eq.type_of_triangle();
        is.type_of_triangle();
        sc.type_of_triangle();
    }
}
