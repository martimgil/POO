package EstudoCasa.MT2_Treino;

public class StandardTravelCostCalculator implements ITravelCostCalculator {
    public double calculateTravelCost(Travel t){
        String[] inicio = t.getInicio().split(",");
        String[] fim = t.getFim().split(",");
        double valor = 0;
        if(inicio[1].equals(fim[1])){
            valor+= (50*t.getDuracao());
        } else{
            valor+=(150*t.getDuracao());
        }
        if(t.getDuracao()<7){
            valor += 75;
        }
        if(t.getId()%10==0){
            valor = valor*0.9;
        }

        return valor;
    }
    
}
