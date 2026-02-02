public class Plant {
    int numWeeksOld;
    String color;
    boolean isEdible;

    public Plant(int pnumWeeksOld, String pcolor, boolean pisEdible){
        numWeeksOld=pnumWeeksOld;
        color=pcolor;
        isEdible=pisEdible;

    }

    public void printInfo(){
        System.out.println("Number of Weeks old: "+numWeeksOld);
        System.out.println("Color: "+color);
        System.out.println("Is Edible: "+isEdible);
    }
}




