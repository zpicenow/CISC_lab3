package cisc181.lab_3;

/**
 * the flea that will be attached to new type of dog
 */
public class Flea {


    private DogWithFlea owner;

    /**
     * constructor that accepts a DogWithFlea object and assigns it to owner
     * @param owner its owner
     */
    public Flea(DogWithFlea owner) {
        this.owner = owner;
    }

    /**
     * method biteOwner() that when called sets its owner’s newFleaBite property to true.
     */
    public void biteOwner(){
        owner.setNewFleaBite(true);

    }
}
