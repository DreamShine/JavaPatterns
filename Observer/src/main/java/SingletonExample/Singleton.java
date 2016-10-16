package SingletonExample;

/**
 * Created by DreamShine on 16/10/2016.
 */
public class Singleton {

    private static Singleton uniqueInstance = new Singleton();
    private void Singleton()
    {

    }

    public static synchronized Singleton getInstance()
    {
        return uniqueInstance;
    }
}
