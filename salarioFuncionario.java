// Biblioteca Scanner
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
 
        // Objeto Scanner
        Scanner intup = new Scanner(System.in);
        
        // 1º Passo: Leitura do número de carros vendidos
        System.out.println("Digite o número de carros vendidos pelo funcionário:");
        int carrosVendidos = intup.nextInt();
        
        // 2º Passo: Leitura do valor ganho por carro
        System.out.println("Digite o valor que o funcionário ganha por carro:");
        double valorCarro = intup.nextDouble();
        
        // 3º Passo: Leitura do valor total das vendas efetuadas
        System.out.println("Digite o valor total das vendas efeuadas pelo funcionário");
        int vendas = intup.nextInt();
        
        // 4º Passo: Leitura do salário fixo
        System.out.println("Digite o valor do salário fixo do funcionário: ");
        int salarioFixo = intup.nextInt();
        
        // 5º Passo: Definição da fórmula do salário final
        double salarioFinal;
        salarioFinal = (carrosVendidos * valorCarro) + (vendas * 0.05) + salarioFixo;
        
        // 6º Passo: Saída do resultado
        System.out.println("O salário final do Funcionário é: " + salarioFinal);
        
    }
    
}
