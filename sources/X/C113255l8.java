package X;

import java.util.Collection;

/* renamed from: X.5l8  reason: invalid class name and case insensitive filesystem */
public abstract class C113255l8 implements AnonymousClass655 {
    public final AnonymousClass655[] A00;

    public boolean B2s(AnonymousClass654 r7, Collection collection, int i) {
        C162457s7.A0J(collection, 1);
        for (AnonymousClass655 r0 : this.A00) {
            if (r0 != null && r0.B2s(r7, collection, i)) {
                return true;
            }
        }
        return false;
    }

    public C113255l8(AnonymousClass655... r1) {
        this.A00 = r1;
    }
}
