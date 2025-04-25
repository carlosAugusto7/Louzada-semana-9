import java.util.ArrayList;
import java.util.Scanner;

public class aula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            System.out.print("Digite o número: ");
            Integer numero = scanner.nextInt();
            numeros.add(numero);
        }

        System.out.print("Digite o número que deseja procurar: ");
        Integer procurar = scanner.nextInt();


        Integer contar = 0;
        for (Integer numero : numeros){
            if (numero == procurar)
                contar++;
        }

        System.out.print("O número " + procurar + " aparece " + contar + " vezes.");

         scanner.close();
    }

}
