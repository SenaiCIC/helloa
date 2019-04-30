
package aula06;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite as 4 notas");
        double nota1 = sc.nextDouble()
        double nota2 = sc.nextDouble();
        double nota3 = sc.nextDouble();
        double nota4 = sc.nextDouble();
        double media = (nota1+nota2+nota3+nota4)/4;
        System.out.println("Sua média é "+media);
        if (media<5){
        System.out.println("Reprovado");
        }
        if (media>=5&&media<6){
        System.out.println("Recuperação");
        }
        if (media>6&&media<9){
        System.out.println("Aprovado");
        }
        if (media>=9){
        System.out.println("PARABÉNS, super aprovado!!!!!!");
        }
        
        
        sc.close();
    }
}
