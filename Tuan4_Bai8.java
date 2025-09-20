import java.util.Scanner;
public class Tuan4_Bai8 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Nhap cac phan tu vao mang:");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        int solanxuathien = 0;
        int giatri = arr[0];

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            if (count > solanxuathien) {
                solanxuathien = count;
                giatri = arr[i];
            }
        }

        System.out.println("Phan tu xuat hien nhieu nhat: " + giatri + " (xuat hien " + solanxuathien + " lan)");
    }
}
