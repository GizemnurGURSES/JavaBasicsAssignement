//kader güneş
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Sayı giriniz:");
        int a;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        System.out.println("Girdiğiniz sayı:"+a);
        System.out.println("-------");
        int b,c;

        System.out.println("Birinci sayıyı giriniz:");
        Scanner sayi1=new Scanner(System.in);
        b=sayi1.nextInt();
        System.out.println("İkinci sayıyı giriniz:");
        Scanner sayi2=new Scanner(System.in);
        c=sayi2.nextInt();
        int d= sayi2 + sayi1;
        Scanner sonuc=new Scanner(System.in);
        d=sonuc.nextInt();
        System.out.println("sonuç:"+sonuc);




    }
