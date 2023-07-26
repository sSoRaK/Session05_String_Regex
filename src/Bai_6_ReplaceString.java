import java.util.Scanner;

public class Bai_6_ReplaceString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một chuỗi: ");
        String str = scanner.nextLine();
        String outputString = str.replaceAll("Academy", "Học viện");
        System.out.println("Kết quả: " + outputString);
    }
}
