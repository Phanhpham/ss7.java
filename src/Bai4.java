import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi từ bàn phím
        System.out.print("Nhập một chuỗi: ");
        String inputString = scanner.nextLine();

        // Chuyển chuỗi về dạng chữ thường
        String lowerCaseString = inputString.toLowerCase();

        // Tạo đối tượng StringBuilder và đảo ngược chuỗi
        StringBuilder sb = new StringBuilder(lowerCaseString);
        String reversedString = sb.reverse().toString();

        // So sánh chuỗi ban đầu và chuỗi đảo ngược
        if (lowerCaseString.equals(reversedString)) {
            System.out.println("Chuỗi đối xứng.");
        } else {
            System.out.println("Chuỗi không đối xứng.");
        }
    }
}
