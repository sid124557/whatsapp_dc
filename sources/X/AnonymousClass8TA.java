package X;

import java.util.AbstractList;
import java.util.RandomAccess;

/* renamed from: X.8TA  reason: invalid class name */
public final class AnonymousClass8TA extends AbstractList<AnonymousClass8Lk> implements RandomAccess {
    public static final AnonymousClass7V3 A02 = new AnonymousClass7V3();
    public final int[] A00;
    public final AnonymousClass8Lk[] A01;

    public static final AnonymousClass8TA A00(AnonymousClass8Lk... r1) {
        return A02.A00(r1);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null || (obj instanceof AnonymousClass8Lk)) {
            return super.contains(obj);
        }
        return false;
    }

    public /* bridge */ /* synthetic */ Object get(int i) {
        return this.A01[i];
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj == null || (obj instanceof AnonymousClass8Lk)) {
            return super.indexOf(obj);
        }
        return -1;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj == null || (obj instanceof AnonymousClass8Lk)) {
            return super.lastIndexOf(obj);
        }
        return -1;
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null || (obj instanceof AnonymousClass8Lk)) {
            return super.remove(obj);
        }
        return false;
    }

    public final /* bridge */ int size() {
        return this.A01.length;
    }

    public AnonymousClass8TA(int[] iArr, AnonymousClass8Lk[] r2) {
        this.A01 = r2;
        this.A00 = iArr;
    }
}
