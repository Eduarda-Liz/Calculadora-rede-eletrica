import java.util.*;

class Main {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int continuar = 0;
    double soma = 0;
        do {
            System.out.print("Insira a quantidade de pontos (fios 1.30): ");
            int qntdBuracos = keyboard.nextInt();
            double calculoInterruptores = qntdBuracos * 1.30;
            System.out.print("Insira a distancia (em cm): ");
            double distanciaPontoAaoB = keyboard.nextDouble();
            double calculoPtAaoB = distanciaPontoAaoB * 0.828;
            System.out.println();
            System.out.printf("Resultado do calculo de fio para a quantidade pontos: %.2f\n" , calculoInterruptores );
            System.out.printf("Resultado do calculo ponto A ao B: %.2f\n" , calculoPtAaoB);
            double total = calculoInterruptores + calculoPtAaoB;
            System.out.printf("Resultado total para essa lampada/tomada/interruptor: %.2f\n" , total );
            soma += total;
            System.out.printf("Soma total: %.2f\n" , soma);
            System.out.println();
            System.out.println("Deseja continuar? 1-SIM, 2-NÃO: ");
            continuar = keyboard.nextInt();
            System.out.println();
        } while (continuar!=2);
        
    }
}
