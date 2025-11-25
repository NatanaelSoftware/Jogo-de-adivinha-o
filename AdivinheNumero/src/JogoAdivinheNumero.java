import java.util.Scanner;
import java.util.Random;

public class JogoAdivinheNumero {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto;
        int numeroJogador;
        boolean acertou = false;
        int pontosUsuario;

        System.out.println("BEM VINDO AO JOGO DE ADIVINHAÇÂO!!!!");
        System.out.println("VOCÊ TERA 5 TENTSTIVAS BOA SORTE E DIVIRTA-SE!!!!\n");

        numeroSecreto = random.nextInt(11);

        for (int numeroTentativas = 5; numeroTentativas > 0; numeroTentativas--) {
            System.out.println("Vidas restantes: " + numeroTentativas);
            System.out.print("Digite qual e o seu palpite: ");
            numeroJogador = sc.nextInt();

            pontosUsuario = numeroTentativas;

            if (numeroJogador == numeroSecreto) {
                System.out.println("Parabéns você acertou!!!\n");
                System.out.println("Sua pontuação é: " + pontosUsuario);
                acertou = true;
                break; 
            }else if (numeroJogador > numeroSecreto){
                System.out.println("\nOpss! O numero secerto e um pouco menor que: " + numeroJogador);
            }else if (numeroJogador < numeroSecreto){
                System.out.println("\nOpss! o numero secreto e um pouco maior que: " + numeroJogador);
            }
        }

        if (!acertou) {
            System.out.println("Suas vidas acabaram!!");
            System.out.println("O número secreto era: " + numeroSecreto);
        }
    }
}
