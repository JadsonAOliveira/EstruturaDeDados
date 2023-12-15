package vetores;
import java.util.Scanner;

public class vetor2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("digite o tamanho do vetor: ");
        int vetor_tamanho = in.nextInt();
        int[] vetor = new int[vetor_tamanho];


        for (int i = 0; i < vetor_tamanho; i++){
            System.out.println("digite um valor para o vetor" + (i+1) +":");
            vetor[i] = in.nextInt();
        }

        System.out.println("elementos do vetor: ");

        for (int i = 0; i < vetor_tamanho; i++){
            System.out.println("posição " + i + ": " +vetor[i]);
            }
        }
    }

