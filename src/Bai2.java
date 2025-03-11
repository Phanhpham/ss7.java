public class Bai2 {
    public static void main(String[] args) {
        // Chuỗi ban đầu
        String str = "Hello, Java World!";

        // In chuỗi ban đầu
        System.out.println("Chuỗi ban đầu: " + str);

        // Thao tác xóa các ký tự từ vị trí 5 đến 9
        String strAfterDelete = str.substring(0, 5) + str.substring(10);
        System.out.println("Chuỗi sau khi xóa: " + strAfterDelete);

        // Thao tác thay thế đoạn "World" bằng "Universe"
        String strAfterReplace = str.replace("World", "Universe");
        System.out.println("Chuỗi sau khi thay thế: " + strAfterReplace);
    }
}
