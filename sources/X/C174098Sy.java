package X;

import android.os.Parcel;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.8Sy  reason: invalid class name and case insensitive filesystem */
public abstract class C174098Sy<E> extends AbstractCollection<E> implements Serializable {
    public static final Object[] EMPTY_ARRAY = AnonymousClass4L0.A0U();

    public abstract boolean contains(Object obj);

    public abstract int copyIntoArray(Object[] objArr, int i);

    public abstract boolean isPartialView();

    public abstract C172878Nf iterator();

    public static C129586aY A00(Parcel parcel, ClassLoader classLoader) {
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, classLoader);
        return C129586aY.copyOf((Collection) arrayList);
    }

    public Object[] internalArray() {
        return null;
    }

    @Deprecated
    public final boolean add(Object obj) {
        throw C18320x8.A0m();
    }

    @Deprecated
    public final boolean addAll(Collection collection) {
        throw C18320x8.A0m();
    }

    public C129586aY asList() {
        if (isEmpty()) {
            return C129586aY.of();
        }
        return C129586aY.asImmutableList(toArray());
    }

    @Deprecated
    public final void clear() {
        throw C18320x8.A0m();
    }

    public int internalArrayEnd() {
        throw C18320x8.A0m();
    }

    public int internalArrayStart() {
        throw C18320x8.A0m();
    }

    @Deprecated
    public final boolean remove(Object obj) {
        throw C18320x8.A0m();
    }

    @Deprecated
    public final boolean removeAll(Collection collection) {
        throw C18320x8.A0m();
    }

    @Deprecated
    public final boolean retainAll(Collection collection) {
        throw C18320x8.A0m();
    }

    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] internalArray = internalArray();
            if (internalArray != null) {
                return C161517pp.copy(internalArray, internalArrayStart(), internalArrayEnd(), objArr);
            }
            objArr = C161507po.newArray(objArr, size);
        } else if (length > size) {
            objArr[size] = null;
        }
        copyIntoArray(objArr, 0);
        return objArr;
    }

    public Object writeReplace() {
        return new AnonymousClass8L2(toArray());
    }

    public final Object[] toArray() {
        return toArray(EMPTY_ARRAY);
    }
}
