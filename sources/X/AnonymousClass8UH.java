package X;

import java.util.Iterator;

/* renamed from: X.8UH  reason: invalid class name */
public final class AnonymousClass8UH extends C152977aT implements Iterator, C834348j {
    public /* bridge */ /* synthetic */ Object next() {
        A00();
        int i = this.A01;
        AnonymousClass8OR r1 = this.A03;
        if (i < r1.length) {
            this.A01 = i + 1;
            this.A02 = i;
            AnonymousClass8OP r0 = new AnonymousClass8OP(r1, i);
            A01();
            return r0;
        }
        throw AnonymousClass6CA.A0c();
    }

    public AnonymousClass8UH(AnonymousClass8OR r1) {
        super(r1);
    }
}
