public class Dog extends Pet implements IFeedable, IGroomable {

    public Dog(String name, String breed, int weight, String color){
        super();
        setBreed(breed);
        setName(name);
        setWeight(weight);
        setColor(color);
    }

    public void voice(){
        System.out.println("Gaf");
    }

    public void feed(){
        weight =+ 2;
    }

    public void groom(){
        weight--;
    }


}
