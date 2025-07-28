import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tabuada");
        System.out.print("Digite um numero: ");
        int numeroUsuario = scanner.nextInt();

        for (int i = 1; i < 11; i++) {
            int resultado = numeroUsuario * i;
            System.out.println(numeroUsuario + " x " + i + " = " + resultado);
        }
    }
}
