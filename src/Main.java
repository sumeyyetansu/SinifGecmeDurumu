import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat,fizik,türkce,kimya,muzik ;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz : ");
        mat = scanner.nextInt();

        System.out.println("Fizik notunuzu giriniz : ");
        fizik = scanner.nextInt();

        System.out.println("Türkçe notunuzu giriniz : ");
        türkce = scanner.nextInt();

        System.out.println("Kimya notunuzu giriniz : ");
        kimya = scanner.nextInt() ;

        System.out.println("Müzik notunuzu giriniz : ");
        muzik = scanner.nextInt();


        if ( !(0<mat && mat<100)){
            mat = 0;
        }
        if ( !(0<fizik && fizik<100)){
            fizik = 0;
        }
        if ( !(0<türkce && türkce<100)){
            türkce = 0;
        }
        if ( !(0<kimya && kimya<100)){
            kimya = 0;
        }
        if (!(0<muzik && muzik<100)){
            muzik = 0;
        }
        double ortalama = (mat + fizik + türkce + kimya + muzik ) / 5;

        if (ortalama >=55){
            System.out.println("Sınıfı geçtiniz. Tebrik ederiz.");

        }else {
            System.out.println("Sınıfı geçemediniz.");
            
        }
        System.out.println("Ortalamanız : " +ortalama);


    }
}