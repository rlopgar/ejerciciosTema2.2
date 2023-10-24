import java.util.Scanner;

public class CreceDecre {
    public static void main(String[] args) {

        int actual=0;
        int anterior=0;
        boolean crece=true;
        boolean decrece=true;
        int contador=1;

        Scanner scan=new Scanner(System.in);
        do{

            System.out.print(">");
            actual= scan.nextInt();

        if(contador>1&&actual>=0) {
            if (actual > anterior) {
                decrece = false;
            } else if (actual < anterior) {
                crece = false;
            } else {
                crece = false;
                decrece = false;
            }
        }
        anterior = actual;
        contador++;
        }while (actual>=0);

        if(crece&&decrece){
            System.out.println("No se ha introducido numeros");
        }
        else if (crece&&!decrece){
            System.out.println("Es creciente");
        }
        else if(!crece&&decrece){
            System.out.println("Es decreciente");
        }
        else if(!crece&&!decrece){
            System.out.println("No es decreciente ni creciente");
        }

    }
}
