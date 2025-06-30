public class StandardConcertProfitCalculator implements IConcertProfitCalculator {
    public double calculateConcertProfit(Concert c){
        double custo = 1500*(c.getDuracao()/60);

        if(!c.getPais().equals("Portugal")){
            custo = custo *2;
        }
        if(!(c.getPais().equals("Portugal")||c.getPais().equals("Espanha"))){
            custo += 800;
        }
        return custo;

    }
    
}
