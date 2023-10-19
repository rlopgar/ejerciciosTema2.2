import java.util.Scanner;

public class ContandoNumeros {
    public static void main(String[] args) {

        int numeroNegativos=0;
        int numeroPositivos=0;
        int numeroCero=0;

        Scanner scan=new Scanner(System.in);

        for (int i=0;i<10;i++){
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

        System.out.println(+numeroNegativos+" números negativos\n"+numeroCero+" ceros\n"+numeroPositivos+" números positivos");

    }
}
