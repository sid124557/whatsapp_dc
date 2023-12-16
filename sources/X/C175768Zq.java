package X;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: X.8Zq  reason: invalid class name and case insensitive filesystem */
public final class C175768Zq extends C175778Zr {
    public final AtomicReferenceArray A00 = new AtomicReferenceArray(C1462879o.A01 * 2);
    public final AnonymousClass8PR A01;

    public final void A07(int i, boolean z) {
        if (z) {
            AnonymousClass8PR r4 = this.A01;
            C162457s7.A0H(r4);
            r4.A0D((this.A00 * ((long) C1462879o.A01)) + ((long) i));
        }
        A04();
    }

    public final boolean A08(int i, Object obj, Object obj2) {
        return AnonymousClass71W.A00(obj, obj2, this.A00, (i * 2) + 1);
    }

    public C175768Zq(AnonymousClass8PR r3, C175768Zq r4, int i, long j) {
        super(r4, i, j);
        this.A01 = r3;
    }
}
