import java.util.Scanner;

public class Etkinlik {
    public static void main(String[] args) {
        Scanner girdi= new Scanner(System.in);
        System.out.println("selam");
        System.out.println("Bugun hava nasıl\nNe yapmak isterisn");
        System.out.println("lütfen hava sıcaklık değerini gir");
        short sicaklik=girdi.nextShort();
        if(sicaklik<=5){
            System.out.println("Bügün kayak yapmak için şartlar müsait");
        } else if(sicaklik>5 && sicaklik<=15){
            System.out.println("Sinemaya bir bak belki güzel bir film elmiştir");
        } else if(sicaklik>15 && sicaklik<=25){
            System.out.println("Hava cok güzel Tam piknik zamanı");
        } else if(sicaklik>25){
            System.out.println("hava cok sıcak git biraz yüz");
        }

    }
}
