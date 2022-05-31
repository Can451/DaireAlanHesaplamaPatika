import java.util.Scanner;

public class DaireAlani {
    public static void main(String[] args) {
        double pi = 3.14;
        double alan;
        Scanner inp = new Scanner(System.in);
        System.out.println("R giriniz: ");
        int r = inp.nextInt();
        System.out.println("A giriniz: ");
        int a = inp.nextInt();

        alan=(pi*(r*r)*a)/360;
        System.out.println("Alan: "+alan);

    }
}
