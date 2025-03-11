import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập 3 chuỗi từ bàn phím
        System.out.print("Nhập chuỗi thứ nhất: ");
        String str1 = scanner.nextLine();
        System.out.print("Nhập chuỗi thứ hai: ");
        String str2 = scanner.nextLine();
        System.out.print("Nhập chuỗi thứ ba: ");
        String str3 = scanner.nextLine();

        // Tạo đối tượng StringBuilder và nối các chuỗi lại
        StringBuilder sb = new StringBuilder();
        sb.append(str1);
        sb.append(str2);
        sb.append(str3);

        // Chuyển StringBuilder thành chuỗi và chuyển sang chữ hoa
        String result = sb.toString().toUpperCase();

        System.out.println("Kết quả cuối cùng: " + result);
    }
}
