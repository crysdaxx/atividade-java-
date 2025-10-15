class Professor {
    private String nome;

    public Professor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

class Turma {
    private String codigo;
    private Professor professor;

    public Turma(String codigo) {
        this.codigo = codigo;
    }

    public void setProfessor(Professor p) {
        this.professor = p;
    }

    public void resumo() {
        System.out.println("Código da Turma: " + codigo);
        if (professor != null) {
            System.out.println("Professor: " + professor.getNome());
        } else {
            System.out.println("Professor: Nenhum professor .");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Professor professor1 = new Professor("crys dax");

        Turma turma = new Turma("302");
        turma.setProfessor(professor1);

        System.out.println("Resumo inicial:");
        turma.resumo();

        Professor professor2 = new Professor("samara ");
        turma.setProfessor(professor2);

        System.out.println("\nResumo após troca de professor:");
        turma.resumo();
    }
}