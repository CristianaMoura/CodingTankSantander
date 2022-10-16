import java.util.Scanner;

public class ExercicioCodingTank1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite Salário Bruto Mensal.");
        double salarioBruto = scanner.nextDouble();

        if (salarioBruto < 0 ){
            System.out.println("**********Valor imcompátivel com o cálculo**********");
            System.exit(0);
        }

        System.out.println("Digite Quantidade de Meses Trabalhados.");
        int mesesTrabalhados = scanner.nextInt();

        if (mesesTrabalhados < 0 ){
            System.out.println("**********Valor imcompátivel com o cálculo**********");
            System.exit(0);
        }

        double ferias = salarioBruto * mesesTrabalhados / 12 + salarioBruto/3 ;

        double decimoTerceiroSalario = (salarioBruto * mesesTrabalhados / 12);

        double inss = 0.0;

        if (salarioBruto > 0 && salarioBruto <= 1212.00){
            inss =  salarioBruto * 7.5 / 100;

        } else if (salarioBruto > 1212.00 && salarioBruto <= 2427.35){
            inss = salarioBruto * 9 / 100;

        }else if (salarioBruto > 2427.35 && salarioBruto <= 3641.03){
            inss = salarioBruto * 12 / 100;

        }else if (salarioBruto > 3641.03 && salarioBruto <= 7087.22){
            inss = salarioBruto * 14 / 100;

        }else if (salarioBruto > 7087.22){
            inss = salarioBruto - 900;
        }

        double resultadoBrutoAnual = salarioBruto * 12 + ferias + decimoTerceiroSalario;
        System.out.printf("Salário Bruto Anual =  %.2f \n", resultadoBrutoAnual);

        double valorAnualInss = inss * 12;
        System.out.printf("Valor Anual Inss =  %.2f \n", valorAnualInss);

        double valorSalarioAnualLiquidoAdicionais = resultadoBrutoAnual - valorAnualInss;
        System.out.printf("Valor Salário Anual Liquido =  %.2f \n",  valorSalarioAnualLiquidoAdicionais);


}
}