class arithmatic{
    int add(int x,int y){
        return (x+y);
    }
    int sub(int x,int y){
        if(x>y){
            return (x-y);
        }else{return (y-x);
        }   
    }
    int mul(int x,int y){
        return (x*y);
    }
    double div(int x,int y){
        if(x>y){
            return (x/y);
        }else{return (y/x);
        } 
    }
}

public class math_func_ex8 {
    public static void main(String args[]){
        arithmatic obj = new arithmatic();
        System.out.println("Addition:" + obj.add(5, 6));
        System.out.println("Subtraction:" + obj.sub(5, 6));
        System.out.println("Mutiplation:" + obj.mul(5, 6));
        System.out.println("Divison:" + obj.div(5, 6));
    }
}
