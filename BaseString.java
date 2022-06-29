package cx.nmluci.palindrome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaseString {
    protected String data;
    protected Integer length;
    protected String dataType;

    public BaseString() {
        dataType = "BaseString";
    }

    public BaseString(String content) {
        data = content;
        length = data.length();
        if (length < 255) {
            data = null;
        }
    }

    public BaseString(String[] contents) {
        data = "";
        if (contents.length == 1) {
            data = contents[0];
        } else {
            for (String content: contents) {
                if (content != null) data = data.concat(content);
            }
        }
        length = data.length();
    }

    public Integer length() {
        return length;
    }
    public String getContent() {
        return data;
    }

    protected void getInput() {
        try {
            System.out.printf("[%s] Enter your string: ", dataType);
            BufferedReader reader = new BufferedReader(new InputStreamReader((System.in)));
            String buff = reader.readLine();

            if (buff.length() < 255) {
                System.out.println("string length has to be at least 255 characters");
            } else {
                data = buff;
                length = data.length();
            }
        } catch (IOException exception) {
            System.out.println("an error occurred during reading from IOStream");
        }
    }
}
