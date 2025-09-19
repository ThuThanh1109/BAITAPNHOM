package tuan4_bai6;
import java.util.Scanner;

public class Tuan4_Bai6 {

    // Ham tim UCLN
    public static int UCLN(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a); 
    }

    // Ham tim BCNN dua vao UCLN
    public static int BCNN(int a, int b) {
        return Math.abs(a * b) / UCLN(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen thu nhat: ");
        int so1 = sc.nextI
