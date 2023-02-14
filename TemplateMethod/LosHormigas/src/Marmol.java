public class Marmol extends PaqueteDecoracion{
    @Override
    void cortarMedida() {
        System.out.println("Laminas cortadas a 20 x 40");
    }

    @Override
    void darAcabado() {
        System.out.println("Materinado Listo!");
    }
}
