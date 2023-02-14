public abstract class PaqueteDecoracion {

    final void elaboracion(){
        laminar();
        cortarMedida();
        darAcabado();
        empaquetar();
    }

    abstract void cortarMedida();
    abstract void darAcabado();

    public void laminar(){
        System.out.println("Piedra coratda en laminas delgadas");
    }

    public void empaquetar(){
        System.out.println("Paquetes con 5 piezas listos!");
    }

}
