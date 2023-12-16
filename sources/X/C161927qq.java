package X;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.7qq  reason: invalid class name and case insensitive filesystem */
public final class C161927qq {
    public static void populateMap(Map map, ObjectInputStream objectInputStream, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            map.put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    public static void populateMultiset(C188168yS r3, ObjectInputStream objectInputStream, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            r3.add(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    public static C157907j7 getFieldSetter(Class cls, String str) {
        try {
            return new C157907j7(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e) {
            throw AnonymousClass0x9.A0i(e);
        }
    }

    public static int readCount(ObjectInputStream objectInputStream) {
        return objectInputStream.readInt();
    }

    public static void writeMap(Map map, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(map.size());
        Iterator A0q = AnonymousClass000.A0q(map);
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            objectOutputStream.writeObject(A0w.getKey());
            objectOutputStream.writeObject(A0w.getValue());
        }
    }

    public static void writeMultimap(C185838uK r2, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(r2.asMap().size());
        Iterator A0q = AnonymousClass000.A0q(r2.asMap());
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            objectOutputStream.writeObject(A0w.getKey());
            objectOutputStream.writeInt(((Collection) A0w.getValue()).size());
            for (Object writeObject : (Collection) A0w.getValue()) {
                objectOutputStream.writeObject(writeObject);
            }
        }
    }

    public static void writeMultiset(C188168yS r2, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(r2.entrySet().size());
        for (C153177an r1 : r2.entrySet()) {
            objectOutputStream.writeObject(r1.getElement());
            objectOutputStream.writeInt(r1.getCount());
        }
    }
}
