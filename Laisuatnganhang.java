package laisuatnganhang;

import java.util.Scanner;

public class Laisuatnganhang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhap du lieu
        System.out.print("Nhap so tien goi ban dau (VND): ");
        double tienGui = sc.nextDouble();

        System.out.print("Nhap lai suat hang nam (%): ");
        double laiSuatNam = sc.nextDouble();

        System.out.print("Nhap so thang goi: ");
        int soThang = sc.nextInt();

        // Tính lai suat thang
        double laiSuatThang = laiSuatNam / 12 / 100;

        // Tinh tien lai va tong so tien cuoi ky
        double tienLai = tienGui * laiSuatThang * soThang;
        double tongTien = tienGui + tienLai;

        // In ket qua
        System.out.println("Tien lai cuoi ki: " + tienLai + " VND");
        System.out.println("Tong so tien nhan duoc: " + tongTien + " VND");

        sc.close();
    }
}

 