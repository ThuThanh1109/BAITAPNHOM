import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Nhập tên từ bàn phím
        System.out.print("Nhap ten cua ban: ");
        String name = sc.nextLine();
        
        // Xuất ra màn hình
        System.out.println("Hello " + name);
        
        sc.close();
    }
}
