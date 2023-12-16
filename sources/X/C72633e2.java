package X;

import java.util.Iterator;

/* renamed from: X.3e2  reason: invalid class name and case insensitive filesystem */
public final class C72633e2 implements AnonymousClass4C5 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass4C5 A02;

    public C72633e2(AnonymousClass4C5 r1, int i, int i2) {
        this.A02 = r1;
        this.A00 = i;
        this.A01 = i2;
    }

    public Iterator iterator() {
        return AnonymousClass2A5.A00(this.A02.iterator(), this.A00, this.A01);
    }
}
