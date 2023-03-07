public class Cofee extends CaffeineBeverage{
    @Override
    void brew() {
        System.out.println("Dripping coffe through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}
