import java.util.Scanner;

public class Estadistica {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        int edad=0;
        int estatura=0;
        int media_edad=0;
        int media_estatura=0;
        int mayor_edad=0;
        int estatura_mayor=0;
        int contador_edad=0;
        int contador_estatura=0;

        do {

            System.out.print("Introduce la edad (-1 para salir): ");
            edad = scan.nextInt();
            contador_edad++;

            if(edad==-1){
                contador_edad--;
                break;
            }

            System.out.print("Introduce la estatura: ");
            estatura = scan.nextInt();
            contador_estatura++;

            media_edad += edad;
            media_estatura += estatura;

            if (edad >= 18) {
                mayor_edad++;
            }
            if (estatura >= 175) {
                estatura_mayor++;
            }
        }while(edad!=-1||estatura!=-1);

        System.out.println("La edad media es: "+media_edad/contador_edad+"\nLa estatura media es: "+media_estatura/contador_estatura);
        System.out.println("Los mayores de edad son: "+mayor_edad+"\nLos mas altos de 175 son: "+estatura_mayor);

    }
}
