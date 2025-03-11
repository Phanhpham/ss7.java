import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi từ bàn phím
        System.out.print("Nhập chuỗi PascalCase hoặc camelCase: ");
        String input = scanner.nextLine();

        // Kiểm tra nếu chuỗi rỗng, trả về chuỗi rỗng
        if (input.isEmpty()) {
            System.out.println("");
            return;
        }

        // Khởi tạo StringBuilder để lưu kết quả
        StringBuilder result = new StringBuilder();

        // Duyệt qua từng ký tự trong chuỗi
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            // Kiểm tra nếu ký tự là chữ cái viết hoa
            if (Character.isUpperCase(currentChar)) {
                // Nếu đây là chữ đầu tiên, không thêm dấu _
                if (i > 0) {
                    result.append("_");
                }
                // Chuyển chữ hoa thành chữ thường và thêm vào kết quả
                result.append(Character.toLowerCase(currentChar));
            } else {
                // Nếu là chữ thường, chỉ cần thêm vào kết quả
                result.append(currentChar);
            }
        }


        System.out.println(result.toString());
    }
}
