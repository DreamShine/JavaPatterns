/**
 * Created by DreamShine on 16/10/2016.
 */
public class Singleton
{
    private static Singleton uniqueInstance = new Singleton();

    private  Singleton()
    {

    }
    public static Singleton getInstance()
    {
        return uniqueInstance;
    }

}
