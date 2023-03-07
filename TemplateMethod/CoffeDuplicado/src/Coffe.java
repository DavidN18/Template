public class Coffe {
    void prepareRecipe(){
        boilWater();
        brewCoffeGrinds();
        pourInCup();
        addSugarAndMilk();
    }
    public void boilWater(){
        System.out.println("Boiling water");
    }
    public void brewCoffeGrinds(){
        System.out.println("Driping coffe through filter");
    }
    public void pourInCup(){
        System.out.println("pouring into cup");
    }
    public void addSugarAndMilk(){
        System.out.println("Adding suggar and milk");
    }

}
