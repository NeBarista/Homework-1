import java.util.Date;

public class interviewer {
    public static void main() {
    printResultOfInterview( " -Interviewer:", " you have successfully passed the interview");
}

    static void printResultOfInterview(String speaker, String result) {
        println(speaker + HR.NAME + result);
    }
    static void print(String text) {
        System.out.print(new Date() + text);
    }
    static void println(String text) {
        System.out.println(new Date() + text);
    }
}



