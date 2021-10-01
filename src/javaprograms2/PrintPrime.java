package javaprograms2;

import java.util.Scanner;
import java.lang.Math;
public class PrintPrime {
    private int a;
    private int b;
    public void setA(int a) {
        this.a = a;
    }
    public void setB(int b) {
        this.b = b;
    }

    public void DisplayValue(){
        int c;
        for(int i=a;i<=b;i+=1){
            c=0;
            if(i==2){
                System.out.println(i);
            }
            for(int j=2;j<=Math.sqrt(i);j+=1){
                if(i%j==0){
                    c=0;
                    break;
                }
                else{
                    c=1;
                }
            }
            if(c==1){
                System.out.println(i);
            }
        }
    }
}
class printing{
    public static void main(String[] args) {
        PrintPrime obj = new PrintPrime();
        Scanner scan = new Scanner(System.in);
        obj.setA(scan.nextInt());
        obj.setB(scan.nextInt());
        obj.DisplayValue();
    }
}

