package Exames.a22_23;

public class TentSpace extends CampingSpace{
    private static int duracaoMaxima = 10;

    public TentSpace(String localizacao, int[] dimensoes, double precoDia) {
        super(localizacao, dimensoes, precoDia);
    }

    public static int getDuracaoMaxima() {
        return duracaoMaxima;
    }

    public static void setDuracaoMaxima(int duracaoMaxima) {
        TentSpace.duracaoMaxima = duracaoMaxima;
    }

    @Override
    public SpaceType getType(){
        return SpaceType.TENT;
    }
    
}
