import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class Collection implements Iterable<Contact>{

    ArrayList<Contact> curContact = new ArrayList<>();

    void addContact(Contact a) {
        curContact.add(a);
    }

    @Override
    public Iterator iterator() {
        return curContact.iterator();
    }

    @Override
    public void forEach(Consumer action) {
        curContact.forEach(action);
    }
}
