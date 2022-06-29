package cx.nmluci.palindrome;

public class Main {
    public static PalindromeString palindromeArgsless() {
        PalindromeString string = new PalindromeString();
        System.out.printf("String length: %d%n", string.length());
        return string;
    }

    public static PalindromeString palindromeArgs() {
        String obj = "akakakakakakakakakakakakakakakakakakakakakakakakakakakakakakakakakakakakakakakakakakakakakakakakakakakakakakakakakakakakakakakakakakakakakakakaka";
        PalindromeString string = new PalindromeString(obj);

        System.out.printf("String length: %d%n", string.length());
        return string;
    }

    public static void main(String[] args) {
        PalindromeString stringWithoutArgument = palindromeArgsless();
        PalindromeString stringWithArgument = palindromeArgs();

        if (stringWithArgument.isPalindrome()){
            System.out.println("String bersifat palindrome");
        } else {
            System.out.println("String tidak bersifat palindrome");
        };

        if (stringWithoutArgument.isPalindrome()){
            System.out.println("String bersifat palindrome");
        } else {
            System.out.println("String tidak bersifat palindrome");
        };
    }
}
