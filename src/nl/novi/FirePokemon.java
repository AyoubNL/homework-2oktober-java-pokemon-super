package nl.novi;

public class FirePokemon extends Pokemon {

    private int heat;
    private int waterresistance;

    public FirePokemon(String name, int level, int hp, int heat, int waterresistance) {
        super(name, level, hp);
        super.setType("Fire");

        this.heat = heat;
        this.waterresistance = waterresistance;
    }

    @Override
    public void speaks() {
        System.out.println(super.getName() + " speaks " +super.getType()+ " language.");
    }


    public void flameThrower(int heat){
        if (heat > 20){
            System.out.println("You will feel my flames");
        }
        else {
            System.out.println("No damage done");
        }
    }

    public void waterDefense(int waterresistance){
        if(waterresistance <50){
            System.out.println(super.getName() + " has been damaged");
            damage(50);
        }
        else {
            System.out.println(super.getName() + " can resist water because it is a " + super.getType()+ " pokemen");
        }
    }

    public int getHeat() {
        return heat;
    }

    public void setHeat(int heat) {
        this.heat = heat;
    }

    public int getWaterresistance() {
        return waterresistance;
    }

    public void setWaterresistance(int waterresistance) {
        this.waterresistance = waterresistance;
    }


}
