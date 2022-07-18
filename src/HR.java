public class HR {
     static final String NAME = "Sergey";
    public static void main() {
        printResult(" -HR: ", "hired");

        Manager.ManagerSay();


        printJob(" -HR: ", "you are accepted into the company");
    }



    static void printResult(String speaker, String decision) {
        interviewer.println(speaker + "Hello, " + NAME + " you have been " + decision);
    }

    public static void printJob(String speaker, String decision) {
        interviewer.println(speaker + " " + NAME + " " + decision);
    }
}


