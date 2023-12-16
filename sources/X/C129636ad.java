package X;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.6ad  reason: invalid class name and case insensitive filesystem */
public class C129636ad extends C129386aE implements C187918y1 {
    public static final long serialVersionUID = 0;

    public static C129616ab builder() {
        return new C129616ab();
    }

    public static C129636ad of() {
        return C129596aZ.INSTANCE;
    }

    public C129586aY get(Object obj) {
        C129586aY r0 = (C129586aY) this.map.get(obj);
        if (r0 == null) {
            return C129586aY.of();
        }
        return r0;
    }

    public C129636ad(AnonymousClass8OQ r1, int i) {
        super(r1, i);
    }

    public static C129636ad fromMapEntries(Collection collection, Comparator comparator) {
        if (collection.isEmpty()) {
            return of();
        }
        C160667o6 r5 = new C160667o6(collection.size());
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(it);
            Object key = A0w.getKey();
            C129586aY copyOf = C129586aY.copyOf((Collection) A0w.getValue());
            if (!copyOf.isEmpty()) {
                r5.put(key, copyOf);
                i += copyOf.size();
            }
        }
        return new C129636ad(r5.build(), i);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            C160667o6 builder = AnonymousClass8OQ.builder();
            int i = 0;
            int i2 = 0;
            while (i < readInt) {
                Object readObject = objectInputStream.readObject();
                int readInt2 = objectInputStream.readInt();
                if (readInt2 > 0) {
                    C129486aO builder2 = C129586aY.builder();
                    int i3 = 0;
                    do {
                        builder2.add(objectInputStream.readObject());
                        i3++;
                    } while (i3 < readInt2);
                    builder.put(readObject, builder2.build());
                    i2 += readInt2;
                    i++;
                } else {
                    throw new InvalidObjectException(AnonymousClass000.A0Y("Invalid value count ", AnonymousClass6CA.A0Y(31), readInt2));
                }
            }
            try {
                C1459978e.MAP_FIELD_SETTER.set((Object) this, (Object) builder.build());
                C1459978e.SIZE_FIELD_SETTER.set((Object) this, i2);
            } catch (IllegalArgumentException e) {
                throw new InvalidObjectException(e.getMessage()).initCause(e);
            }
        } else {
            throw new InvalidObjectException(AnonymousClass000.A0Y("Invalid key count ", AnonymousClass6CA.A0Y(29), readInt));
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        C161927qq.writeMultimap(this, objectOutputStream);
    }
}
