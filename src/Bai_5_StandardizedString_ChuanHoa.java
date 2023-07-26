import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Bai_5_StandardizedString_ChuanHoa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một chuỗi: ");
        String str = scanner.nextLine();
        // a. Không có khoảng trắng ở 2 đầu
        System.out.println("Xóa khoảng trắng ở 2 đầu: " + str.trim());
        // b. Mỗi từ cách nhau 1 khoảng trắng
        System.out.println("Mỗi từ cách nhau 1 khoảng trắng: " + str.replaceAll("\\s+", " "));
        // c. Capitalize
        String result = capitalizeFirstLetter(str);
        System.out.println("Capitalize: " + result);
    }

    public static String capitalizeFirstLetter(String input) {
        StringBuilder result = new StringBuilder();
        // tách string -> array
        String[] words = input.split("\\s");
        for (String word : words) {
            if (!word.isEmpty()) {
                char firstLetter = Character.toUpperCase(word.charAt(0));
                result.append(firstLetter).append(word.substring(1)).append(" ");
            }
        }
        return result.toString().trim();
    }
}
