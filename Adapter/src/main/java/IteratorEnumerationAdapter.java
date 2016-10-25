import java.util.Enumeration;
import java.util.Iterator;

/**
 * Created by DreamShine on 24/10/2016.
 */
public class IteratorEnumerationAdapter implements Enumeration {

    Iterator iterator;

    public IteratorEnumerationAdapter(Iterator iterator)
    {
        this.iterator = iterator;
    }
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    public Object nextElement() {
        return iterator.next();
    }

    public void remove()
    {
        throw new UnsupportedOperationException();
    }
}
