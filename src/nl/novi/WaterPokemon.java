package nl.novi;

public class WaterPokemon extends Pokemon {
    boolean sunlight;
    int fireresistance;

    public WaterPokemon(String name, int level, int hp, boolean sunlight, int fireresistance) {
        super(name, level, hp);
        super.setType("Water");

        this.sunlight = sunlight;
        this.fireresistance = fireresistance;
    }

    @Override
    public void speaks() {
        System.out.println(super.getName() + " speaks " + super.getType());
    }

    public void sun() {
        if (sunlight) {
            System.out.println(super.getName() + " cannot handle sunlight");
            damage(50);
        } else {
            System.out.println(super.getName() + " likes sunlight");
        }
    }

    public void fireDefense(int fireresistance){
        if(fireresistance <50){
            System.out.println(super.getName() + " has been damaged");
            damage(50);
        }
        else {
            System.out.println(super.getName() + " can resist water because it is a " + super.getType()+ "pokemen");
        }
    }

    public boolean getSunlight() {
        return sunlight;
    }

    public void setSunlight() {
        this.sunlight = sunlight;
    }

    public int getFireresistance(){
        return fireresistance;
    }

    public void setFireresistance(int fireresistance){
        this.fireresistance = fireresistance;
    }




}
