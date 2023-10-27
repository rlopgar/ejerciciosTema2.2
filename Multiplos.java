import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {

        int numeroMultiplo=0;
        int numeroMaximo=0;
        int resultado=0;

        Scanner scan=new Scanner(System.in);

        do {

            System.out.print("Introduce un numero: ");
            numeroMultiplo = scan.nextInt();

            if (numeroMultiplo==-1){
                break;
            }

            System.out.print("Introduce un numero maximo: ");
            numeroMaximo = scan.nextInt();

            for (int i = numeroMultiplo; i < numeroMaximo; i=i+numeroMultiplo) {

                System.out.print(i+" ");

            }

            System.out.println();

        }while(numeroMultiplo>0);
    }
}
