package vetores;
import java.util.Scanner;

public class vetor2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("digite o tamanho do vetor: ");
        int vector_size = in.nextInt();
        int[] vector = new int[vector_size];


        for (int i = 0; i < vector_size; i++){
            System.out.println("digite um valor para o vetor" + (i+1) +":");
            vector[i] = in.nextInt();
        }

        System.out.println("elementos do vetor: ");

        for (int i = 0; i < vector_size; i++){
            System.out.println("posição " + i + ": " +vector[i]);
            }
        }
    }

