package nl.novi;

public class ElectricPokemon extends Pokemon {
    private String sound;
    private String food;
    public ElectricPokemon(String name, int level, int hp, String sound, String food) {
        super(name, level, hp);
        super.setType("Eletric");

        this.sound = sound;
        this.food = food;
    }

    @Override
    public void speaks() {
        System.out.println(super.getName()+ " speaks" + super.getType());
    }

    public void sound(){
        System.out.println("This Pokemon makes "+sound);
    }

    public void eat(){
        System.out.println("This pokemon eats "+food);
    }

    public String getSound(){
      return this.sound;
    }

    public void setSound(String sound){
        this.sound = sound;
    }

    public String getFood(){
        return food;
    }

    public void setFood(String food){
        this.sound = sound;
    }

}
