public class printIndexed {
    public static void printIndexedString(String str) {
        int len = str.length();
        for (int i = 0; i < len; i++) {
            System.out.print(str.charAt(i));
            System.out.print(len - 1 - i);
        }
    }
    public static void main(String[] args) {
        printIndexedString("ZELDA");
        return;
    }
}
