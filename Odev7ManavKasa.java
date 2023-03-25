package Java101odevler;
import java.util.Scanner;
public class Odev7ManavKasa {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double armut,elma,dom,muz,pat,toplam;
        System.out.println("Kaç kg Armut:");
        armut=input.nextDouble();
        System.out.println("Kaç kg Elma:");
        elma=input.nextDouble();
        System.out.println("Kaç kg Domates:");
        dom=input.nextDouble();
        System.out.println("Kaç kg Muz:");
        muz=input.nextDouble();
        System.out.println("Kaç kg Patlıcan:");
        pat=input.nextDouble();
        toplam=(armut*2.14)+(elma*3.67)+(dom*1.11)+(muz*1.11)+(pat*5);
        System.out.println("Toplam tutar:"+toplam);
    }
}