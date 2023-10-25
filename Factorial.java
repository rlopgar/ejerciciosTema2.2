import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int numero;
        do {
            System.out.println(" ");
            System.out.print("Introduce un numero: ");
            numero = scan.nextInt();

            if(numero==-1){
                break;
            }

            int numeroFactorial = numero - 1;
            System.out.print(numero+" = "+numero);
            do {
                System.out.print(" * " + numeroFactorial);
                numeroFactorial--;
            } while (numeroFactorial != 0);
        } while (numero!=-1);
    }
}
