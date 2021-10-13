package lecture4;

public class DemoForDoWhile {
    public static void main(String[] args) {
        int i = 0;

        do {
            System.out.println("This is DO WHILE block");
            System.out.println("i = " + i);
            i++;
        } while (i < 0);
        i = 0;
        while (i < 0) {
            System.out.println("This is while block");
            System.out.println("i = " + i);
            i++;
        }
    }
}
