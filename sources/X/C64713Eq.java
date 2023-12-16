package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.3Eq  reason: invalid class name and case insensitive filesystem */
public class C64713Eq implements AnonymousClass49Y {
    public final AtomicReference A00 = new AtomicReference("D");

    public C64713Eq(C29441ip r3) {
        r3.A06(this);
    }

    public void BPq(C59622xD r3) {
        String str = "D";
        if (r3.A01) {
            if (r3.A03) {
                str = "M";
            } else if (r3.A04) {
                str = "W";
            }
        }
        this.A00.set(str);
    }
}
