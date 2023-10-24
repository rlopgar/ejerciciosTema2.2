import java.util.Scanner;

public class Autobuses {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        int totalPersonas=0;
        int totalBus=0;
        int personasGrupo=0;

        do {
            System.out.print("Personas del grupo (0=FIN): >");
            personasGrupo=scan.nextInt();

            if(personasGrupo>0){
                totalPersonas+=personasGrupo;
            }
            else if(personasGrupo<0){
                System.out.println("No puede ser negativo");
            }

            System.out.println("Apuntados. Van "+totalPersonas);
        }while(personasGrupo!=0);

        if(totalPersonas%55==0){
            totalBus=totalPersonas/55;
        }
        else {
            totalBus=totalPersonas/55+1;
        }
        System.out.println("Son necesarios "+totalBus+" autobuses");

    }

}
