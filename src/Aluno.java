import java.util.Arrays;

public class Aluno {

    String nome;
    String matricula;
    String nomeDoCurso;
    String[] nomeDisciplinas = new String[3]; //
    double [][] notasDisciplinas = new double[3][1];


    public String toString() {

        return "Nome: " + nome + "" + " Matrícula: " + matricula + " Curso: " + nomeDoCurso + " Disciplinas: " + Arrays.toString(nomeDisciplinas) + "notas" + Arrays.deepToString(notasDisciplinas);

    }

}
