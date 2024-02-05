package b5;

public class Circulo implements IFigura {

    int area;
    int RADIO;

    @Override
    public void area() {
        Math.pow(Math.PI*RADIO,2);
    }
}
