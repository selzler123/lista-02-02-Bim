package llista2_2bimestre;

public class ex2_lista2_2bimJoao {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5};  
        imprime_vetor_int(vetor);       
    }

    
    public static void imprime_vetor_int(int[] vetor) {
        
        if (vetor == null || vetor.length == 0) {
            System.out.println("O vetor está vazio.");
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
