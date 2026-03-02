

public class UseCase11PalindromeCheckerApp {

  
    public static void main(String[] args) {

        String input = "madam";

        // Create service object
        PalindromeService service = new PalindromeService();

        // Call palindrome check method
        boolean result = service.checkPalindrome(input);

        // Display result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}


class PalindromeService {

   
    public boolean checkPalindrome(String input) {

        if (input == null || input.length() <= 1)
            return true;

        // Initialize pointers
        int start = 0;
        int end = input.length() - 1;

        // Compare characters moving inward
        while (start < end) {

            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}
