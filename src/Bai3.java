import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi từ bàn phím
        System.out.print("Nhập một chuỗi bất kỳ: ");
        String inputString = scanner.nextLine();

        // Tạo đối tượng StringBuilder với chuỗi vừa nhập
        StringBuilder sb = new StringBuilder(inputString);

        // In chuỗi ban đầu
        System.out.println("Chuỗi ban đầu: " + inputString);

        // Đảo ngược chuỗi
        sb.reverse();

        // In chuỗi đã được đảo ngược
        System.out.println("Chuỗi đã được đảo ngược: " + sb.toString());
    }
}
