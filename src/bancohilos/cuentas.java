package bancohilos;

public class cuentas {

    private double dinero;
    private double[] cuentas;

    public cuentas() {
        cuentas = new double[100];
    }

    public void inicio() {

        for (int i = 0; i < 100; i++) {
            cuentas[i] = 2000;
        }
    }

    public void cuentasorigen(int cuenta0, int cuentadestino, double dinerotranferncia) {
        if (cuentas[cuenta0] < dinerotranferncia) {
            return;//no haga nada
        }
        double aux, aux2, aux3;
        System.out.println(Thread.currentThread());//muestra el hilo de la tranferencia
        aux = cuentas[cuenta0];
        cuentas[cuenta0] -= dinerotranferncia;//quita el dinero de la cuenta oringen
        aux2 = cuentas[cuenta0];
        cuentas[cuentadestino] += dinerotranferncia;
        aux3 = cuentas[cuentadestino];
        System.out.println("dinero antes =" + aux + "   dinero de restante =" + aux2);
        System.out.println("dinero de cuenta "+aux3);
        System.out.println("el saldo total es"+mostrar());
    }

    
    public double mostrar(){
        double saldo=0;
        for (double cuenta : cuentas) {
            saldo+=cuenta;
        }
        
        return saldo;
    }
    
    
}
