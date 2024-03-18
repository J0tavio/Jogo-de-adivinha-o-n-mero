package JogoAdivinhaNumero;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinha {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    private String dificuldade;
    private int numeroTentativas = 0;
    private int numeroSorteado = random.nextInt(1, 101);
    private int tentativa = 0;
    private boolean acertou = false;

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public int getNumeroTentativas() {
        return numeroTentativas;
    }

    public void setNumeroTentativas(int numeroTentativas) {
        this.numeroTentativas = numeroTentativas;
    }

    public int getNumeroSorteado() {
        return numeroSorteado;
    }

    public void setNumeroSorteado(int numeroSorteado) {
        this.numeroSorteado = numeroSorteado;
    }

    public boolean getAcertou() {
        return acertou;
    }

    public void setAcertou(boolean acertou) {
        this.acertou = acertou;
    }

    public int getTentativa() {
        return tentativa;
    }

    public void setTentativa(int tentativa) {
        this.tentativa = tentativa;
    }

    public void escolherDificulde() {

        do {
            System.out.println("Escolha uma dificuldade sendo F, M, D ou HARDCORE");
            this.dificuldade = scanner.next();

            if (this.dificuldade.equalsIgnoreCase("F")) {
                this.numeroTentativas = 100;
                System.out.println("Escolheu Fácil. Você tem " + this.numeroTentativas + " tentativas\n");
            } else if (this.dificuldade.equalsIgnoreCase("M")) {
                this.numeroTentativas = 50;
                System.out.println("Escolheu Média. Você tem " + this.numeroTentativas + " tentativas\n");
            } else if (this.dificuldade.equalsIgnoreCase("D")) {
                this.numeroTentativas = 20;
                System.out.println("Escolheu Difícil. Você tem " + this.numeroTentativas + " tentativas\n");
            } else if (this.dificuldade.equalsIgnoreCase("HARDCORE")) {
                this.numeroTentativas = 5;
                System.out.println("Escolheu HARDCORE. Você tem " + this.numeroTentativas + " tentativas\n");
            } else {
                System.out.print("Dificuldade inválida\n");
            }

        } while (!this.dificuldade.equalsIgnoreCase("F") &&
                !this.dificuldade.equalsIgnoreCase("M") &&
                !this.dificuldade.equalsIgnoreCase("D") &&
                !this.dificuldade.equalsIgnoreCase("HARDCORE"));
    }

    public void mecanicaJogo() {
        while (!this.acertou && this.tentativa <= this.numeroTentativas) {
            int chute = scanner.nextInt();
            this.tentativa++;

            if (chute == this.numeroSorteado) {
                this.acertou = true;
                System.out.println("Você acertou em: " + this.tentativa + " tentativas");
            } else if (this.tentativa >= this.numeroTentativas) {
                System.out.println("Acabou as tentativas. O número era: " + this.numeroSorteado);
            } else if (chute > this.numeroSorteado) {
                System.out.println("O número é menor");
            } else {
                System.out.println("O número é maior");
            }

        }
    }
}
