import java.util.Scanner;

public class ExercicioCodingTank2 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tamanho da Matriz desejada: ");
        int numeroMatriz = scanner.nextInt();
        int i = 0;
        int j = 0;

        int [][] matriz = new int [numeroMatriz][numeroMatriz];

        for(i = 0; i < numeroMatriz ; i++){
            for(j = 0; j < numeroMatriz; j++){
                matriz[i][j]= 0;
            }
            for(i =0; i < numeroMatriz; i++){
                matriz[i][numeroMatriz - i -1] = 1;
            }
            for(i =0; i < numeroMatriz; i++){
                for (j = 0; j <numeroMatriz; j++){
                    System.out.print(matriz[i][j] +"\t");

                }System.out.println();
            }

        }


    }
}