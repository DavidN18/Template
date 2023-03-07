public class Main {

    public static void main(String [] args){

        TeaWithHook teaHook = new TeaWithHook();
        CoffeWithHook coffeWithHook = new CoffeWithHook();
        System.out.println("\nMaking tea ...");
        teaHook.prepareRecipe();
        System.out.println("\nMaking coffee ...");
        coffeWithHook.prepareRecipe();
    }

}
