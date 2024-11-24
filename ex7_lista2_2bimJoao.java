package llista2_2bimestre;

import java.util.Scanner;

public class ex7_lista2_2bimJoao {
    public static void main(String[] args) {
        String produto = nomeProduto();
        
        if (produto != null){
            System.out.println("Nome do produto valido: " + produto);
        }
        
    }
    public static String nomeProduto(){
       Scanner s = new Scanner(System.in); 
        
        String nome = "";
        
       while (true) {
            System.out.print("Digite um produto: ");
            nome = s.nextLine();

            
            if (nome.length() >= 10) {
              break;
            } else {
                System.out.println("O nome do produto deve ter pelo menos 10 caracteres. Tente novamente.");
            }
        }
         return nome;
    }
}
