package vetores;
import java.util.Scanner;

public class vetor1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [] vetor = new int [5];
        int num;

        for (int i = 0; i < vetor.length; i++){
            System.out.println("digite um valor para o vetor" + (i+1) +":");
            vetor[i] = in.nextInt();
        }
        
        System.out.println("Digite um valor para procurar no vetor");
        num = in.nextInt();

        for (int i = 0; i < vetor.length; i++){

            if(vetor[i] == num){
                System.out.println("O índice do número digitado é " + i);
                break;
            } else if(i == vetor.length - 1){
                System.out.println("Número não encontrado no vetor");
            }
        }
    }
}
