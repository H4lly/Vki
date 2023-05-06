import java.util.Scanner;

public class Vki {
    public static void main(String[] args) {
        double boy, kilo,vki;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu (kg cinsinden) giriniz: ");
        kilo = input.nextDouble();

        vki = kilo / (boy * boy) ;

        System.out.println("Vücut kile indeksiniz = " + vki);
    }
}