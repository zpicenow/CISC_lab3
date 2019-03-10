package cisc181.lab_3;

/**
 * a class to represent a dog for an online game
 *
 *
 */
public class Dog {
    private String name;
    private String furColor;

    /**
     * no parameter constructor
     */
    public Dog() {
        name = "Spot";
        furColor = "brown";
    }

    /**
     * constructor with 2 parameters
     * @param name name of the dog
     * @param furColor furColor of the dog
     */
    public Dog(String name, String furColor) {
        this.name = name;
        this.furColor = furColor;
    }

    /**
     * accessor methods
     * @return name of dog
     */
    public String getName() {
        return name;
    }

    /**
     * accessor methods
     * @return furColor of the dog
     */
    public String getFurColor() {
        return furColor;
    }

    /**
     * returns the word ‘woof’ when called.
     * @return "woof"
     */
    public String bark() {
        return "woof";
    }

    /**
     * returns ‘zzz’ when called
     * @return "zzz"
     */
    public String sleep(){
        return "zzz";
    }

    /**
     * returns ‘wagging tail’ when called.
     * @return "wagging tail"
     */
    public String wagTail(){
        return "wagging tail";
    }

    /**
     * Override the toString() method and return a string
     * @return dog's name with furColor
     */
    @Override
    public String toString() {
        return name + " with "+ furColor + " fur";
    }

    /**
     * main method that creates an instance of this class with the name ‘Rover’ and ‘white’ fur
     *
     */
    public static void main(String[] args) {
        Dog dog = new Dog("Rover", "white");
        System.out.println(dog.bark());
        System.out.println(dog.sleep());
        System.out.println(dog.wagTail());
        System.out.println(dog);
    }

}
