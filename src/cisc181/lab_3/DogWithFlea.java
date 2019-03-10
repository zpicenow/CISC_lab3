package cisc181.lab_3;

/**
 * the new type of dog that can have a flea attached to its fur.
 *
 * DogWithFlea   is-a   Dog?
 * DogWithFlea   has-a  Flea?
 */
public class DogWithFlea extends Dog {
    private boolean newFleaBite;
    private Flea flea;

    /**
     * constructors accept no parameters
     */
    public DogWithFlea() {
        super();
        newFleaBite = false;
        flea = new Flea(this);
    }

    /**
     * constructors accept a name and a fur color
     * @param name name of the dog
     * @param furColor color of the dog's furColor
     */
    public DogWithFlea(String name, String furColor) {
        super(name, furColor);
        newFleaBite = false;
        flea = new Flea(this);
    }

    /**
     * An accessor method named hasNewFleaBite() that returns the value assigned to newFleaBite
     * @return the value assigned to newFleaBite
     */
    public boolean hasNewFleaBite() {
        return newFleaBite;
    }

    /**
     * An accessor method named getFlea() that returns the flea object
     * @return the flea object
     */
    public Flea getFlea() {
        return flea;
    }

    /**
     * mutator method named setNewFleaBite
     * @param newFleaBite if has new fleabite
     */
    public void setNewFleaBite(boolean newFleaBite) {
        this.newFleaBite = newFleaBite;
    }

    /**
     * check to see if there is a new flea bite
     * @return "" if there is not
     *          "scratching" there are fleabite
     */
    public String scratch(){
        if (newFleaBite) {
            newFleaBite = false;
            return "scratching";
        } else {
            return "";
        }

    }

    /**
     * check to see if there is a new flea bite
     * @return "scratching wagging tail"
     *          "wagging tail"
     */
    @Override
    public String wagTail() {
        if (newFleaBite) {
            return scratch() + " " + super.wagTail();
        } else {

            return super.wagTail();
        }
    }

    /**
     * check to see if there is a new flea bite
     * @return scratching zzz
     *          zzz
     */
    @Override
    public String sleep() {
        if (newFleaBite) {
            return scratch() + " " + super.sleep();
        } else {

            return super.sleep();
        }
    }

    /**
     * Override the toString method
     * @return  base class’ toString and then concatenate ‘ and a flea’
     */
    @Override
    public String toString() {
        return super.toString() + " and a flea";
    }
}
