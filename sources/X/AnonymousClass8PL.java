package X;

import java.util.Iterator;

/* renamed from: X.8PL  reason: invalid class name */
public final class AnonymousClass8PL implements AnonymousClass4C5 {
    public final AnonymousClass4GQ A00;
    public final AnonymousClass4C5 A01;
    public final boolean A02;

    public Iterator iterator() {
        return new AnonymousClass8OF(this);
    }

    public AnonymousClass8PL(AnonymousClass4GQ r1, AnonymousClass4C5 r2, boolean z) {
        this.A01 = r2;
        this.A02 = z;
        this.A00 = r1;
    }
}
