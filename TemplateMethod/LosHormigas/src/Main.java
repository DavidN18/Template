public class Main {

    public static void main(String [] args){

        Marmol pedido1 = new Marmol();
        Cantera pedido2 = new Cantera();

        pedido1.elaboracion();
        System.out.println("-------------------------------");
        pedido2.elaboracion();

    }

}
