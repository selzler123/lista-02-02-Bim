package llista2_2bimestre;

import java.util.Scanner;

public class Ex1_Lista2_2bimJoao {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Informe 2 números: ");
        double n1 = s.nextDouble();
        double n2 = s.nextDouble();
        System.out.println("O resultado é: " + divisao(n1 , n2));
        
    }
    public static double divisao(double n1, double n2){
      
        if (n1/n2 == 0) return 0;
        else return (n1/n2);
        
    }
}
