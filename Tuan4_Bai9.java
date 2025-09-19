package tuan4_bai9;
import java.util.ArrayList;
import java.util.Scanner;

public class Tuan4_Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> danhSach = new ArrayList<>();
        System.out.print("Nhap so luong phan tu: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            int so = sc.nextInt();
            danhSach.add(so);
        }
        System.out.println("Cac phan tu trong danh sach la:");
        for (int so : danhSach) {
            System.out.print(so + " ");
        }
        sc.close();
    }
}
