package X;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: X.8Zp  reason: invalid class name and case insensitive filesystem */
public final class C175758Zp extends C175778Zr {
    public final AtomicReferenceArray A00 = new AtomicReferenceArray(AnonymousClass79Y.A01);

    public C175758Zp(C175758Zp r3, int i, long j) {
        super(r3, i, j);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SemaphoreSegment[id=");
        A0o.append(this.A00);
        C18280x3.A1G(A0o, ", hashCode=", this);
        return AnonymousClass0x2.A0f(A0o);
    }
}
