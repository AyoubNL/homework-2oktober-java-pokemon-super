package nl.novi;
public class Pokemon {
    private String name;
    private int level;
    private String type;
    private int hp;

    public Pokemon(String name, int level , int hp) {
        this.name = name;
        this.level = level;
        this.hp = hp;
    }

    public void speaks(){}

    public void damage(int damage){
        hp -= damage;
        System.out.println(name + " " + " has new health score" + hp);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name = name;
    }

    public String getType() {
        return this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }




}
