import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float kg, m;
        System.out.print("Kilonuzu giriniz: ");
        kg = input.nextFloat();
        System.out.print("Boyunuzu giriniz: ");
        m = input.nextFloat();
        System.out.print("Vücut kitle indeksiniz: "+kg/(m*m));
    }
}
