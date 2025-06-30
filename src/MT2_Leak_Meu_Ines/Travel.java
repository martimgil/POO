package EstudoCasa.MT2_Treino;
public class Travel {

    private int id;
    private static int NEXT_ID = 0;
    private int duracao;
    private String inicio;
    private String fim;


    public Travel(int duracao, String inicio, String fim) {
        this.id = NEXT_ID++;
        this.duracao = duracao;
        this.inicio = inicio;
        this.fim = fim;
    }

    public Travel(int id, int duracao, String inicio, String fim) {
        this.id = id;
        this.duracao = duracao;
        this.inicio = inicio;
        this.fim = fim;
    }
    
    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public int getDuracao() {
        return duracao;
    }


    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }


    public String getInicio() {
        return inicio;
    }


    public void setInicio(String inicio) {
        this.inicio = inicio;
    }


    public String getFim() {
        return fim;
    }


    public void setFim(String fim) {
        this.fim = fim;
    }


    @Override
    public String toString() {
        return "Travel [id=" + id + ", duracao=" + duracao + ", inicio=" + inicio + ", fim=" + fim + "]";
    }
    
}
