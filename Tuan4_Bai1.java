package tuan4;

import java.util.Scanner;

public class Tuan4_Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mot so nguyen: ");
        int n = sc.nextInt();

        if (n > 0) {
            System.out.println("So " + n + " la so duong.");
        } else if (n < 0) {
            System.out.println("So " + n + " la so am.");
        } else {
            System.out.println("So ban nhap bang 0.");
        }
    }
}
