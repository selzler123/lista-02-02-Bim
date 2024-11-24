package llista2_2bimestre;


public class ex3_lista2_2bimJoao {
    public static void main(String[]args){
        String [] vetor = {"João", "Pedro", "Silas"};
        imprime_vetor_string(vetor);
        
    }
    public static void imprime_vetor_string(String [] vetor){
        
        if  (vetor == null || vetor.length == 0) {
            System.out.println("O vetor está vazio.");
            return;  
        }
        System.out.print("Nomes do vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]);  
            if (i < vetor.length - 1) {
                System.out.print(", "); 
        
    
            }
        }  
        System.out.println(); 
    }
}
    