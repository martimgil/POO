package Exames.a22_23;

public class CaravanSpace  extends CampingSpace{
    private static int duracaoMaxima = 3*365;

    public CaravanSpace(String localizacao, int[] dimensoes, double precoDia) {
        super(localizacao, dimensoes, precoDia);
    }

    public static int getDuracaoMaxima() {
        return duracaoMaxima;
    }

    public static void setDuracaoMaxima(int duracaoMaxima) {
        CaravanSpace.duracaoMaxima = duracaoMaxima;
    }

    @Override
    public SpaceType getType(){
        return SpaceType.CARAVAN;
    }
    
}
