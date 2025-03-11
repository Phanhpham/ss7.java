import java.util.Random;
import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập vào số nguyên n
        System.out.print("Nhập số nguyên n: ");
        int n = scanner.nextInt();

        // Gọi hàm tạo chuỗi ngẫu nhiên
        String randomString = generateRandomString(n);

        // In ra chuỗi ngẫu nhiên
        System.out.println("Chuỗi ngẫu nhiên: " + randomString);
    }

    // Hàm tạo chuỗi ngẫu nhiên với độ dài n
    public static String generateRandomString(int n) {
        Random rand = new Random();
        StringBuilder result = new StringBuilder();

        // Các ký tự có thể có trong chuỗi
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        for (int i = 0; i < n; i++) {
            // Chọn ngẫu nhiên một ký tự từ chuỗi chars
            int randomIndex = rand.nextInt(chars.length());
            result.append(chars.charAt(randomIndex));
        }

        return result.toString();
    }
}
