//Biblioteca Scanner
import java.util.Scanner;

public class caloriaRefeicao {

    public static void main(String[] args) {
        
        // Objeto Scanner
          Scanner intup = new Scanner(System.in);
        
        // 1º Passo: Leitura do prato
        System.out.println("""
                           Escolha um dos pratos:
                           1- Vegetariano
                           2-Peixe
                           3-Frango
                           4-Carne""");
        int prato = intup.nextInt();
        
        // 2º Passo: Leitura da sobremesa
        System.out.println("""
                           Escolha uma das sobremesas:
                           1- Abacaxi
                           2-Sorvete Diet
                           3-Mousse Diet
                           4-Mousse de Chocolate""");
        int sobremesa = intup.nextInt();
        
        
        // 3º Passo: Leitura da bebida
        System.out.println("""
                           Escolha uma das bebidas:
                           1- Chá
                           2-Suco de Laranja
                           3-Suco de Melão
                           4-Refrigerante Diet""");
        int bebida = intup.nextInt();       
        
        // 4º Passo: Somar calorias do prato
        int caloria;
        caloria = 0;
       
        if(prato == 1){
            caloria = caloria + 180;
        }
        
        if(prato == 2){
            caloria = caloria + 230;
        }
        
        if(prato == 3){
            caloria = caloria + 250;
        }
        
        if(prato == 4){
            caloria = caloria + 350;
        }
        
        // 5º Passo: Somar calorias da sobremesa
        if(sobremesa == 1){
            caloria = caloria + 75;
        }
        
        if(sobremesa == 2){
            caloria = caloria + 110;
        }
        
        if(sobremesa == 3){
            caloria = caloria + 170;
        }
        
        if(sobremesa == 4){
            caloria = caloria + 200;
        }
        
        // 6º Passo: Somar calorias da bebida
        if(bebida == 1){
            caloria = caloria + 20;
        }
        
        if(bebida == 2){
            caloria = caloria + 70;
        }
        
        if(bebida == 3){
            caloria = caloria + 100;
        }
        
        if(bebida == 4){
            caloria = caloria + 65;
        }
        
        // 7º Passo: Saída do resultado
        System.out.println("O Total de Calorias de sua Refeição é: " + caloria);
    }
    
}
