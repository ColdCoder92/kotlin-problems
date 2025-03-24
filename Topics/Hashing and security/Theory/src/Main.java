public class Main {
    public static void main(String[] args) {
        int num = 1;
        try {
            int i = doIt() / (num = 2);
        }
    }

    public static int doIt() throws Exception {
        throw new Exception("FORGET IT");
    }
}
