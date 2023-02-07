import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class AsciiObserver implements PropertyChangeListener {
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        int val = (int) evt.getNewValue();
        char output = (char) val;
        System.out.println("Tha char value : " + output);
    }
}
