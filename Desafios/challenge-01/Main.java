import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Par ou Impar");
        System.out.print("Digite um numero: ");
        int numeroUsuario = scanner.nextInt();

        if (numeroUsuario % 2 == 0){
            System.out.println("O numero enviado é Par!");
        } else {
            System.out.println("O numero enviado é Ímpar!");
        }
    }
}