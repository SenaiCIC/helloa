
package aula06;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
        System.out.println(" que horas vem o bonde?");
        int hora = sc.nextInt();
        if (hora<12){
        System.out.println("Então, bom dia");
        }
        if (hora>=12&&hora<18){
            System.out.println("Então, Boa tarde");
    }
        if (hora>=18){
            System.out.println("Então, Boa noite");    
        }
sc.close();
    
   
   
   
   
   
}
}
