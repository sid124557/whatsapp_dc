package X;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6Zw  reason: invalid class name */
public class AnonymousClass6Zw extends C129296a5 {
    public static final long serialVersionUID = 0;
    public transient C181318mZ factory;

    public List createCollection() {
        return (List) this.factory.get();
    }

    public AnonymousClass6Zw(Map map, C181318mZ r2) {
        super(map);
        this.factory = r2;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.factory = (C181318mZ) objectInputStream.readObject();
        setMap((Map) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.factory);
        objectOutputStream.writeObject(backingMap());
    }

    public Map createAsMap() {
        return createMaybeNavigableAsMap();
    }

    public Set createKeySet() {
        return createMaybeNavigableKeySet();
    }
}
