import java.util.Scanner;

public class AdivinaNumero {
    public static void main(String[] args) {

        int numero_aleatorio;
        int numero_adivina;
        int max=100;
        int min=1;
        int contador=1;

        Scanner scan=new Scanner(System.in);

        numero_aleatorio=(int)((Math.random() * (max - min + 1) + min));

        do {

            System.out.print("Este es el intento "+contador+". Introduce un numero: ");
            numero_adivina = scan.nextInt();
            contador++;

            if (numero_adivina > numero_aleatorio) {
                System.out.println("El numero es menor");
            } else if (numero_adivina < numero_aleatorio) {
                System.out.println("El numero es mayor");
            } else {
                System.out.println("Has acertado, el numero es "+numero_aleatorio);
            }

        }while(numero_adivina!=numero_aleatorio&&contador<11);

        if(contador>10){
        System.out.println("Lo siento, has perdido. El numero era: "+numero_aleatorio);
        }
    }
}
