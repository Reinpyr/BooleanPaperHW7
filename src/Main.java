public class Main {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean truth = false;

        if ((a == true) && (b == true) || (a == false) && (b == false))
        {
            truth = true;
        }
        else {
            truth = false;
        }
        System.out.println(truth);
    }
}