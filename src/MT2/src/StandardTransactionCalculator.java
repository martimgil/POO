public class StandardTransactionCalculator implements ITransactionCostCalculator {
    
    public double calculateTransactionCost(Transaction t){
        double horasTrabalho = t.getHorasTrabalho();
        double custo = 50*horasTrabalho;
        String diaSemana = t.getDiaDaSemana();
        
        if (diaSemana.equals("SATURDAY") || diaSemana.equals("SUNDAY")) {
            custo *= 2;
        }
        if(diaSemana.equals("WEDNESDAY")){
            custo *= 0.90;
        }

        return custo;
    }


    
}
