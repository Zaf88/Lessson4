import java.util.concurrent.LinkedTransferQueue;

public class Main {
    public static void main(String[] args)
    {
        for (int i = 1; i <= 10; i++)
            System.out.print(i + " ");
        System.out.println();

        int a = 11;
        while (a > 1) {
            a = a - 1;
            System.out.print(a + " ");


            }
}
}