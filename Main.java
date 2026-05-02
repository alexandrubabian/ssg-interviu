public class Main {

    public static String encode(String text) {
        if (text == null || text.isEmpty()) {
            return "";
        }

        StringBuilder encoded = new StringBuilder();
        char runChar = text.charAt(0);
        int runLength = 1;

        for (int i = 1; i < text.length(); i++) {
            char current = text.charAt(i);
            if (current == runChar) {
                runLength++;
            } else {
                encoded.append(runChar).append(runLength);
                runChar = current;
                runLength = 1;
            }
        }
        encoded.append(runChar).append(runLength);

        return encoded.toString();
    }

    public static void main(String[] args) {
        System.out.println(encode("wwwwaaadexxxxxx"));
        System.out.println(encode("aaaabbbccc"));
        System.out.println(encode("abbbcdddd"));
    }
}
