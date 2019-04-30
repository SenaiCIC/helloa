
package aula05;

import java.util.Scanner;

public class Exercico1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            System.out.println("Digite um número");
            int x = sc.nextInt();
            System.out.println("Digite mais um número");
            int y = sc.nextInt();
            
            System.out.println( "A soma dos números é: " + (x+y) );
        }
        
   
 
    
    

}
}
