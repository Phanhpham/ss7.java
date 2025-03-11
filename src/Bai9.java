import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi từ người dùng
        System.out.print("Nhập chuỗi: ");
        String input = scanner.nextLine();

        // Gọi hàm nén chuỗi
        String compressedString = compressString(input);

        // In ra chuỗi nén
        System.out.println("Chuỗi nén: " + compressedString);
    }

    // Hàm nén chuỗi
    public static String compressString(String input) {
        // Kiểm tra chuỗi rỗng
        if (input.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        int count = 1;

        // Duyệt qua chuỗi từ ký tự thứ 2 đến hết
        for (int i = 1; i < input.length(); i++) {
            // Kiểm tra nếu ký tự hiện tại giống ký tự trước đó
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;  // Tăng số lần xuất hiện
            } else {
                // Thêm ký tự và số lần xuất hiện vào StringBuilder
                result.append(input.charAt(i - 1));
                result.append(count);
                count = 1;  // Đặt lại số lần xuất hiện cho ký tự mới
            }
        }

        // Thêm ký tự cuối cùng và số lần xuất hiện vào StringBuilder
        result.append(input.charAt(input.length() - 1));
        result.append(count);

        return result.toString();
    }
}
