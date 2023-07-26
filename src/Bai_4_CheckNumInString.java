import java.util.Scanner;
import java.util.regex.Pattern;

public class Bai_4_CheckNumInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một chuỗi: ");
        String str;
        // c1: regex
        String numberRegex = ".*\\d.*";
        boolean checkNumber = true;
        do {
            str = scanner.nextLine();
            if (Pattern.matches(numberRegex, str)) {
                System.out.println("YES");
                checkNumber = false;
            } else {
                System.out.println("NO");
            }
        } while (checkNumber);

        // c2:  kiểm tra bằng isDigit của lớp Character
        boolean isCheck = false;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                isCheck = true;
                break;
            }
        }
        if (isCheck) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
