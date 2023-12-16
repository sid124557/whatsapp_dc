package X;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: X.3fq  reason: invalid class name and case insensitive filesystem */
public class C73643fq extends C71953cw implements ListIterator, C834348j {
    public final /* synthetic */ C73683fu A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73643fq(C73683fu r2, int i) {
        super(r2);
        this.A00 = r2;
        AnonymousClass347.A02(i, r2.size());
        this.A00 = i;
    }

    public boolean hasPrevious() {
        return AnonymousClass001.A1W(this.A00);
    }

    public int previousIndex() {
        return this.A00 - 1;
    }

    public void add(Object obj) {
        throw C18290x4.A0x();
    }

    public int nextIndex() {
        return this.A00;
    }

    public Object previous() {
        if (hasPrevious()) {
            C73683fu r1 = this.A00;
            int i = this.A00 - 1;
            this.A00 = i;
            return r1.get(i);
        }
        throw new NoSuchElementException();
    }

    public void set(Object obj) {
        throw C18290x4.A0x();
    }
}
