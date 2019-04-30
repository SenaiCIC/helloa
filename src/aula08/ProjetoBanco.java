
package aula08;

import java.util.Scanner;


public class ProjetoBanco {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Bem Vindo Ao Banco");
        System.out.println("Coloque seu nome:");
        String nome = sc.nextLine();
        System.out.println("Digite o quanto quer depositar:");
        double saldo = sc.nextDouble();
        System.out.println("___________________________");
        System.out.println("|    Bem vindo ""    |");
        System.out.println("|   *Escolha uma opção*   |");
        System.out.println("|                         |");
        System.out.println("|1- NOVO DEPÓSITO         |");
        System.out.println("|2- SAQUE                 |");
        System.out.println("|3- SALDO                 |");
        System.out.println("|_________________________|");
        int x = sc.nextInt();
        switch (x){
            case 1:
                System.out.println("Qual é o valor do novo depósito?");
                double novodeposito = sc.nextDouble(); 
                saldo = (saldo + novodeposito);
                System.out.println("Seu Saldo é "+saldo);
                break;
            
            case 2:
                System.out.println("Qual é o Valor que você deseja sacar?");
                double saque = sc.nextDouble();
                saldo = (saldo - saque);
                System.out.println("Seu Saldo é "+saldo);
            break;
            case 3:
                System.out.println("Seu Saldo é "+saldo);
                break;
            
            
            
            
            
            
            
            
            
            
            
            
            
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   
}
