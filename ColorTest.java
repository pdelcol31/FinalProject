public class ColorTest {
        public static final String ANSI_RESET = "\U001B[0m";
        public static final String ANSI_BLACK = "\U001B[30m";
        public static final String ANSI_RED = "\U001B[31m";

        public static void main(String[] args){
            System.out.println(ANSI_RED + "red");
        }
}
