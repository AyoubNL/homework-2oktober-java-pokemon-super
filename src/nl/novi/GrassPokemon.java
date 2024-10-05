package nl.novi;

public class GrassPokemon extends Pokemon {
    boolean grassTerrain;
    boolean rain;

    public GrassPokemon(String name, int level, int hp, boolean grassTerrain, boolean rain) {
        super(name, level, hp);
        super.setType("Water");

        this.grassTerrain = grassTerrain;
        this.rain = rain;
    }

    @Override
    public void speaks() {
        System.out.println(super.getName() + " speaks " + super.getType() + " language.");
    }

    public void terrain(boolean grassTerrain){
        if(grassTerrain){
            System.out.println(super.getType() + " pokemon handle this terrain really good.");
        }
        else{
            System.out.println(super.getType() + "pokemon handle this terrain really bad.");
        }
    }

    public void weather(boolean rain){

        if(rain){
            System.out.println(super.getName() + " really like rainy weather.");
        }
        else{
            System.out.println(super.getName() + " doesn't like the weather.");
        }

    }

    public boolean getGrassTerrain() {
        return grassTerrain;
    }

    public void setGrassTerrain(boolean grassTerrain) {
        this.grassTerrain = grassTerrain;
    }

    public boolean getRain(){
        return rain;
    }

    public void setRain(boolean rain){
        this.rain = rain;
    }

    public String toString(){
        return super.getName()+ " - " +super.getType() +" pokemon";
    }

}
