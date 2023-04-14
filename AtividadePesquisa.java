package atividadepesquisa;

// Biblioteca Scanner
import java.util.Scanner;


public class AtividadePesquisa {

    public static void main(String[] args) {
        
        // Objeto Scanner
        Scanner intup = new Scanner(System.in);
        
        System.out.println("Bem-vindo(a)! Responda aos dados da Pesquisa Demográfica:");
        
        double idade = 0;
        double totalPessoas = 0;
        double perfilDesejado = 0;
        double porcentagem = 0;
         
        // 1º Passo: Criar um Loop
        while(idade != -1){
            
            idade = 0;
            char sexo = 0;
            char corOlhos = 0;
            char corCabelo = 0;
            double salario = -1;
            
            // 2º Passo: Leitura do Sexo
            while(sexo != 'f' && sexo != 'm'){
                
                System.out.println("\nInsira o seu sexo (f/m): ");
                sexo = intup.next().charAt(0);
                
                // Mensagem de Erro
                if(sexo != 'f' && sexo != 'm'){
                    
                    System.out.println("\nSexo Inválido! Tente novamente!");
                    
                }
                
            }
                
            // 3º Passo: Leitura da Cor do Olho
            while(corOlhos != 'a' && corOlhos != 'v' && corOlhos != 'c' && corOlhos != 'p'){
                
                System.out.println("\nInsira a cor dos seus olhos:\n a(azul)\n v(verde)\n c(castanho)\n p(preto)");
                corOlhos = intup.next().charAt(0);
                
                // Mensagem de Erro
                if(corOlhos != 'a' && corOlhos != 'v' && corOlhos != 'c' && corOlhos != 'p'){
                    
                    System.out.println("\nCor dos olhos inválida. Tente novamente!");
                    
                }
                
            }
            
            // 5º Passo: Leitura da Cor do Cabelo
            while(corCabelo != 'l' && corCabelo != 'c' && corCabelo != 'p' && corCabelo != 'r'){
                
                System.out.println("\nInsira a cor dos seus cabelos:\n l(loiro)\n c(castanho)\n p(preto)\n r(ruivo)");
                corCabelo = intup.next().charAt(0);
                
                // Mensagem de Erro
                if(corCabelo != 'l' && corCabelo != 'c' && corCabelo != 'p' && corCabelo != 'r'){
                    
                    System.out.println("\nCor do cabelo inválida. Tente novamente!");
                    
                }
             
            }    
            
            // 6º Passo: Leitura da Salário
            while(salario < 0){
                
                System.out.println("\nInsira o seu salário: ");
                salario = intup.nextDouble();
                
                // Mensagem de Erro
                if(salario < 0){
                    
                    System.out.println("\nO Salário não pode ser negativo. Tente novamente!");
                
                }
        
            }
            
            // 7º Passo: Leitura da Idade
            while(idade < 10 || idade > 100){
                
                System.out.println("\nInsira a sua idade: ");
                idade = intup.nextDouble();
                
                // Break
                if(idade == -1){
                    
                    break;
                    
                }
                
                // Mensagem de Erro
                if(idade < 10 || idade > 100){
                    
                    System.out.println("\nA idade precisa ser entre 10 e 100 anos. Tente novamente!");
                
                }
        
            }
            
            // 8º Passo: Adicionar Pessoa ao Total de Pessoas
            totalPessoas++;
            
            // 9º Passo: Adicionar Perfil Desejado ao Total
            if(sexo == 'f' && idade > 18 && idade < 35 && corOlhos == 'c' && corCabelo == 'c'){
                perfilDesejado++;
            }
            
            // 10º Passo: Fórmula de %
            porcentagem = perfilDesejado / totalPessoas * 100;
            
        }
        
        // 11º Passo: Mostrar resultado
            System.out.println("\nNúmero total de pessoas entrevistadas: " + totalPessoas
                             + "\nPessoas com o perfil desejado: " + perfilDesejado
                             + "\nPorcentagem do perfil desejado: " + porcentagem);
        
    }  
  
}
    

