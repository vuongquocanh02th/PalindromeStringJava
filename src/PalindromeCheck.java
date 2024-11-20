import java.util.LinkedList;
import java.util.Locale;
import java.util.Queue;

public class PalindromeCheck {
    public static boolean isPalindrome(String str) {
        //loai bo khoang trang
        str = str.replaceAll("\\s+", "").toLowerCase();
        Queue<Character> queue = new LinkedList<>();
        //Dua tat ca ky tu vao Queue
        for (char c : str.toCharArray()) {
            queue.offer(c);
        }
        //So sanh cac ky tu tu hai dau
        while (queue.size() > 1) {
            //So sanh ky tu dau tien va cuoi cung
            if (queue.poll() != queue.peek()) {
                return false; //neu ko khop, ko phai palindrome
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "o  o";
        if (isPalindrome(input)) {
            System.out.println("Palindrome");
        }else {
            System.out.println("Not a palindrome");
        }
    }
}
