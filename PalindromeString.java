package cx.nmluci.palindrome;

public class PalindromeString extends BaseString {
    public PalindromeString() {
        dataType = "PalindromeString";
        getInput();
    }

    public PalindromeString(String content) {
        super(content);
    }

    public PalindromeString(String[] content) {
        super(content);
    }

    public Boolean isPalindrome() {
        if (data == null) return false;

        for (int i=0;  i<data.length(); i++) {
            if (data.charAt(i) != data.charAt(data.length()-1-i)) {
                return false;
            }
        }
        return true;
    }

}
