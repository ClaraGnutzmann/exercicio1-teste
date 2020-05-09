import java.util.Locale;
import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        String x;
        int y;
        double z;

        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();
        System.out.println("Voce Digitou: ");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        sc.close();



    }
    }
