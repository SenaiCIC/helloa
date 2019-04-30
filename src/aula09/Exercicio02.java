
package aula09;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quant de num");
        int q = sc.nextInt();
        int c= 0;
        double res = 0;
        while (c<9){
            System.out.println("Digite o "+(c+1)+"°Número");
            double r = sc.nextDouble();
            res = r+res;
                    c++; 
        
        }
        System.out.println(res);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
  
}
