package ar.edu.unahur.obj2;

public class GasoleroPlus extends Gasolero {

    @Override
    protected double calcularPropina(double temporal) {
        if (temporal<80)
            return 0;
        return super.calcularPropina(temporal);
    }
}
