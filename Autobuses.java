import java.util.Scanner;

public class Autobuses {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        int totalPersonas=0;
        int totalBus=0;

        while (true){
            System.out.println("Personas del grupo (0=FIN): ");
            System.out.println("Apuntados. Van "+totalPersonas);
            int personasGrupo=scan.nextInt();

            if(personasGrupo>0){
                totalPersonas+=personasGrupo;
            }
            else if(personasGrupo<0){
                System.out.println("No puede ser negativo");
            }
            else{
                break;
            }
        }
        if(totalPersonas%55==0){
            totalBus=totalPersonas/55;
        }
        else {
            totalBus=totalPersonas/55+1;
        }
        System.out.println("Son necesarios "+totalBus+" autobuses");

    }

}
