package aula12;

public class StandartCostCalculator implements IContactCostCalculator{

    private double valor;

    
    public StandartCostCalculator() {
        this.valor = 0;
    }


    public double calculateCost(double units, ContactType type){
       
        if(type == ContactType.EMAIL){
            valor += units;
        }
        else{
            valor += (units * 0.10);
        }   

        return valor;
    }

    
    
}
