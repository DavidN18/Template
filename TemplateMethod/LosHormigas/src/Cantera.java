public class Cantera extends PaqueteDecoracion{
    @Override
    void cortarMedida() {
        System.out.println("Laminas cortadas a 40 x 40");
    }

    @Override
    void darAcabado() {
        System.out.println("Material pulido!");
    }
}
