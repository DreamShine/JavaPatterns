package ManualObserverExample;

/**
 * Created by DreamShine on 11/10/2016.
 */
public class PersonOnJupiter implements Observer
{
    private Float mass;
    private Float gravityOnJupiter;
    private Float weightOnJupiter;

    private PersonData personData;

    public PersonOnJupiter(PersonData personData)
    {
        this.personData = personData;
        this.gravityOnJupiter = 24.79F;
        personData.registerObserver(this);
    }

    public void update(Float mass) {
        this.mass = mass;
        this.weightOnJupiter = mass * gravityOnJupiter;
        displayWeightSpecs();
    }

    private void displayWeightSpecs() {
        System.out.println("The weight of this person on Jupiter is: "+weightOnJupiter);
    }
}
