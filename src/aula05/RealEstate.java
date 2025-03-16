package aula05;
import java.util.ArrayList;
import java.util.List;

class RealEstate {
    private List<Properties> properties  = new ArrayList<>();
    
    public void newProperty(String localidade,int quartos, int preco){
        properties.add(new Properties(quartos, localidade, preco));
    }

    public void sell(int id){
        for(int i=0; i<properties.size(); i++){
            Properties Property = properties.get(i);
            if(Property.getId()==id){
                properties.remove(Property);
                System.out.println("Imóvel " + id + " vendido.");
            }
        }
    }

    public void setAuction(int id, DateYMD dataInicio, int duracao) {
        Properties property = null;
    
        for (Properties p : properties) {
            if (p.getId() == id) {
                property = p;
                break;
            }
        }
    
        if (property == null) {
            System.out.println("Imóvel " + id + " não existe.");
            return;
        }
    
        if (!property.isAvailable()) {
            System.out.println("Imóvel " + id + " não está disponível.");
            return;
        }
    
        DateYMD dataFim = new DateYMD(dataInicio.getDay(), dataInicio.getMonth(), dataInicio.getYear());
    
        for (int i = 0; i < duracao; i++) {
            dataFim.increment();
        }
    
        property.setAuction(dataInicio, dataFim);
    }

    @Override
    public String toString() {
        String s = "Propriedades: \n";
        for(Properties property: properties){
            s+=(property.toString() + "\n");
        }

        return s;
    }


}

