import java.util.Scanner;

public class manav {
    public static void main(String[] args) {
        double armut , elma , domates , muz , patlican , tutar;

        Scanner kilo = new Scanner(System.in);

        System.out.print("Kaç Kilo Armut Aldın : ");

        armut = kilo.nextDouble();

        System.out.print("Kaç kilo elma Aldın : ");

        elma = kilo.nextDouble();

        System.out.print("Kaç kilo Domates Aldın : ");

        domates = kilo.nextDouble();

        System.out.print("Kaç Kilo Muz Aldın : ");

        muz = kilo.nextDouble();

        System.out.print("Kaç Kilo Patlıcan Aldın : ");

        patlican = kilo.nextDouble();

        tutar = (armut * 2.14) + (elma * 3.67) + (domates * 1.11) + (muz * 0.95) + (patlican * 5);

        System.out.print("Aldıklarınızın Toplam Tutarı : "+tutar);

        
    }
    
}
