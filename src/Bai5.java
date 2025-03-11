import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi từ bàn phím
        System.out.print("Nhập một chuỗi: ");
        String inputString = scanner.nextLine();

        // Loại bỏ các khoảng trắng thừa
        inputString = inputString.trim().replaceAll("\\s+", " ");

        // Tách câu thành các từ
        String[] words = inputString.split(" ");

        // Tạo StringBuilder để lưu kết quả
        StringBuilder result = new StringBuilder();

        // Đảo ngược thứ tự các từ và nối lại thành câu mới
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]).append(" ");
        }

        // In ra câu mới
        System.out.println("Câu mới sau khi xử lý: " + result.toString().trim());
    }
}
