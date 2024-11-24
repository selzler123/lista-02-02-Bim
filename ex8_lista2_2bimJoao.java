
package llista2_2bimestre;


public class ex8_lista2_2bimJoao {
    public static void main (String[]args){
        System.out.println(verificaNcmInformatica("84713010")); 
        System.out.println(verificaNcmInformatica("85171000")); 
        System.out.println(verificaNcmInformatica("87032300")); 
        System.out.println(verificaNcmInformatica("12345678"));
    } 
     public static boolean verificaNcmInformatica(String ncm) {
        
        if (ncm != null && ncm.length() == 8 && ncm.matches("\\d+")) {
            
            String prefixo = ncm.substring(0, 2);
            return prefixo.equals("84") || prefixo.equals("85");
        }
        return false;
        
          
    }
}
