import java.util.Scanner;

/**
 * @author CrisMoura on 16/10/2022
 */
public class ExercicioCodingTank3 {

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o número de linhas desejada.");
            int quantidadeLinhas = scanner.nextInt();


            for(int i = quantidadeLinhas; i > 0 ; i--){
                for(int j = 0; j < i; j++){
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
}
