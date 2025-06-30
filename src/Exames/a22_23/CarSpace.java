package Exames.a22_23;

public class CarSpace  extends CampingSpace{
    private static int duracaoMaxima = 3*30;

    public CarSpace(String localizacao, int[] dimensoes, double precoDia) {
        super(localizacao, dimensoes, precoDia);
    }

    public static int getDuracaoMaxima() {
        return duracaoMaxima;
    }

    public static void setDuracaoMaxima(int duracaoMaxima) {
        CarSpace.duracaoMaxima = duracaoMaxima;
    }    

    @Override
    public SpaceType getType(){
        return SpaceType.CAR;
    }
    
}
