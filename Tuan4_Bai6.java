package tuan4_bai6;
import java.util.Scanner;
public class Tuan4_Bai6 {
    public static int UCLN(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a); 
    }
    public static int BCNN(int a, int b) {
        return Math.abs(a * b) / UCLN(a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen thu nhat: ");
        int so1 = sc.nextInt();
        System.out.print("Nhap so nguyen thu hai: ");
        int so2 = sc.nextInt();
        int ucln = UCLN(so1, so2);
        int bcnn = BCNN(so1, so2);
        System.out.println("UCLN cua " + so1 + " va " + so2 + " la: " + ucln);
        System.out.println("BCNN cua " + so1 + " va " + so2 + " la: " + bcnn);
        sc.close();
    }
}
