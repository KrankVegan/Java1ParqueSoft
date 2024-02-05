package b2;


//Crear un objeto que materialize un celular
public class Trabajo2 {


    Trabajo2(int dayused, int megapixeles){
        this.dayused = dayused;
        this.megapixeles = megapixeles;
    }


    private  float alturacm;
    private  int dayused;
    private  String marca;
    private  boolean fiveg;
    private  float bateria;
    private  String numero;
    private float anchuracm;
    private boolean newornot;
    private boolean importedornot;
    private int megapixeles;

    public void llamar(){
        System.out.println("llamar.");
    }

    private void textear(){
        System.out.println("textear.");
    }

    public int getDayused() {
        return dayused;
    }

    public void setFiveg(boolean fiveg) {
        this.fiveg = fiveg;
    }

    public int getMegapixeles() {
        return megapixeles;
    }
}

