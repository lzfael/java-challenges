import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Contador de Vogais");
        System.out.print("Digite uma palavra: ");
        String palavraUsuario = scanner.nextLine();

        String palavraUsuarioMinusculo = palavraUsuario.toLowerCase();
        int numeroLetras = palavraUsuarioMinusculo.length();
        int contadorVogais = 0;
        for (int i = 0; i < numeroLetras; i++) {
            char letras = palavraUsuarioMinusculo.charAt(i);
            if (letras == 'a' || letras == 'e' || letras == 'i' || letras == 'o' || letras == 'u') {
                contadorVogais++;
            }
        }
        System.out.println("A palavra digitada contem " + contadorVogais + " vogais.");
    }
}
