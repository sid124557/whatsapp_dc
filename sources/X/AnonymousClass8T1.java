package X;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: X.8T1  reason: invalid class name */
public final class AnonymousClass8T1 extends AbstractList implements C188178yT, RandomAccess {
    public final C188178yT A00;

    public final C188178yT Btz() {
        return this;
    }

    public final List Bu6() {
        return this.A00.Bu6();
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((AnonymousClass6VA) this.A00).get(i);
    }

    public final Iterator iterator() {
        return new C172898Nh(this);
    }

    public final ListIterator listIterator(int i) {
        return new AnonymousClass8OH(this, i);
    }

    public final int size() {
        return this.A00.size();
    }

    public AnonymousClass8T1(C188178yT r1) {
        this.A00 = r1;
    }
}
