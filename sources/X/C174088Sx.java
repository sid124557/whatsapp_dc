package X;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: X.8Sx  reason: invalid class name and case insensitive filesystem */
public abstract class C174088Sx extends AbstractCollection implements Serializable {
    public static final Object[] A00 = AnonymousClass4L0.A0U();

    public int A02() {
        if ((this instanceof AnonymousClass6WU) || (this instanceof AnonymousClass6WR)) {
            return 0;
        }
        if (this instanceof AnonymousClass6WQ) {
            AnonymousClass6WQ r2 = (AnonymousClass6WQ) this;
            return r2.zzc.A02() + r2.A00;
        }
        throw C18320x8.A0m();
    }

    public Object[] A03() {
        if (this instanceof AnonymousClass6WU) {
            return ((AnonymousClass6WU) this).A03;
        }
        if (this instanceof AnonymousClass6WR) {
            return ((AnonymousClass6WR) this).A01;
        }
        if (this instanceof AnonymousClass6WQ) {
            return ((AnonymousClass6WQ) this).zzc.A03();
        }
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

    @Deprecated
    public final void clear() {
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
        Object[] objArr2;
        int i;
        int A02;
        objArr.getClass();
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] A03 = A03();
            if (A03 == null) {
                if (length != 0) {
                    objArr = Arrays.copyOf(objArr, 0);
                }
                objArr = Arrays.copyOf(objArr, size);
            } else {
                int A022 = A02();
                if (this instanceof AnonymousClass6WU) {
                    A02 = ((AnonymousClass6WU) this).A02;
                } else if (this instanceof AnonymousClass6WR) {
                    A02 = ((AnonymousClass6WR) this).A00;
                } else if (this instanceof AnonymousClass6WQ) {
                    AnonymousClass6WQ r2 = (AnonymousClass6WQ) this;
                    A02 = r2.zzc.A02() + r2.A00 + r2.A01;
                } else {
                    throw C18320x8.A0m();
                }
                return Arrays.copyOfRange(A03, A022, A02, objArr.getClass());
            }
        } else if (length > size) {
            objArr[size] = null;
        }
        if (this instanceof AnonymousClass6WT) {
            objArr[0] = ((AnonymousClass6WT) this).A00;
        } else {
            if (this instanceof AnonymousClass6WU) {
                AnonymousClass6WU r3 = (AnonymousClass6WU) this;
                objArr2 = r3.A03;
                i = r3.A02;
            } else {
                AnonymousClass6WS r32 = (AnonymousClass6WS) this;
                if (r32 instanceof AnonymousClass6WR) {
                    AnonymousClass6WR r33 = (AnonymousClass6WR) r32;
                    objArr2 = r33.A01;
                    i = r33.A00;
                } else {
                    int size2 = r32.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        objArr[i2] = r32.get(i2);
                    }
                }
            }
            System.arraycopy(objArr2, 0, objArr, 0, i);
            return objArr;
        }
        return objArr;
    }

    public final Object[] toArray() {
        return toArray(A00);
    }
}
