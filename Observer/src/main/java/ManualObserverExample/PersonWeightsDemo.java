package ManualObserverExample;

/**
 * Created by DreamShine on 11/10/2016.
 */
public class PersonWeightsDemo
{
    public static void main(String[] args) {
        PersonData personData = new PersonData();
        PersonOnJupiter personOnJupiter = new PersonOnJupiter(personData);
        PersonOnMars personOnMars = new PersonOnMars(personData);

        personData.setPersonSpecifications(60.20F);
        personData.setPersonSpecifications(100.30F);

    }
}
