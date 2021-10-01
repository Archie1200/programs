package javaprograms2;

import java.util.Scanner;

public class Rectangle{
    int length;
    int breadth;
    public int Area(){
        var a=length*breadth;
        return a;
    }
}
class out{
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        Scanner scan = new Scanner(System.in);
        rec.length=scan.nextInt();
        rec.breadth=scan.nextInt();
        int result=rec.Area();
        System.out.println(result);
    }
}
