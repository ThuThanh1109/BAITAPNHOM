import java.util.Scanner;

public class JavaApplication15 {
    
    // Hàm tìm UCLN sử dụng thuật toán Euclid
    public static int timUCLN(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a); // đảm bảo kết quả dương
    }

    // Hàm tìm BCNN dựa vào UCLN
    public static int timBCNN(int a, int b) {
        return Math.abs(a * b) / timUCLN(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập hai số nguyên
        System.out.print("Nhập số nguyên thứ nhất: ");
        int a = scanner.nextInt();

        System.out.print("Nhập số nguyên thứ hai: ");
        int b = scanner.nextInt();

        // Tính UCLN và BCNN
        int ucln = timUCLN(a, b);
        int bcnn = timBCNN(a, b);

        // In kết quả
        System.out.println("UCLN của " + a + " và " + b + " là: " + ucln);
        System.out.println("BCNN của " + a + " và " + b + " là: " + bcnn);

        scanner.close();
    }
}

