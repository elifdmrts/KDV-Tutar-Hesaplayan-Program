import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar;
        double kdvoranı = 0.18;
        Scanner untıl=new Scanner(System.in);
        System.out.print("Ücret Tutarını Giriniz: ");
        tutar= untıl.nextInt();
        double kdvTutar=tutar*kdvoranı;
        double kdvliTutar=tutar+kdvTutar;


        if(tutar>=0 && tutar<=1000){
           kdvoranı =0.18;

        }
        else if (tutar>1000){
             kdvoranı=0.8;

        }
        System.out.println("KDV'siz tutar: "+tutar+"TL");
        System.out.println("KDV oranı: "+kdvoranı+"TL");
        System.out.println("KDV tutarı: "+kdvTutar+"TL");
        System.out.println("KDV'li tutar: "+kdvliTutar+"TL");

    }
}