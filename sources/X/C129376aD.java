package X;

import com.google.common.base.Strings;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;

/* renamed from: X.6aD  reason: invalid class name and case insensitive filesystem */
public abstract class C129376aD<E> extends C174078Sw<E> implements Serializable {
    public static final long serialVersionUID = 0;
    public transient C162347rk backingMap = newBackingMap(3);
    public transient long size;

    public C129376aD(int i) {
    }

    public final Iterator elementIterator() {
        return new C188928zi(this, 0);
    }

    public final Iterator entryIterator() {
        return new C188928zi(this, 1);
    }

    public abstract C162347rk newBackingMap(int i);

    public final int add(Object obj, int i) {
        if (i == 0) {
            return count(obj);
        }
        boolean z = true;
        if (AnonymousClass001.A1W(i)) {
            int indexOf = this.backingMap.indexOf(obj);
            C162347rk r0 = this.backingMap;
            if (indexOf == -1) {
                r0.put(obj, i);
                this.size += (long) i;
                return 0;
            }
            int value = r0.getValue(indexOf);
            long j = (long) i;
            long j2 = ((long) value) + j;
            if (j2 > 2147483647L) {
                z = false;
            }
            if (z) {
                this.backingMap.setValue(indexOf, (int) j2);
                this.size += j;
                return value;
            }
            Object[] A0L = AnonymousClass002.A0L();
            AnonymousClass000.A1Q(A0L, 0, j2);
            throw AnonymousClass001.A0c(Strings.A00("too many occurrences: %s", A0L));
        }
        Object[] objArr = new Object[1];
        AnonymousClass000.A1P(objArr, i, 0);
        throw AnonymousClass001.A0c(Strings.A00("occurrences cannot be negative: %s", objArr));
    }

    public void addTo(C188168yS r4) {
        C162347rk r0 = this.backingMap;
        int firstIndex = r0.firstIndex();
        while (firstIndex >= 0) {
            r4.add(r0.getKey(firstIndex), this.backingMap.getValue(firstIndex));
            r0 = this.backingMap;
            firstIndex = r0.nextIndex(firstIndex);
        }
    }

    public final void clear() {
        this.backingMap.clear();
        this.size = 0;
    }

    public final int count(Object obj) {
        return this.backingMap.get(obj);
    }

    public final int distinctElements() {
        return this.backingMap.size();
    }

    public final int remove(Object obj, int i) {
        if (i == 0) {
            return count(obj);
        }
        int i2 = 0;
        if (AnonymousClass001.A1W(i)) {
            int indexOf = this.backingMap.indexOf(obj);
            if (indexOf != -1) {
                i2 = this.backingMap.getValue(indexOf);
                if (i2 > i) {
                    this.backingMap.setValue(indexOf, i2 - i);
                } else {
                    this.backingMap.removeEntry(indexOf);
                    i = i2;
                }
                this.size -= (long) i;
            }
            return i2;
        }
        Object[] A0L = AnonymousClass002.A0L();
        AnonymousClass000.A1P(A0L, i, 0);
        throw AnonymousClass001.A0c(Strings.A00("occurrences cannot be negative: %s", A0L));
    }

    public final boolean setCount(Object obj, int i, int i2) {
        long j;
        long j2;
        C160937oh.checkNonnegative(i, "oldCount");
        C160937oh.checkNonnegative(i2, "newCount");
        int indexOf = this.backingMap.indexOf(obj);
        if (indexOf == -1) {
            if (i == 0) {
                if (i2 > 0) {
                    this.backingMap.put(obj, i2);
                    j = this.size;
                }
                return true;
            }
            return false;
        }
        if (this.backingMap.getValue(indexOf) == i) {
            C162347rk r0 = this.backingMap;
            if (i2 == 0) {
                r0.removeEntry(indexOf);
                j2 = this.size - ((long) i);
                this.size = j2;
                return true;
            }
            r0.setValue(indexOf, i2);
            j = this.size;
            i2 -= i;
        }
        return false;
        j2 = j + ((long) i2);
        this.size = j2;
        return true;
    }

    public final int size() {
        return C159357lh.A01(this.size);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readCount = C161927qq.readCount(objectInputStream);
        this.backingMap = newBackingMap(3);
        C161927qq.populateMultiset(this, objectInputStream, readCount);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        C161927qq.writeMultiset(this, objectOutputStream);
    }

    public final Iterator iterator() {
        return C162067rA.iteratorImpl(this);
    }
}
