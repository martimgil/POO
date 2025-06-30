package aula06;

public class Aluno extends Pessoa{
    private static int proximoNMec = 100;
    private int NMec;
    private DateYMD dataInscricao;

    public Aluno(String nome, int cc, DateYMD dataNasc, DateYMD dataInscricao) {
        super(nome, cc, dataNasc);
        this.NMec = proximoNMec++;
        this.dataInscricao = dataInscricao;
    }

    public Aluno(String nome, int cc, DateYMD dataNasc) {
        super(nome, cc, dataNasc);
        this.NMec = proximoNMec++;
        java.time.LocalDate today = java.time.LocalDate.now();
        this.dataInscricao = new DateYMD(today.getDayOfMonth(), today.getMonthValue(), today.getYear());
    }

    public int getNMec() {
        return NMec;
    }

    public DateYMD getDataInscricao() {
        return dataInscricao;
    }
} 
