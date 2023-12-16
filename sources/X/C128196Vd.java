package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6Vd  reason: invalid class name and case insensitive filesystem */
public final class C128196Vd<E> extends AnonymousClass8T2<E> {
    public static final C128196Vd A01;
    public final List A00;

    static {
        C128196Vd r1 = new C128196Vd();
        A01 = r1;
        r1.A00 = false;
    }

    public final Object get(int i) {
        return this.A00.get(i);
    }

    public final int size() {
        return this.A00.size();
    }

    public C128196Vd(List list) {
        this.A00 = list;
    }

    public final /* synthetic */ C188228yY BuC(int i) {
        if (i >= size()) {
            ArrayList A0I = AnonymousClass002.A0I(i);
            A0I.addAll(this.A00);
            return new C128196Vd(A0I);
        }
        throw AnonymousClass6CA.A0N();
    }

    public final void add(int i, Object obj) {
        A02();
        this.A00.add(i, obj);
        this.modCount++;
    }

    public final Object remove(int i) {
        A02();
        Object remove = this.A00.remove(i);
        this.modCount++;
        return remove;
    }

    public final Object set(int i, Object obj) {
        A02();
        Object obj2 = this.A00.set(i, obj);
        this.modCount++;
        return obj2;
    }

    public C128196Vd() {
        this(AnonymousClass002.A0I(10));
    }
}
