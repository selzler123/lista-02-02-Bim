package llista2_2bimestre;

import java.util.Arrays;

public class ex4_lista2_2bimJoao {
    public static void main(String[]args){
        
        int [] vetor = {5, 2, 3, 1, 4};
        Arrays.sort(vetor);
        ordena_vetor(vetor);        
        
    }
  public static void ordena_vetor(int [] vetor){
      
      
      if (vetor == null || vetor.length == 0){
          System.out.println("O vetor está vazio. ");
          return;
      }
      System.out.print("Elementos do vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]);  
            if (i < vetor.length - 1) {
                System.out.print(", ");  
            
          }
      }
      
  }
}
