public class Cat extends Pet implements IFeedable {

    public Cat(String name, String breed, int weight, String color){
        super();
        setBreed(breed);
        setName(name);
        setWeight(weight);
        setColor(color);
    }

    public void feed(){
        weight++;
    }

    public void petACat(String direction){
        if (direction == "by"){
            System.out.println("mew mew mew");
        }
        else {
            System.out.println("Tshhhh");
        }

    }


}
