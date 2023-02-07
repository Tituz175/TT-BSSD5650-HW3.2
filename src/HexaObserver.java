import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class HexaObserver implements PropertyChangeListener {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        int val = (int) evt.getNewValue();
        String output = Integer.toHexString(val);
        System.out.println("Hex String: " + output);
    }
}