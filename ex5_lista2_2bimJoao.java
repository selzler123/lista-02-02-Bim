package llista2_2bimestre;



public class ex5_lista2_2bimJoao {
    public static void main(String[] args) {
        
        int [][] matriz = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        
        somar_matriz(matriz);
    }
    public static void somar_matriz(int [][] matriz){
    
             if (matriz == null || matriz.length == 0){
                 System.out.println("A matriz está vazia: ");
                 return ;
             }
             for (int i = 0; i < matriz.length; i++) {
                 int soma = 0;
                
             for (int j = 0; j < matriz[i].length; j++) {
                 soma += matriz [i][j];
                 
             }
                 System.out.println("Soma da linha " + (i + 1) + ": " + soma);
             }
        }
   
    }  

