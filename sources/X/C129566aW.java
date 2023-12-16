package X;

import java.util.Objects;

/* renamed from: X.6aW  reason: invalid class name and case insensitive filesystem */
public class C129566aW<E> extends C129586aY<E> {
    public static final C129586aY EMPTY = new C129566aW(new Object[0], 0);
    public final transient Object[] array;
    public final transient int size;

    public int copyIntoArray(Object[] objArr, int i) {
        System.arraycopy(this.array, 0, objArr, i, this.size);
        return i + this.size;
    }

    public Object get(int i) {
        C162187rP.A01(i, this.size);
        Object obj = this.array[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    public Object[] internalArray() {
        return this.array;
    }

    public int internalArrayEnd() {
        return this.size;
    }

    public int internalArrayStart() {
        return 0;
    }

    public boolean isPartialView() {
        return false;
    }

    public int size() {
        return this.size;
    }

    public C129566aW(Object[] objArr, int i) {
        this.array = objArr;
        this.size = i;
    }
}
