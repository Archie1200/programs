package javaprograms2;

public class Box {
    double w;
    double h;
    double bd;
    Box(double a,double b,double c){
        w=a;
        h=b;
        bd=c;
    }
    public double DisplayMain(){
        return w*h*bd;
    }
}
class Volume{
    public static void main(String[] args) {
        double a,b,c;
        a=Double.parseDouble(args[0]);
        b=Double.parseDouble(args[1]);
        c=Double.parseDouble(args[2]);
        Box obj = new Box(a,b,c);
        System.out.println(obj.DisplayMain());
    }
}


