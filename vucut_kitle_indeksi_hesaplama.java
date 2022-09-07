import java.util.Scanner;

public class vucut_kitle_indeksi_hesaplama {
    public static void main(String[] args) {
        double kilo, boy, index;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = input.nextDouble();

        System.out.print("Lütfen kilonuzu (kilogram cinsinden) giriniz : ");
        kilo = input.nextDouble();

        index = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz : " + index);
    }
}