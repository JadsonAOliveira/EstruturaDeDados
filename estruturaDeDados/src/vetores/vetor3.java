// vetor de String e busca linear

package vetores;

import java.util.Scanner;

public class vetor3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] states = new String[10];

        states[0] = "AC";
        states[1] = "BA";
        states[2] = "CE";
        states[3] = "DF";
        states[4] = "AM";
        states[5] = "AP";
        states[6] = "PB";
        states[7] = "RN";
        states[8] = "MS";
        states[9] = "SP";

        for (int i = 0; i < states.length; i++) {
            System.out.println("state " + i + ": " + states[i]);
        }

        System.out.println("qual a sigla da busca: ");
        String search = in.nextLine();

        // busca linear

        boolean found = false;

        for (int i = 0; i < states.length; i++) {
            String element = states[i];

            if (element.equalsIgnoreCase(search)) {
                found = true;
                break;
            } 
        }
            if(found == true){
                System.out.println("encontrou");
            } else {
                System.out.println("não encontrou");
            }
        }
    }
