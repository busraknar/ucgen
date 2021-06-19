import java.util.Scanner;

public class Ucgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Üçgenin birinci kenar uzunluğu giriniz:");
        double kenar1= input.nextInt();
        System.out.println("Üçgenin ikinci kenar uzunluğu giriniz:");
        double kenar2= input.nextInt();
        System.out.println("Üçgenin üçüncü kenar uzunluğu giriniz:");
        double kenar3= input.nextInt();
        double cevre=kenar1 + kenar2 + kenar3;
        double u= cevre/2;
        double alanHesap =(u * (u-kenar1)*(u-kenar2)*(u-kenar3));
        System.out.println("Alanı =" + Math.sqrt(alanHesap));


    }
}
