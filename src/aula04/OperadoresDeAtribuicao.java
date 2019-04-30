package aula04;

public class OperadoresDeAtribuicao {
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
        boolean resul;
        resul = a>b;
        System.out.println(resul);
        resul = s<b;
        System.out.println(resul);
        resul = c>=d;
        System.out.println(resul);
        resul = d>=e;
        System.out.println(resul);
        resul = d==e;