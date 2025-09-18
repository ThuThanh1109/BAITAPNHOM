/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuan4;

import java.util.Scanner;

public class Tuan4_Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }

        int tong = 0;
        for (int i = 0; i < n; i++) {
            tong += arr[i];
        }

        System.out.println("Tong cac phan tu trong mang la: " + tong);

        sc.close();
    }
}
