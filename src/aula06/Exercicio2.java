package aula06;

import java.util.Scanner;


public class Exercicio2 {
    public static void main(String[] args) {
        System.out.println("Digite seu nome");   
        Scanner sc = new Scanner (System.in);
            String x = sc.nextLine();
        System.out.println("Digite sua idade");
            int y = sc.nextInt();
        System.out.println("Digite seu peso");  
            double p = sc.nextDouble();
        System.out.println("Digite sua altura");
            double a = sc.nextDouble();
        double imc = p /(a*a);
        System.out.printf("Seu imc é %.2f%n",imc);
        
        
        
        
    }
    
    
    
    
  
    
}
