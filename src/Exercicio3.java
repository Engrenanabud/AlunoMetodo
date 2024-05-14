import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Aluno aluno = new Aluno();
        System.out.println("Entre com o nome do Aluno");
        aluno.nome = scan.next();

        System.out.println("Entre com o nome do Curso");
        aluno.nomeDoCurso = scan.next();

        System.out.println("Entre com a matrícula");
        aluno.matricula = scan.next();


        for ( int i =0; i<aluno.nomeDisciplinas.length; i++){
            System.out.println("Entre com nome da disciplina " + i);
            aluno.nomeDisciplinas[i] = scan.next();
        }

        for ( int i =0; i<aluno.notasDisciplinas.length; i++){
            System.out.println("Obtendo notas das disciplinas: " + aluno.nomeDisciplinas[i]);
            for (int j = 0; j<aluno.notasDisciplinas[i].length; j++){
                System.out.println("Entre com a nota " + (j+1));
                aluno.notasDisciplinas [i][j] = scan.nextDouble();
            }
        }
            System.out.println(aluno);
    }
}
