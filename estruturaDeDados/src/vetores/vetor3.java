// vetor de String e busca linear

package vetores;

import java.util.Scanner;

public class vetor3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] estados = new String[10];

        estados[0] = "AC";
        estados[1] = "BA";
        estados[2] = "CE";
        estados[3] = "DF";
        estados[4] = "AM";
        estados[5] = "AP";
        estados[6] = "PB";
        estados[7] = "RN";
        estados[8] = "MS";
        estados[9] = "SP";

        for (int i = 0; i < estados.length; i++) {
            System.out.println("estado " + i + ": " + estados[i]);
        }

        System.out.println("qual a sigla da busca: ");
        String buscaSigla = in.nextLine();

        // busca linear

        boolean encontrou = false;

        for (int i = 0; i < estados.length; i++) {
            String elemento = estados[i];

            if (elemento.equalsIgnoreCase(buscaSigla)) {
                encontrou = true;
                break;
            } 
        }
            if(encontrou == true){
                System.out.println("encontrou");
            } else {
                System.out.println("não encontrou");
            }
        }
    }
