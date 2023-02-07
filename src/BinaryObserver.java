import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class BinaryObserver implements PropertyChangeListener {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        int val = (int) evt.getNewValue();
        String output = Integer.toBinaryString(val);
        System.out.println("Binary String: " + output);
    }
}