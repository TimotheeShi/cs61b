public class stutterProgram {
    public static void main(String[] args) {
        String result = stutter("Hello!");
        System.out.println(result);
    }

    public static String stutter(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            sb.append(currentChar).append(currentChar);
        }

        return sb.toString();
    }
}
