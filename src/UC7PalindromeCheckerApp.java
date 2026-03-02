import java.util.Deque;
import java.util.ArrayDeque;
public class UC7PalindromeCheckerApp {

    public static void main(String[] args) {
        String[] testStrings = {
                "racecar",
                "madam",
                "hello",
                "deified",
                "palindrome"
        };
        for (String str : testStrings) {
            if (isPalindrome(str)) {
                System.out.println(str + " is a palindrome.");
            } else {
                System.out.println(str + " is NOT a palindrome.");
            }
        }
    }

    public static boolean isPalindrome(String str) {
        Deque<Character> deque = new ArrayDeque<>();

        for (char ch : str.toCharArray()) {
            deque.addLast(ch);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true; // No mismatches, it's a palindrome
    }
}