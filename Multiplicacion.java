import java.util.Scanner;

public class Multiplicacion {
    public static void main(String[] args) {
        int numero=0;

        Scanner scan=new Scanner(System.in);

        while(numero!=-1){
            System.out.print("Introduce un numero: ");
            numero= scan.nextInt();

            if(numero==-1){
                break;
            }

            for (int i=1;i<=10;i++){

                System.out.println(numero+" x "+i+" = "+numero*i);
            }
        }
    }
}
