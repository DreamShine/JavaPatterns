package ManualObserverExample;

/**
 * Created by DreamShine on 11/10/2016.
 */
public class PersonOnMars implements Observer
{
    private PersonData personData;
    private Float personWeight;
    private Float gravityOnMars;
    private Float weightOnMars;

    public PersonOnMars(PersonData personData)
    {
        this.personData = personData;
        this.gravityOnMars = 3.711F;
        personData.registerObserver(this);
    }

    public void update(Float personWeight) {
        Float mass = personWeight;
        this.personWeight = mass;
        this.weightOnMars = gravityOnMars * mass;
        displayWeightSpecs();
    }

    private void displayWeightSpecs() {
        System.out.println("The weight of this person on Mars is: "+personWeight);
    }


}
