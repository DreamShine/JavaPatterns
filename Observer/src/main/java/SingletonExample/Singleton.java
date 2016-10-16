package SingletonExample;

/**
 * Created by DreamShine on 16/10/2016.
 */
public class Singleton {

    private static Singleton uniqueInstance;
    private void Singleton()
    {

    }

    public static Singleton getInstance()
    {
        if(uniqueInstance == null)
        {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
