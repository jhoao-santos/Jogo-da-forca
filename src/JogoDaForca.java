import java.util.Scanner;
import java.util.Arrays;

public class JogoDaForca {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String palavraSecreta = "JAVA".toLowerCase(); 
        char[] palavraOculta = new char[palavraSecreta.length()];

        for (int i = 0; i < palavraSecreta.length(); i++) {
            palavraOculta[i] = '_';
        }

        System.out.println(Arrays.toString(palavraOculta));

        int tentativas = 6;
        boolean venceu = false;

        while (tentativas > 0 && !venceu) {
            System.out.println("Palavra: " + String.valueOf(palavraOculta));
            System.out.println("Tentativas restantes: " + tentativas);
            System.out.println("Digite uma letra: ");

            char letra = scanner.next().toLowerCase().charAt(0);

            boolean acertou = false;

            for (int i = 0; i < palavraSecreta.length(); i++) {
                if (palavraSecreta.charAt(i) == letra) {
                    palavraOculta[i] = letra;
                    acertou = true;
                }
            }

            if (!acertou) {
                tentativas--;
                System.out.println("Letra incorreta! ");
            } else {
                System.out.println("Letra correta! ");
            }

            if (String.valueOf(palavraOculta).equals(palavraSecreta)) {
                venceu = true;
            }
        }

        if (venceu) {
            System.out.println("Parabens, voce venceu! Ainda restavam " + tentativas + " tentativas.");
        } else {
            System.out.println("Voce perdeu! A palavra era: " + palavraSecreta);
        }

        scanner.close();
    }
}