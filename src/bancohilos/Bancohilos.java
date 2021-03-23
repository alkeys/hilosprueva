package bancohilos;

public class Bancohilos {

    public static void main(String[] args) {
        cuentas xD = new cuentas();
        for (int i = 0; i < 100; i++) {
            eje r = new eje(xD, i, 2000);
            r.start();
        }

    }

}

class eje extends Thread {

    public eje(cuentas c, int cuenta0, double max) {
        banco = c;
        cue0 = cuenta0;
        cantida = max;
    }

    private cuentas banco;
    private int cue0;
    private int paracuenta;
    private double cantida;

    @Override
    public void run() {

        while (true) {
            paracuenta = (int) (Math.random() * 100);
            double cantida = this.cantida * Math.random();
            banco.cuentasorigen(cue0, paracuenta, cantida);
            try {
                Thread.sleep((int) Math.random() * 10);
            } catch (InterruptedException e) {
            }
        }

    }

}
