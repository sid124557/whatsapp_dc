package X;

import java.util.AbstractList;
import java.util.List;

/* renamed from: X.8T9  reason: invalid class name */
public abstract class AnonymousClass8T9<E> extends AbstractList<E> implements List<E>, C85384Ga {
    public abstract void add(int i, Object obj);

    public abstract Object set(int i, Object obj);

    public int A01() {
        if (!(this instanceof AnonymousClass8U9)) {
            return ((AnonymousClass8U8) this).A00.size();
        }
        AnonymousClass8U9 r0 = (AnonymousClass8U9) this;
        r0.A05();
        return r0.length;
    }

    public Object A02(int i) {
        if (this instanceof AnonymousClass8U9) {
            AnonymousClass8U9 r1 = (AnonymousClass8U9) this;
            r1.A06();
            r1.A05();
            AnonymousClass347.A01(i, r1.length);
            return r1.A04(r1.offset + i);
        }
        AnonymousClass8U8 r0 = (AnonymousClass8U8) this;
        return r0.A00.remove(AnonymousClass8UE.A0i(r0, i));
    }

    public final /* bridge */ Object remove(int i) {
        return A02(i);
    }

    public final /* bridge */ int size() {
        return A01();
    }
}
