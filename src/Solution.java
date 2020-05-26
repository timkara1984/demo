import java.io.IOException;


public class Solution {
    public static boolean whatNumbers;
    public static void main(String[] args) throws IOException {
        while (true) {
            String[] list = Reader.readValue();
            int result = new CalculateImpl(list).getResult();
            Printer.print(whatNumbers, result);
        }
    }
}
