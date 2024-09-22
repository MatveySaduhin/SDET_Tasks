public abstract class Pet {

    private String breed;
    private String name;
    private String color;
    protected int weight;

    static String homeCountry = "Russia";

    public void setBreed(String breed) {
        this.breed = breed;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getBreed() {
        return breed;
    }
    public String getName() {
        return name;
    }
    public int getWeight() {
        return weight;
    }
    public String getColor() {
        return color;
    }


    public void sayNameAndWeight(){
        System.out.println("My name is " + name + " and I weight " + weight + " kg");
    }

    static public void sayMyCountry(){
        System.out.println("I from " + homeCountry);
    }


}
