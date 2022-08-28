import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int number = input.nextInt();
        int basNumber = 0,toplam=0;
        int tempNumber = number;
        int basValue;

        tempNumber = number;
        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            toplam+=basValue;
            System.out.println(basValue);
            tempNumber /= 10;
        }
        System.out.println(toplam);


    }
}
