import java.util.Scanner;

public class Piramide {
    public static void main(String[] args) {

        int altura=0;

        Scanner scan=new Scanner(System.in);

        do{
            System.out.print("Introduce la altura: ");
            altura= scan.nextInt();

            for(int i=1;i<altura;i++){

                for (int j=altura-i ;j>0;j--){
                    System.out.print(" ");
                }

                for (int k=1;k<i*2;k++){
                    System.out.print("*");
                }
                System.out.println();
            }

        }while(altura!=-1);

    }
}
