package X;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.6af  reason: invalid class name and case insensitive filesystem */
public class C129656af extends C129386aE implements C185838uK {
    public static final long serialVersionUID = 0;
    public final transient C129526aS emptySet = emptySet((Comparator) null);

    public C129656af(AnonymousClass8OQ r2, int i, Comparator comparator) {
        super(r2, i);
    }

    public static C129656af copyOf(C185838uK r2, Comparator comparator) {
        r2.getClass();
        if (r2.isEmpty()) {
            return of();
        }
        if (r2 instanceof C129656af) {
            return (C129656af) r2;
        }
        return fromMapEntries(r2.asMap().entrySet(), (Comparator) null);
    }

    public static C129656af fromMapEntries(Collection collection, Comparator comparator) {
        if (collection.isEmpty()) {
            return of();
        }
        C160667o6 r5 = new C160667o6(collection.size());
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(it);
            Object key = A0w.getKey();
            C129526aS valueSet = valueSet((Comparator) null, (Collection) A0w.getValue());
            if (!valueSet.isEmpty()) {
                r5.put(key, valueSet);
                i += valueSet.size();
            }
        }
        return new C129656af(r5.build(), i, (Comparator) null);
    }

    public static C129626ac builder() {
        return new C129626ac();
    }

    public static C129526aS emptySet(Comparator comparator) {
        if (comparator == null) {
            return C129526aS.of();
        }
        return C129736an.emptySet(comparator);
    }

    public static C129656af of() {
        return C129646ae.INSTANCE;
    }

    public static C129496aP valuesBuilder(Comparator comparator) {
        if (comparator == null) {
            return new C129496aP();
        }
        return new C129666ag(comparator);
    }

    public C129526aS get(Object obj) {
        Object obj2 = this.map.get(obj);
        C129526aS r0 = this.emptySet;
        if (obj2 == null) {
            if (r0 != null) {
                obj2 = r0;
            } else {
                throw AnonymousClass001.A0g("Both parameters are null");
            }
        }
        return (C129526aS) obj2;
    }

    public Comparator valueComparator() {
        C129526aS r1 = this.emptySet;
        if (r1 instanceof C129736an) {
            return ((C129736an) r1).comparator();
        }
        return null;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            C160667o6 builder = AnonymousClass8OQ.builder();
            int i = 0;
            int i2 = 0;
            while (i < readInt) {
                Object readObject = objectInputStream.readObject();
                int readInt2 = objectInputStream.readInt();
                if (readInt2 > 0) {
                    C129496aP valuesBuilder = valuesBuilder(comparator);
                    int i3 = 0;
                    do {
                        valuesBuilder.add(objectInputStream.readObject());
                        i3++;
                    } while (i3 < readInt2);
                    C129526aS build = valuesBuilder.build();
                    if (build.size() == readInt2) {
                        builder.put(readObject, build);
                        i2 += readInt2;
                        i++;
                    } else {
                        String valueOf = String.valueOf(readObject);
                        throw new InvalidObjectException(AnonymousClass000.A0V("Duplicate key-value pairs exist for key ", valueOf, AnonymousClass6CA.A0Y(valueOf.length() + 40)));
                    }
                } else {
                    throw new InvalidObjectException(AnonymousClass000.A0Y("Invalid value count ", AnonymousClass6CA.A0Y(31), readInt2));
                }
            }
            try {
                C1459978e.MAP_FIELD_SETTER.set((Object) this, (Object) builder.build());
                C1459978e.SIZE_FIELD_SETTER.set((Object) this, i2);
                AnonymousClass777.EMPTY_SET_FIELD_SETTER.set((Object) this, (Object) emptySet(comparator));
            } catch (IllegalArgumentException e) {
                throw new InvalidObjectException(e.getMessage()).initCause(e);
            }
        } else {
            throw new InvalidObjectException(AnonymousClass000.A0Y("Invalid key count ", AnonymousClass6CA.A0Y(29), readInt));
        }
    }

    public static C129526aS valueSet(Comparator comparator, Collection collection) {
        return C129526aS.copyOf(collection);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(valueComparator());
        C161927qq.writeMultimap(this, objectOutputStream);
    }

    public static C129656af copyOf(C185838uK r1) {
        return copyOf(r1, (Comparator) null);
    }
}
