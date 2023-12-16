package X;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: X.8T3  reason: invalid class name */
public final class AnonymousClass8T3 extends AbstractList<String> implements C188188yU, RandomAccess {
    public final C188188yU A00;

    public final Object BBr(int i) {
        return this.A00.BBr(i);
    }

    public final List Btl() {
        return this.A00.Btl();
    }

    public final C188188yU Btm() {
        return this;
    }

    public final /* synthetic */ Object get(int i) {
        return this.A00.get(i);
    }

    public final Iterator iterator() {
        return new C172908Ni(this);
    }

    public final ListIterator listIterator(int i) {
        return new AnonymousClass8OI(this, i);
    }

    public final int size() {
        return this.A00.size();
    }

    public AnonymousClass8T3(C188188yU r1) {
        this.A00 = r1;
    }
}
