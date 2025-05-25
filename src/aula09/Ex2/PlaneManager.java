package aula09.Ex2;

import java.util.ArrayList;

public class PlaneManager {
    private ArrayList<Plane> frota;

    public PlaneManager() {
        this.frota = new ArrayList<>();
    }

    public void addPlane(Plane plane){
        frota.add(plane);
    }

    public void removePlane(String id){
        for(Plane p: frota){
            if(p.getIdentificadorUnico().equals(id)){
                frota.remove(p);
                break;
            }
        }
    }

    public Plane searchPlane(String id){
        for(Plane p: frota){
            if(p.getIdentificadorUnico().equals(id)){
                return p;
            }
        }
        return null;
    }

    public void printAllPlanes(){
        for(Plane p:frota){
            System.out.println(p.toString());
        }
    }

    public void printCommercialPlanes(){
        for(Plane p: frota){
            if(p instanceof CommercialPlane){
                System.out.println(p.toString());
            }
        }
    }

    public void printMilitaryPlanes(){
        for(Plane p: frota){
            if(p instanceof MilitaryPlane){
                System.out.println(p.toString());
            }
        }
    }

    public Plane getFastestPlane(){
        Plane maisRapido = frota.get(0);
        for(Plane p:frota){
            if(maisRapido.getVelocidadeMaxima()<p.getVelocidadeMaxima()){
                maisRapido = p;
            }
        }
        return maisRapido;
    }
}
