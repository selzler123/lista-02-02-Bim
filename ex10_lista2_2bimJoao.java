
package llista2_2bimestre;


public class ex10_lista2_2bimJoao {
     public static void main(String[] args) {
     String[][] alunos = {
            {"Ana Clara Silva", "123456"},
            {"Carlos Alberto Souza", "234567"},
            {"Mariana Costa", "345678"},
            {"João da Silva", "456789"},
            {"José Eduardo", "567890"}
        };

        String textoBusca = "João";
       

        String[][] alunosEncontrados = busca_aluno(alunos, textoBusca);
        imprime_matriz(alunosEncontrados);
    }
     public static String[][] busca_aluno(String[][] alunos, String textoBusca) {
        int count = 0;
        for (int i = 0; i < alunos.length; i++) {
            if (existeCorrespondencia(alunos[i][0], textoBusca)) {
                count++;
            }
        }

        String[][] alunosEncontrados = new String[count][2];
        int index = 0;

        for (int i = 0; i < alunos.length; i++) {
            if (existeCorrespondencia(alunos[i][0], textoBusca)) {
                alunosEncontrados[index] = alunos[i];
                index++;
            }
        }

        return alunosEncontrados;
    }
   
    public static boolean existeCorrespondencia(String nome, String textoBusca) {

        for (int i = 0; i <= nome.length() - textoBusca.length(); i++) {
            boolean encontrado = true;
      
            for (int j = 0; j < textoBusca.length(); j++) {
                if (nome.charAt(i + j) != textoBusca.charAt(j)) {
                    encontrado = false;
                    break;
                }
            }

            if (encontrado) {
                return true;
            }
        }
        return false;
    }

    public static void imprime_matriz(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(matriz[i][0] + " - " + matriz[i][1]);
        }
    }
}
