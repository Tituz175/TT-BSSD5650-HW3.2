import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class OctalObserver implements PropertyChangeListener {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        int val = (int) evt.getNewValue();
        String output = Integer.toOctalString(val);
        System.out.println("Octal String: " + output);
    }
}