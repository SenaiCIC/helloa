
package aula05;

import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {
        System.out.println("Digite um número inteiro");   
        Scanner sc = new Scanner (System.in);
            int x = sc.nextInt();
        System.out.println("Você digitou o número:"+x);
        sc.close();
    }
    
    
}
