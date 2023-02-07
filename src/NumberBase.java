import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class NumberBase {
    //NumberBase is the subject and has a property whose change needs support.
    private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);

    //The subject registers listeners that want to know when its property changes
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        this.pcs.addPropertyChangeListener(listener);
    }

    //The subject removes listeners when needed
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        this.pcs.removePropertyChangeListener(listener);
    }

    //The property that may change
    private int value;

    //Getter for property
    public int getValue() {
        return this.value;
    }

    //Setter for property which notifies listeners
    public void setValue(int newValue) {
        int oldValue = this.value;
        this.value = newValue;
        this.pcs.firePropertyChange("value", oldValue, newValue);
    }
}
