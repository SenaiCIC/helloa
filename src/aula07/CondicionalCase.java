
package aula07;

import java.util.Scanner;

public class CondicionalCase {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            System.out.println("Tecle um número de 1 ate 7");
            int d = sc.nextInt();
            String dsemana;
            switch (d){
                case 1:
                    dsemana= "Domingo";
                    break;
                case 2:
                    dsemana="Segunda";
                    break;
                case 3:
                    dsemana="Terça";
                    break;
                case 4:
                    dsemana="Quarta";
                    break;
                case 5:
                    dsemana="Quinta";
                    break;
                case 6:
                    dsemana="Sexta";
                    break;
                case 7:
                    dsemana="Sábado";
                    break;
                default:
                    dsemana="Número Inválido";
                
            }
            System.out.println(dsemana);
        }
       
       
       
       
       
       
       
       
       
        
    }       
        
        
        
        
        
     
    }
