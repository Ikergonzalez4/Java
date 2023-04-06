public class Movil {

    String marca;
    String modelo;
    String color;
    int numCamara;
    int numSim;

    // constructor con sim
    public Movil (String marca , String modelo , String color , int numCamara , int numSim){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.numCamara = numCamara;
        this.numSim = numSim;
    }
    // constructor sin sim
    public Movil (String marca , String modelo , String color , int numCamara){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.numCamara = numCamara;
    }

}
