package X;

/* renamed from: X.6ak  reason: invalid class name and case insensitive filesystem */
public final class C129706ak<E> extends C129526aS<E> {
    public static final C129706ak EMPTY;
    public static final Object[] EMPTY_ARRAY;
    public final transient Object[] elements;
    public final transient int hashCode;
    public final transient int mask;
    public final transient int size;
    public final transient Object[] table;

    public boolean contains(Object obj) {
        Object[] objArr = this.table;
        if (obj != null && objArr.length != 0) {
            int smearedHash = C159347lg.smearedHash(obj);
            while (true) {
                int i = smearedHash & this.mask;
                Object obj2 = objArr[i];
                if (obj2 == null) {
                    break;
                } else if (obj2.equals(obj)) {
                    return true;
                } else {
                    smearedHash = i + 1;
                }
            }
        }
        return false;
    }

    public int copyIntoArray(Object[] objArr, int i) {
        System.arraycopy(this.elements, 0, objArr, i, this.size);
        return i + this.size;
    }

    public C129586aY createAsList() {
        return C129586aY.asImmutableList(this.elements, this.size);
    }

    public int hashCode() {
        return this.hashCode;
    }

    public Object[] internalArray() {
        return this.elements;
    }

    public int internalArrayEnd() {
        return this.size;
    }

    public int internalArrayStart() {
        return 0;
    }

    public boolean isHashCodeFast() {
        return true;
    }

    public boolean isPartialView() {
        return false;
    }

    public int size() {
        return this.size;
    }

    static {
        Object[] A0U = AnonymousClass4L0.A0U();
        EMPTY_ARRAY = A0U;
        EMPTY = new C129706ak(A0U, 0, A0U, 0, 0);
    }

    public C129706ak(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.elements = objArr;
        this.hashCode = i;
        this.table = objArr2;
        this.mask = i2;
        this.size = i3;
    }

    public C172878Nf iterator() {
        return asList().iterator();
    }
}
