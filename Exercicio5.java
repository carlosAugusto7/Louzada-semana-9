import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class aula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        while (true) {
            System.out.print("Digite o número ( 0 para encerrar !): ");
            Integer numero = scanner.nextInt();
                if (numero == 0) {
                    break;
                }
            numeros.add(numero);
        }
        
         Collections.sort(numeros);

         System.out.print("Numeros em ordem crescentes: " + numeros);

         scanner.close();
    }

}

/// Fiz utilizando o 0 para encerrar pois foi a forma que achei de deixar o código mais simples
