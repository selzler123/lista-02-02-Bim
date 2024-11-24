
package llista2_2bimestre;


public class ex9_lista2_2bimJoao {
     public static void main(String[] args) {
        
        System.out.println(transformarNome("Gabriel", 1997));
        System.out.println(transformarNome("Joana", 2000));
        
        
    }
     public static boolean isPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

 
    public static String transformarNome(String nome, int anoNascimento) {

        boolean anoPrimo = isPrimo(anoNascimento);
        
        StringBuilder nomeTransformado = new StringBuilder();

        for (int i = 0; i < nome.length(); i++) {
            char c = nome.charAt(i);

            if (anoPrimo) {
                if (c == 'A' || c == 'a') {
                    nomeTransformado.append('@');
                } else if (c == 'E' || c == 'e') {
                    nomeTransformado.append('!');
                } else {
                    nomeTransformado.append(c);
                }
            } else {
                if (c == 'E' || c == 'e') {
                    nomeTransformado.append('#');
                } else if (c == 'O' || c == 'o') {
                    nomeTransformado.append('*');
                } else {
                    nomeTransformado.append(c);
                }
            }
        }
        return nomeTransformado.toString();
    }
}
