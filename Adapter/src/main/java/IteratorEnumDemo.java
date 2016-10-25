import java.util.ArrayList;

/**
 * Created by DreamShine on 24/10/2016.
 */
public class IteratorEnumDemo
{
    public static void main(String[] args) {
        ArrayList<String> testList = new ArrayList<String>();
        String tempString = "";
        for(char c = 'a'; c < 'g'; c++)
        {
            tempString += c;
            testList.add(tempString);
        }

        IteratorEnumerationAdapter iteratorEnumeration = new IteratorEnumerationAdapter(testList.iterator());

        testIteratorEnumerationAdapter(iteratorEnumeration);
    }

    private static void testIteratorEnumerationAdapter(IteratorEnumerationAdapter iteratorEnumeration) {
        while(iteratorEnumeration.hasMoreElements())
        {
            System.out.println(iteratorEnumeration.nextElement());
        }
    }

}
