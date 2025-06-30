package Exames.a23_24;

import java.util.ArrayList;

public class Cinema extends Event{
    private String realizador;
    private int anoLancamento;
    private ArrayList<String> atores;
    public Cinema(String nome, int duracao, String realizador, int anoLancamento) {
        super(nome, duracao);
        this.realizador = realizador;
        this.anoLancamento = anoLancamento;
        this.atores = new ArrayList<>();
    }

    
    
}
