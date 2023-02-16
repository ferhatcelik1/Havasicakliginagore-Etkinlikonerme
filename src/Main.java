import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int hava;
        Scanner input = new Scanner(System.in);
        System.out.println(" sıcaklığı giriniz :");

        hava = input.nextInt();

        if (hava < 5) {
            System.out.println("kayak yapabilirsin tabi paran varsa :");

        } else if (hava <= 25) {
            if (hava <= 15) {
                System.out.println("sinemaya gidebilirsin :");

            }
            if (hava >=10 ){
                System.out.println("pikniğe gidebilirsin : ");
            }

        }else {
            System.out.println("yüzmeye gidebilirsin :");
    }
}
    }