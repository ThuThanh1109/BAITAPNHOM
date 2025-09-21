import java.util.Scanner;
public class Tuan4_Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap mot so nguyen: ");
        int n = sc.nextInt();

        boolean nto = true;

        if (n < 2) {
            nto = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    nto = false;
                    break;
                }
            }
        }

        if (nto) {
            System.out.println(n + " la so nguyen to.");
        } else {
            System.out.println(n + " khong phai la so nguyen to.");
        }
    }
}
