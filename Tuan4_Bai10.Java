import java.util.Scanner;

public class Bttuan4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng phần tử ban đầu
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();

        int[] arr = new int[100]; // Mảng đủ lớn để thêm phần tử
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử arr[" + i + "]: ");
            arr[i] = scanner.nextInt();
        }

        System.out.println("\nMenu:");
        System.out.println("1. Thêm phần tử");
        System.out.println("2. Xoá phần tử");
        System.out.print("Chọn chức năng (1 hoặc 2): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            // Thêm phần tử
            System.out.print("Nhập vị trí cần thêm (0 đến " + n + "): ");
            int pos = scanner.nextInt();
            if (pos < 0 || pos > n) {
                System.out.println("Vị trí không hợp lệ!");
                return;
            }

            System.out.print("Nhập giá trị cần thêm: ");
            int value = scanner.nextInt();

            // Dời các phần tử sang phải
            for (int i = n; i > pos; i--) {
                arr[i] = arr[i - 1];
            }
            arr[pos] = value;
            n++;

            System.out.println("Mảng sau khi thêm:");
        } else if (choice == 2) {
            // Xoá phần tử
            System.out.print("Nhập vị trí cần xoá (0 đến " + (n - 1) + "): ");
            int pos = scanner.nextInt();
            if (pos < 0 || pos >= n) {
                System.out.println("Vị trí không hợp lệ!");
                return;
            }

            // Dời phần tử sang trái
            for (int i = pos; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--;

            System.out.println("Mảng sau khi xoá:");
        } else {
            System.out.println("Lựa chọn không hợp lệ!");
            return;
        }

        // In mảng sau khi xử lý
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
