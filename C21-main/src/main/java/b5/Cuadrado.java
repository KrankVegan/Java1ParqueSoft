package b5;

public class Cuadrado implements IFigura {

    int lado;
    int area;
    @Override
    public void area() {
        area=lado*lado;
    }
}
