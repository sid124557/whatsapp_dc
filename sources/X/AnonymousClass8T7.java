package X;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: X.8T7  reason: invalid class name */
public class AnonymousClass8T7 extends AbstractList<String> implements C188208yW, RandomAccess {
    public final C188208yW A00;

    public Object BBr(int i) {
        return this.A00.BBr(i);
    }

    public List BE2() {
        return this.A00.BE2();
    }

    public C188208yW BE3() {
        return this;
    }

    public /* bridge */ /* synthetic */ Object get(int i) {
        return this.A00.get(i);
    }

    public Iterator iterator() {
        return new C172938Nl(this);
    }

    public ListIterator listIterator(int i) {
        return new AnonymousClass8OK(this, i);
    }

    public int size() {
        return this.A00.size();
    }

    public AnonymousClass8T7(C188208yW r1) {
        this.A00 = r1;
    }

    public void AwJ(C172548Lq r2) {
        throw C18320x8.A0m();
    }
}
