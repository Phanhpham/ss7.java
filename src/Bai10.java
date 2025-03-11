import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Khởi tạo StringBuilder để thao tác với chuỗi
        StringBuilder str = new StringBuilder();

        // Menu cho người dùng lựa chọn
        while (true) {
            System.out.println("==== MENU QUẢN LÝ CHUỖI ====");
            System.out.println("1. Đảo ngược chuỗi");
            System.out.println("2. Chèn chuỗi vào vị trí bất kỳ");
            System.out.println("3. Xóa một đoạn trong chuỗi");
            System.out.println("4. Thay thế một đoạn trong chuỗi");
            System.out.println("5. Chuyển đổi toàn bộ chuỗi thành chữ hoa/chữ thường");
            System.out.println("6. Thoát chương trình");
            System.out.print("Chọn chức năng (1-6): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng nhập dư

            switch (choice) {
                case 1:
                    // Đảo ngược chuỗi
                    System.out.println("Chuỗi hiện tại: " + str);
                    str.reverse();
                    System.out.println("Chuỗi sau khi đảo ngược: " + str);
                    break;
                case 2:
                    // Chèn chuỗi vào vị trí bất kỳ
                    System.out.print("Nhập chuỗi muốn chèn: ");
                    String insertStr = scanner.nextLine();
                    System.out.print("Nhập vị trí chèn: ");
                    int insertPos = scanner.nextInt();
                    scanner.nextLine(); // Đọc bỏ dòng nhập dư
                    str.insert(insertPos, insertStr);
                    System.out.println("Chuỗi sau khi chèn: " + str);
                    break;
                case 3:
                    // Xóa một đoạn trong chuỗi
                    System.out.print("Nhập vị trí bắt đầu xóa: ");
                    int startPos = scanner.nextInt();
                    System.out.print("Nhập vị trí kết thúc xóa: ");
                    int endPos = scanner.nextInt();
                    scanner.nextLine(); // Đọc bỏ dòng nhập dư
                    str.delete(startPos, endPos);
                    System.out.println("Chuỗi sau khi xóa: " + str);
                    break;
                case 4:
                    // Thay thế một đoạn trong chuỗi
                    System.out.print("Nhập đoạn cần thay thế: ");
                    String oldStr = scanner.nextLine();
                    System.out.print("Nhập đoạn thay thế: ");
                    String newStr = scanner.nextLine();
                    int startIdx = str.indexOf(oldStr);
                    if (startIdx != -1) {
                        str.replace(startIdx, startIdx + oldStr.length(), newStr);
                        System.out.println("Chuỗi sau khi thay thế: " + str);
                    } else {
                        System.out.println("Đoạn cần thay thế không tồn tại trong chuỗi.");
                    }
                    break;
                case 5:
                    // Chuyển đổi toàn bộ chuỗi thành chữ hoa hoặc chữ thường
                    System.out.print("Chuyển thành (1) chữ hoa, (2) chữ thường: ");
                    int caseChoice = scanner.nextInt();
                    scanner.nextLine(); // Đọc bỏ dòng nhập dư
                    if (caseChoice == 1) {
                        str = new StringBuilder(str.toString().toUpperCase());
                    } else if (caseChoice == 2) {
                        str = new StringBuilder(str.toString().toLowerCase());
                    } else {
                        System.out.println("Lựa chọn không hợp lệ.");
                    }
                    System.out.println("Chuỗi sau khi chuyển đổi: " + str);
                    break;
                case 6:
                    // Thoát chương trình
                    System.out.println("Thoát chương trình. Tạm biệt!");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }
}
