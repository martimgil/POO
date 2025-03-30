package aula07;

public class ObraDigital extends Obra {
    private String blockchain;
    private String contract;

    public ObraDigital(String nome, String autor, int precoBase, String blockchain, String contract) {
        super(nome, autor, precoBase);
        this.blockchain = blockchain;
        this.contract = contract;
    }

    @Override
    public String toString() {
        return "Blockchain: " + blockchain + " Contrato" + contract + " ";
    }

    
    
    

    
}
