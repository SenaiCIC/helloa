
package aula07;

public class OperaçõesComString {
    public static void main(String[] args) {
        String n = " Adailton";
        String nM = n.toUpperCase();
        System.out.println("Maiuscula "+nM);
        String nm = n.toLowerCase();
        System.out.println("Minusculo "+nm);
        String rec = "Senai CIC é o melhor do Brasil";
        String sub = rec.substring(5);
        System.out.println("Sub "+sub);
        String rep = rec.replace("Brasil","Mundo");
        System.out.println("replace "+rep);
        int loc = rec.indexOf("ai");
        System.out.println("Localizado= "+loc);
        loc = rec.lastIndexOf("si");
        System.out.println("Localizado= "+loc);
    
        String sp = "laranja maça banana";
        String [] vect = sp.split(" ");
        String word1 = vect [1];
        String word2 = vect [2];
        String word3 = vect [0];
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);
        
                
                
                
    
    
    }
   





}


