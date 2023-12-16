package X;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: X.8U9  reason: invalid class name */
public final class AnonymousClass8U9<E> extends AnonymousClass8T9<E> implements List<E>, RandomAccess, Serializable, C85384Ga {
    public static final AnonymousClass8U9 A00;
    public Object[] array;
    public final AnonymousClass8U9 backing;
    public boolean isReadOnly;
    public int length;
    public int offset;
    public final AnonymousClass8U9 root;

    static {
        AnonymousClass8U9 r1 = new AnonymousClass8U9(0);
        r1.isReadOnly = true;
        A00 = r1;
    }

    public boolean addAll(int i, Collection collection) {
        C162457s7.A0J(collection, 1);
        A06();
        A05();
        AnonymousClass347.A02(i, this.length);
        int size = collection.size();
        A0A(collection, this.offset + i, size);
        return AnonymousClass001.A1W(size);
    }

    public Iterator iterator() {
        return listIterator(0);
    }

    public boolean removeAll(Collection collection) {
        C162457s7.A0J(collection, 0);
        A06();
        A05();
        if (A03(collection, this.offset, this.length, false) > 0) {
            return true;
        }
        return false;
    }

    public boolean retainAll(Collection collection) {
        C162457s7.A0J(collection, 0);
        A06();
        A05();
        if (A03(collection, this.offset, this.length, true) <= 0) {
            return false;
        }
        return true;
    }

    public List subList(int i, int i2) {
        AnonymousClass347.A03(i, i2, this.length);
        Object[] objArr = this.array;
        int i3 = this.offset + i;
        int i4 = i2 - i;
        boolean z = this.isReadOnly;
        AnonymousClass8U9 r2 = this.root;
        if (r2 == null) {
            r2 = this;
        }
        return new AnonymousClass8U9(this, r2, objArr, i3, i4, z);
    }

    public Object[] toArray(Object[] objArr) {
        C162457s7.A0J(objArr, 0);
        A05();
        int length2 = objArr.length;
        int i = this.length;
        Object[] objArr2 = this.array;
        int i2 = this.offset;
        int i3 = i + i2;
        if (length2 < i) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr2, i2, i3, objArr.getClass());
            C162457s7.A0D(copyOfRange);
            return copyOfRange;
        }
        C18260x0.A0O(objArr2, objArr);
        System.arraycopy(objArr2, i2, objArr, 0, i3 - i2);
        int i4 = this.length;
        if (i4 >= length2) {
            return objArr;
        }
        objArr[i4] = null;
        return objArr;
    }

    private final Object writeReplace() {
        AnonymousClass8U9 r0;
        if (this.isReadOnly || ((r0 = this.root) != null && r0.isReadOnly)) {
            return new C172328Ko(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    public final int A03(Collection collection, int i, int i2, boolean z) {
        int i3;
        AnonymousClass8U9 r0 = this.backing;
        if (r0 != null) {
            i3 = r0.A03(collection, i, i2, z);
        } else {
            int i4 = 0;
            int i5 = 0;
            while (i4 < i2) {
                int i6 = i + i4;
                if (collection.contains(this.array[i6]) == z) {
                    Object[] objArr = this.array;
                    i4++;
                    objArr[i5 + i] = objArr[i6];
                    i5++;
                } else {
                    i4++;
                }
            }
            i3 = i2 - i5;
            Object[] objArr2 = this.array;
            int i7 = i2 + i;
            int i8 = this.length;
            C18260x0.A0O(objArr2, objArr2);
            System.arraycopy(objArr2, i7, objArr2, i + i5, i8 - i7);
            Object[] objArr3 = this.array;
            int i9 = this.length;
            AnonymousClass75Z.A00(objArr3, i9 - i3, i9);
        }
        if (i3 > 0) {
            this.modCount++;
        }
        this.length -= i3;
        return i3;
    }

    public final Object A04(int i) {
        this.modCount++;
        AnonymousClass8U9 r0 = this.backing;
        if (r0 != null) {
            this.length--;
            return r0.A04(i);
        }
        Object[] objArr = this.array;
        Object obj = objArr[i];
        int i2 = i + 1;
        System.arraycopy(objArr, i2, objArr, i, (this.offset + this.length) - i2);
        Object[] objArr2 = this.array;
        C162457s7.A0J(objArr2, 0);
        objArr2[(this.offset + this.length) - 1] = null;
        this.length--;
        return obj;
    }

    public final void A05() {
        AnonymousClass8U9 r0 = this.root;
        if (r0 != null && r0.modCount != this.modCount) {
            throw new ConcurrentModificationException();
        }
    }

    public final void A06() {
        AnonymousClass8U9 r0;
        if (this.isReadOnly || ((r0 = this.root) != null && r0.isReadOnly)) {
            throw C18320x8.A0m();
        }
    }

    public final void A07(int i, int i2) {
        int i3 = this.length + i2;
        if (i3 >= 0) {
            Object[] objArr = this.array;
            int length2 = objArr.length;
            if (i3 > length2) {
                objArr = Arrays.copyOf(objArr, AnonymousClass347.A00(length2, i3));
                C162457s7.A0D(objArr);
                this.array = objArr;
            }
            System.arraycopy(objArr, i, objArr, i + i2, (this.offset + this.length) - i);
            this.length += i2;
            return;
        }
        throw new OutOfMemoryError();
    }

    public final void A08(int i, int i2) {
        if (i2 > 0) {
            this.modCount++;
        }
        AnonymousClass8U9 r0 = this.backing;
        if (r0 != null) {
            r0.A08(i, i2);
        } else {
            Object[] objArr = this.array;
            int i3 = i + i2;
            int i4 = this.length;
            C18260x0.A0O(objArr, objArr);
            System.arraycopy(objArr, i3, objArr, i, i4 - i3);
            Object[] objArr2 = this.array;
            int i5 = this.length;
            AnonymousClass75Z.A00(objArr2, i5 - i2, i5);
        }
        this.length -= i2;
    }

    public final void A09(int i, Object obj) {
        this.modCount++;
        AnonymousClass8U9 r1 = this.backing;
        if (r1 != null) {
            r1.A09(i, obj);
            this.array = this.backing.array;
            this.length++;
            return;
        }
        A07(i, 1);
        this.array[i] = obj;
    }

    public final void A0A(Collection collection, int i, int i2) {
        this.modCount++;
        AnonymousClass8U9 r0 = this.backing;
        if (r0 != null) {
            r0.A0A(collection, i, i2);
            this.array = this.backing.array;
            this.length += i2;
            return;
        }
        A07(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.array[i + i3] = it.next();
        }
    }

    public AnonymousClass8U9(AnonymousClass8U9 r2, AnonymousClass8U9 r3, Object[] objArr, int i, int i2, boolean z) {
        this.array = objArr;
        this.offset = i;
        this.length = i2;
        this.isReadOnly = z;
        this.backing = r2;
        this.root = r3;
        if (r2 != null) {
            this.modCount = r2.modCount;
        }
    }

    public void add(int i, Object obj) {
        A06();
        A05();
        AnonymousClass347.A02(i, this.length);
        A09(this.offset + i, obj);
    }

    public void clear() {
        A06();
        A05();
        A08(this.offset, this.length);
    }

    public boolean equals(Object obj) {
        A05();
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        Object[] objArr = this.array;
        int i = this.offset;
        int i2 = this.length;
        if (i2 != list.size()) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (!C162457s7.A0P(objArr[i + i3], list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    public Object get(int i) {
        A05();
        AnonymousClass347.A01(i, this.length);
        return this.array[this.offset + i];
    }

    public int hashCode() {
        A05();
        Object[] objArr = this.array;
        int i = this.offset;
        int i2 = this.length;
        int i3 = 1;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 = (i3 * 31) + C18280x3.A04(objArr[i + i4]);
        }
        return i3;
    }

    public int indexOf(Object obj) {
        A05();
        for (int i = 0; i < this.length; i++) {
            if (C162457s7.A0P(this.array[this.offset + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        A05();
        return AnonymousClass000.A1T(this.length);
    }

    public int lastIndexOf(Object obj) {
        A05();
        int i = this.length;
        do {
            i--;
            if (i < 0) {
                return -1;
            }
        } while (!C162457s7.A0P(this.array[this.offset + i], obj));
        return i;
    }

    public ListIterator listIterator(int i) {
        A05();
        AnonymousClass347.A02(i, this.length);
        return new AnonymousClass8OM(this, i);
    }

    public boolean remove(Object obj) {
        A06();
        A05();
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public Object set(int i, Object obj) {
        A06();
        A05();
        AnonymousClass347.A01(i, this.length);
        Object[] objArr = this.array;
        int i2 = this.offset + i;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public String toString() {
        A05();
        Object[] objArr = this.array;
        int i = this.offset;
        int i2 = this.length;
        StringBuilder A0Y = AnonymousClass6CA.A0Y((i2 * 3) + 2);
        A0Y.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                AnonymousClass001.A1M(A0Y);
            }
            Object obj = objArr[i + i3];
            if (obj == this) {
                A0Y.append("(this Collection)");
            } else {
                A0Y.append(obj);
            }
        }
        String A0f = AnonymousClass000.A0f(A0Y);
        C162457s7.A0D(A0f);
        return A0f;
    }

    public AnonymousClass8U9() {
        this(10);
    }

    public boolean add(Object obj) {
        A06();
        A05();
        A09(this.offset + this.length, obj);
        return true;
    }

    public boolean addAll(Collection collection) {
        C162457s7.A0J(collection, 0);
        A06();
        A05();
        int size = collection.size();
        A0A(collection, this.offset + this.length, size);
        return AnonymousClass001.A1W(size);
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    public Object[] toArray() {
        A05();
        Object[] objArr = this.array;
        int i = this.offset;
        int i2 = this.length + i;
        C162457s7.A0J(objArr, 0);
        int length2 = objArr.length;
        if (i2 <= length2) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr, i, i2);
            C162457s7.A0D(copyOfRange);
            return copyOfRange;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("toIndex (");
        A0o.append(i2);
        A0o.append(") is greater than size (");
        A0o.append(length2);
        throw new IndexOutOfBoundsException(AnonymousClass000.A0X(").", A0o));
    }

    public AnonymousClass8U9(int i) {
        this((AnonymousClass8U9) null, (AnonymousClass8U9) null, new Object[i], 0, 0, false);
    }
}
