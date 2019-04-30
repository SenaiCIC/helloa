package Aula04;

public class Operadoresatribuição {
    public static void main(String[] args) {
        
        int a = 10;
        int result = 0;
        a += 5;
        System.out.println(a + " " + result);
        System.out.println(a -= 2);
        System.out.println(a *= 3);
        
        a++;
        System.out.println(a);
        int b = ++a;
        System.out.println(b +" "+ a);
        int c = 10;
        int d = 5;
        boolean  result;
        result = c>d;
        System.out.println(result);
        result = c<d;
        System.out.println(result);
        result = c>= d;
        System.out.println(result);
        result = d>=e;
        System.out.println(result);
        result = d==e;
        
    }
}