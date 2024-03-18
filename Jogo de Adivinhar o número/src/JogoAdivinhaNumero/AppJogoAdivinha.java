package JogoAdivinhaNumero;

public class AppJogoAdivinha {
    public static void main(String[] args) {

        JogoAdivinha jogo = new JogoAdivinha();
        jogo.escolherDificulde();
        System.out.println("Digite um número de 1 a 100");
        jogo.mecanicaJogo();


    }
}