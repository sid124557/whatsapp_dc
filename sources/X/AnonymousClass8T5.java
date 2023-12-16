package X;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: X.8T5  reason: invalid class name */
public final class AnonymousClass8T5 extends AbstractList<String> implements C188198yV, RandomAccess {
    public final C188198yV A00;

    public final Object Btc(int i) {
        return this.A00.Btc(i);
    }

    public final List Btv() {
        return this.A00.Btv();
    }

    public final C188198yV Bu0() {
        return this;
    }

    public final /* synthetic */ Object get(int i) {
        return this.A00.get(i);
    }

    public final Iterator iterator() {
        return new C172918Nj(this);
    }

    public final ListIterator listIterator(int i) {
        return new AnonymousClass8OJ(this, i);
    }

    public final int size() {
        return this.A00.size();
    }

    public AnonymousClass8T5(C188198yV r1) {
        this.A00 = r1;
    }

    public final void BtL(C172538Lp r2) {
        throw C18320x8.A0m();
    }
}
