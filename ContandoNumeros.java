import java.util.Scanner;

public class ContandoNumeros {
    public static void main(String[] args) {

        int numeroNegativos=0;
        int numeroPositivos=0;
        int numeroCero=0;

        Scanner scan=new Scanner(System.in);

        System.out.println("Introduce 10 numeros:");

        for (int i=1;i<=10;i++){
            System.out.println("Numero "+i);
            int numero= scan.nextInt();

            if(numero>0){
                numeroPositivos++;
            }
            else if(numero<0){
                numeroNegativos++;
            }
            else{
                numeroCero++;
            }
        }

        System.out.println("\nNumeros positivos: "+numeroPositivos+"\nNumeros negativos: "+numeroNegativos+"\nNumeros 0: "+numeroCero);


    }
}
